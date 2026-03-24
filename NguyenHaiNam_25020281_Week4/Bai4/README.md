# Lỗi xuất hiện khi biên dịch?

`Bai4/src/Main.java:11: error: show() in DataManager cannot implement show() in IData
    void show() {
         ^
  attempting to assign weaker access privileges; was public
1 error`

- Phạm vi truy cập của show() trong DataManager không đồng nhất với hàm mẫu show() trong interface IData.

# Giải thích sau khi sửa lỗi?
- Khi khai báo các hàm trong interface, tất cả đều có phạm vi truy cập mặc định là public và abstract.
- Quy tắc ghi đè: Khi override 1 hàm từ lớp cha hoặc interface, không được phép hạ thấp phạm vi truy cập của hàm gốc.
=> Luôn thêm public vào các hàm được khai báo tại interface.