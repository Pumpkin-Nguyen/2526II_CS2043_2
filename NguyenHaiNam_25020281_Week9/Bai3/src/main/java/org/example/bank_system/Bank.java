package org.example.bai2.bank_system;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lớp quản lý hệ thống ngân hàng và danh sách khách hàng.
 */
public class Bank {

  private static final Logger logger = LoggerFactory.getLogger(Bank.class);

  private List<Customer> customerList;

  public Bank() {
    this.customerList = new ArrayList<>();
  }

  public List<Customer> getCustomerList() {
    return customerList;
  }

  /**
   * Thiết lập danh sách khách hàng cho ngân hàng.
   *
   * @param customerList Danh sách khách hàng mới.
   */
  public void setCustomerList(List<Customer> customerList) {
    if (customerList == null) {
      this.customerList = new ArrayList<>();
    } else {
      this.customerList = customerList;
    }
  }

  /**
   * Đọc danh sách khách hàng và tài khoản từ luồng dữ liệu (InputStream).
   *
   * @param inputStream Luồng dữ liệu đầu vào.
   */
  public void readCustomerList(InputStream inputStream) {
    logger.info("Bắt đầu đọc dữ liệu khách hàng từ InputStream...");
    if (inputStream == null) {
      logger.warn("InputStream bị null, dừng quá trình đọc dữ liệu.");
      return;
    }

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      Customer currentCustomer = null;

      while ((line = reader.readLine()) != null) {
        line = line.trim();
        if (line.isEmpty()) {
          continue;
        }

        int lastSpaceIndex = line.lastIndexOf(' ');
        if (lastSpaceIndex > 0) {
          String token = line.substring(lastSpaceIndex + 1).trim();

          if (token.matches("\\d{9}")) {
            String name = line.substring(0, lastSpaceIndex).trim();
            currentCustomer = new Customer(Long.parseLong(token), name);
            customerList.add(currentCustomer);
            logger.info("Thêm mới khách hàng: {}", name);
          } else if (currentCustomer != null) {
            String[] parts = line.split("\\s+");
            if (parts.length >= 3) {
              long accountNumber = Long.parseLong(parts[0]);
              double balance = Double.parseDouble(parts[2]);

              if (Account.CHECKING_TYPE.equals(parts[1])) {
                currentCustomer.addAccount(new CheckingAccount(accountNumber, balance));
              } else if (Account.SAVINGS_TYPE.equals(parts[1])) {
                currentCustomer.addAccount(new SavingsAccount(accountNumber, balance));
              }
            }
          }
        }
      }
    } catch (Exception e) {
      logger.error("Lỗi khi đọc file cấu hình khách hàng: ", e);
    }
  }

  public String getCustomersInfoByIdOrder() {
    Collections.sort(customerList, Comparator.comparingLong(Customer::getIdNumber));

    StringBuilder resultBuilder = new StringBuilder();
    for (int i = 0; i < customerList.size(); i++) {
      resultBuilder.append(customerList.get(i).getCustomerInfo());
      if (i < customerList.size() - 1) {
        resultBuilder.append("\n");
      }
    }
    return resultBuilder.toString();
  }

  public String getCustomersInfoByNameOrder() {
    List<Customer> copyList = new ArrayList<>(customerList);
    Collections.sort(
        copyList,
        (c1, c2) -> {
          int compareName = c1.getFullName().compareTo(c2.getFullName());
          return compareName != 0 ? compareName : Long.compare(c1.getIdNumber(), c2.getIdNumber());
        });

    StringBuilder resultBuilder = new StringBuilder();
    for (Customer customer : copyList) {
      resultBuilder.append(customer.getCustomerInfo()).append("\n");
    }
    return resultBuilder.toString().trim();
  }
}
