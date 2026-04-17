# Vấn đề của `Fuel` và `batteryPercent`
- Các thuộc tính trên được thừa kế nhưng thừa thãi, không được sử dụng ở lớp con.
- Giải pháp: Tạo các class con trung gian là GasVehicle và ElectricVehicle chứa các thuộc tính cần thiết.\

# Vấn đề của phương thức getInfo()
- Các phương thức gần như giống hệt nhau theo mẫu, chỉ thay đổi tên của phương tiện.
- Giải pháp: Khai báo phương thức chung getInfo() chứa 1 mẫu String, ta chỉ cần gọi hàm này và truyền tham số là tên của phuơng tiện.