## Test case theo EP
| Mã TC    | Mô tả                       | Gpa | Kết quả mong đợi |
|:---------|:----------------------------|:----|:-----------------|
| **TC01** | Kiểm tra 0 <= gpa < 5.0     | 3.3 | Yếu              |
| **TC02** | Kiểm tra 5.0 <= gpa < 6.5   | 5.9 | Trung bình       |
| **TC03** | Kiểm tra 6.5 <= gpa < 8.0   | 7   | Khá              |
| **TC04** | Kiểm tra 8.0 <= gpa <= 10.0 | 9.4 | Giỏi             |

## Test case theo BVA
| Mã TC    | Mô tả               | Gpa  | Kết quả mong đợi         |
|:---------|:--------------------|:-----|:-------------------------|
| **TC05** | Kiểm tra gpa = 0.0  | 0.0  | Yếu                      |
| **TC06** | Kiểm tra gpa < 0.0  | -0.1 | IllegalArgumentException |
| **TC07** | Kiểm tra gpa > 0.0  | 0.1  | Yếu                      |
| **TC08** | Kiểm tra gpa = 5.0  | 5.0  | Trung bình               |
| **TC09** | Kiểm tra gpa < 5.0  | 4.9  | Yếu                      |
| **TC10** | Kiểm tra gpa > 5.0  | 5.1  | Trung bình               |
| **TC11** | Kiểm tra gpa = 6.5  | 6.5  | Khá                      |
| **TC12** | Kiểm tra gpa < 6.5  | 6.4  | Trung bình               |
| **TC13** | Kiểm tra gpa > 6.5  | 6.6  | Khá                      |
| **TC14** | Kiểm tra gpa = 8.0  | 8.0  | Giỏi                     |
| **TC15** | Kiểm tra gpa < 8.0  | 7.9  | Khá                      |
| **TC16** | Kiểm tra gpa > 8.0  | 8.1  | Giỏi                     |
| **TC17** | Kiểm tra gpa = 10.0 | 10.0 | Giỏi                     |
| **TC18** | Kiểm tra gpa < 10.0 | 9.9  | Giỏi                     |
| **TC19** | Kiểm tra gpa > 10.0 | 10.1 | IllegalArgumentException |

## Các test case bị fail
- **TC08**: Gpa = 5.0 kết quả trả về Yếu, sai với giá trị mong muốn là Trung bình.
- **TC11**: Gpa = 6.5 kết quả trả về Khá, sai với giá trị mong muốn là Trung bình.
- Lỗi: So sánh tại các điểm biên đang bị sai. Các giá trị biên 5.0 hay 6.5 đang bị đẩy xuống nhóm điểm thấp hơn.

```
╷
├─ JUnit Platform Suite ✔
├─ JUnit Jupiter ✔
│  └─ GradeClassifierTest ✔
│     ├─ TC18_shouldReturnKha_whenGpaLessThan10() ✔
│     ├─ TC02_shouldReturnTrungBinh_whenGpaInRange5ToLessThan6_5() ✔
│     ├─ TC07_shouldReturnYeu_whenGpaGreaterThan0() ✔
│     ├─ TC13_shouldReturnKha_whenGpaGreaterThan6_5() ✔
│     ├─ TC19_shouldThrowException_whenGpaGreaterThan10() ✔
│     ├─ TC14_shouldReturnGioi_whenGpaEquals8() ✔
│     ├─ TC01_shouldReturnYeu_whenGpaInRange0ToLessThan5() ✔
│     ├─ TC15_shouldReturnKha_whenGpaLessThan8() ✔
│     ├─ TC04_shouldReturnGioi_whenGpaInRange8To10() ✔
│     ├─ TC16_shouldReturnGioi_whenGpaGreaterThan8() ✔
│     ├─ TC05_shouldReturnYeu_whenGpaEquals0() ✔
│     ├─ TC03_shouldReturnKha_whenGpaInRange6_5ToLessThan8() ✔
│     ├─ TC06_shouldThrowException_whenGpaLessThan0() ✔
│     ├─ TC11_shouldReturnKha_whenGpaEquals6_5() ✘ expected: <Khá> but was: <Trung bình>
│     ├─ TC09_shouldReturnYeu_whenGpaLessThan5() ✔
│     ├─ TC12_shouldReturnTrungBinh_whenGpaLessThan6_5() ✔
│     ├─ TC08_shouldReturnTrungBinh_whenGpaEquals5() ✘ expected: <Trung bình> but was: <Yếu>
│     ├─ TC17_shouldReturnGioi_whenGpaEquals10() ✔
│     └─ TC10_shouldReturnTrungBinh_whenGpaGreaterThan5() ✔
```
