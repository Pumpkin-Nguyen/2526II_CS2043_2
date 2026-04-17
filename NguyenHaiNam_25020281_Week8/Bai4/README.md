# Các bước refactor
## v1
- Bước 1: Chuyển logic tính phí của mỗi ticket về thành 1 phương thức calculateFee() trong ParkingTicket.
- Bước 2: Chuyển logic tính bonus point của mỗi ticket về thành 1 phương thức calculateBonusPoint() trong ParkingTicket.
- Bước 3: Tạo thêm 2 phương thức calculateTotalFee() và calculateBonusPoint() trong ParkingCustomer nhằm loại bỏ hoàn toàn việc tính toán login trong receipt().
(Thêm 2 vòng lặp là có thể đánh đổi cho sự gọn gàng, dễ bảo trì của code)
- Bước 4: Sinh dữ liệu mẫu và Test thử.

## v2
- Bước 1: Chuyển class Vehicle thành abstract class, xoá bỏ thuộc tính type, thay vào đó, mỗi loại xe sẽ tạo 1 class con riêng biệt.
- Bước 2: Thêm hàm trừu tượng calculateFee() sẽ được khai báo sao cho phù hợp với từng loại xe, thêm hàm calculateBonusPoints() mặc định trả về 1.
- Bước 3: Tạo 3 class con tương ứng với từng loại xe: Car, Bike, Truck cùng hàm calculateFee() và calculateBonusPoints() phù hợp.
- Bước 4: ParkingTicket chỉ cần gọi các hàm trên của từng xe trong calculateFee() và calculateBonusPoints().
- Bước 5: Sinh dữ liệu mẫu và Test thử.