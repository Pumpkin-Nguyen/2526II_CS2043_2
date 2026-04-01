
| Cấu trúc dữ liệu | Tìm kiếm (theo ID) | Thêm mới | Xóa (theo ID) | Đặc điểm                                          |
|------------------|--------------------|----------|---------------|---------------------------------------------------|
| ArrayList        | O(n)               | O(1)     | O(n)          | Phải duyệt từ đầu nên chậm                        |
| HashMap          | O(1)               | O(1)     | O(1)          | Sử dụng hàm băm nên truy cập rất nhanh            |
| TreeMap          | O(log n)           | O(log n) | O(log n)      | Luôn tự sắp xếp lại theo Key nên chậm hơn HashMap |

-   **Số lượng sách nhỏ:** **ArrayList** là lựa chọn phù hợp vì đơn giản, tốn ít bộ nhớ và sự khác biệt về tốc độ ở (n) nhỏ là không đáng kể.

-   **Số lượng sách rất lớn:** **HashMap** là phù hợp nhất do tốc độ tìm kiếm O(1), giúp chương trình trả lại kết quả ngay lập tức dù có nhiều cuốn sách.

-   **Cần dữ liệu được sắp xếp theo ID:** **TreeMap** là lựa chọn duy nhất vì tự động duy trì sắp xếp Key (Id) mỗi khi thêm hoặc xóa.

### Vì sao hashmap thường tìm kiếm nhanh hơn arraylist?
- 