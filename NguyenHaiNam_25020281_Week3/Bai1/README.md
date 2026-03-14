# Kết quả chạy

- Input: (No input)
- Output: 
1. Person is created
2. Employee is created
3. Manager is created

- Giải thích: Khi khởi tạo lớp con, hàm constructor của các hàm cha cũng sẽ được chạy từ cao xuống dưới nhằm đảm bảo cho các thuộc tính của các lớp cha được khởi tạo trước.
# Sau khi sửa class Person

- Class Employee và Manager đều báo lỗi.
- Vì khi trong các lớp con, hàm khai báo không gọi tới super() thì Java sẽ tự động chèn hàm super() (không chứa tham số) vào dòng đầu tiên.
- Khi ta viết hàm constructor chứa tham số của Person, lúc này, lớp Employee gọi super() (không chứa tham số) nhưng bên trong Person không còn hàm constructor nào khớp lệnh đó; từ đó, lỗi phiên dịch.
