## Đoạn A
- Mysterious name: Tên các biến t, h, r, m không rõ ý nghĩa.
- Magic number: Không rõ ý nghĩa của số 0.9.
-> Code rất khó hiểu, bảo trì và nhớ ý nghĩa logic của các biến, gây khó khăn cho bản thân và người khác đọc hiểu.
=> Refactor: Đặt lại tên các biến có ý nghĩa và tạo biến cụ thể cho số 0.9.

## Đoạn B
- Big class: Class đang thực hiện quá nhiều nhiệm vụ khác nhau (gửi email, render UI, xuất file, quản lý dữ liệu). (vi phạm Single Responsibility)
-> Code khó bảo trì khi các tính năng cần sự thay đổi. Ví dụ cần thay đổi định dạng File, ta lại phải vào chỉnh sửa trong class User (vi phạm tính Open/Closed).
=> Refactor: Tách các nhiệm vụ thành các class con (EmailService, UserRender, UserExporter) riêng biệt.

## Đoạn C
- Code smell: Đoạn if-else quá dài. Các thuộc tính không phù hợp với tất cả các trường hợp (hình tròn chỉ cần 1 tham số a, tham số b bị thừa). Sử dụng số PI thủ công.
-> Mỗi khi cần thêm 1 hình mới, ta lại cần vào đoạn code này để thêm dòng điều kiện mới (vi phạm tính Open/Closed). Bên cạnh, khi cần tính diện tích các hình không cần đến 2 tham số, ta không biết nên truyền giá trị gì vào b. Số PI có thể chưa chính xác, đầy đủ dẫn đến kết quả bị chênh lệch.
=> Refactor: Replace Conditional with Polymorphism (Thay thế điều kiện bằng tính đa hình). Tạo 1 interface Shape, tất cả các hình sẽ cài đặt giao diện này. Khi cần thêm 1 hình mới, ta chỉ cần tạo 1 class mới, đảm bảo tính Open/Closed. Sử dụng hằng PI của thư viện Math.

## Đoạn D
- Code smell: Các thuộc tính không cùng nhóm chủ đề.
-> Phải lặp lại các thuộc tính này nếu có 1 class khác cần dùng. Danh sách các thuộc tính không khoa học, khó bảo trì.
=> Refactor: Extract class - nhóm các thuộc tính cùng chủ đề Author thành 1 class riêng.