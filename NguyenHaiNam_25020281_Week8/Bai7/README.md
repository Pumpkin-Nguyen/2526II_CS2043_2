## Các lớp tương đương của tham số price
| Loại phân vùng | Khoảng giá trị | Trạng thái | Mô tả |
| :--- | :--- | :--- | :--- |
| **Lớp 1** | $price < 0$ | Không hợp lệ | Hệ thống ném `IllegalArgumentException` |
| **Lớp 2** | $0 \le price < 100$ | Hợp lệ | Hưởng mức chiết khấu thấp (5% cho Member, 15% cho VIP) |
| **Lớp 3** | $price \ge 100$ | Hợp lệ | Hưởng mức chiết khấu cao (10% cho Member, 20% cho VIP) |

## Test case theo EP
| Mã TC | Mô tả | price | memberType | Kết quả mong đợi |
| :--- | :--- | :--- | :--- | :--- |
| **TC01** | Kiểm tra giá trị âm | -10.0 | MEMBER | IllegalArgumentException |
| **TC02** | Price nhỏ, loại GUEST | 50.0 | GUEST | Discount = 0% |
| **TC03** | Price nhỏ, loại MEMBER | 50.0 | MEMBER | Discount = 5% |
| **TC04** | Price nhỏ, loại VIP | 50.0 | VIP | Discount = 15% |
| **TC05** | Price lớn, loại GUEST | 150.0 | GUEST | Discount = 0% |
| **TC06** | Price lớn, loại MEMBER | 150.0 | MEMBER | Discount = 10% |
| **TC07** | Price lớn, loại VIP | 150.0 | VIP | Discount = 20% |
| **TC08** | memberType không hợp lệ | 100.0 | GOLD | IllegalArgumentException |

## Áp dụng BVA
### Các giá trị tại biên trái `price = 0`:
- **min-**: -0.1
- **min**: 0
- **min+**: 0.1

### Các giá trị tại biên phải `price = 100`:
- **max-**: 99.9
- **max**: 100
- **max+**: 100.1

## Áp dụng 2-way Combinatorial Testing
| STT | Price (Đại diện) | MemberType | Kết quả dự kiến |
| :--- | :--- | :--- | :--- |
| 1 | -10.0 | GUEST | Exception |
| 2 | -10.0 | MEMBER | Exception |
| 3 | -10.0 | VIP | Exception |
| 4 | -10.0 | INVALID | Exception |
| 5 | 50.0 | GUEST | 0% |
| 6 | 50.0 | MEMBER | 5% |
| 7 | 50.0 | VIP | 15% |
| 8 | 50.0 | INVALID | Exception |
| 9 | 150.0 | GUEST | 0% |
| 10 | 150.0 | MEMBER | 10% |
| 11 | 150.0 | VIP | 20% |
| 12 | 150.0 | INVALID | Exception |