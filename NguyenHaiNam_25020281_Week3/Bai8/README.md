# Thử cho DroneRobot kế thừa cả Robot và ElectronicDevice. Kết quả là gì?
- Lỗi biên dịch. Java không cho phép 1 lớp con kế thừa từ nhiều lớp cha.

# Thay vì để ElectronicDevice là lớp trừu tượng, hãy chuyển nó thành Interface. Bây giờ hãy cho DroneRobot vừa extends Robot vừa implements Flyable, GPS, ElectronicDevice. Kết quả thế nào?
- Chạy bình thường. Java cho phép 1 lớp implements không giới hạn số interface.