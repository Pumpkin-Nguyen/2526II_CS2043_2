package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    // Khởi tạo Logger cho lớp này
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int divide(int a, int b) {
        // Yêu cầu: Sử dụng INFO và Parameterized Logging ({})
        logger.info("Bắt đầu thực hiện phép chia {} cho {}", a, b);
        
        try {
            int result = a / b;
            logger.info("Phép tính thành công. Kết quả là: {}", result);
            return result;
        } catch (ArithmeticException e) {
            // Yêu cầu: Sử dụng ERROR để xử lý ngoại lệ
            logger.error("Đã xảy ra lỗi khi chia cho 0: {}", e.getMessage());
            throw e;
        }
    }
}