# 1. Hàm max
## Test case theo EP
| Mã TC    | Mô tả          | a | b | Kết quả mong đợi |
|:---------|:---------------|:--|:--|:-----------------|
| **TC01** | Kiểm tra a < b | 3 | 5 | b = 5            |
| **TC02** | Kiểm tra a = b | 5 | 5 | a = b = 5        |
| **TC03** | Kiểm tra a > b | 7 | 2 | a = 7            |

## Test case theo BVA
| Mã TC    | Mô tả          | a                 | b | Kết quả mong đợi      |
|:---------|:---------------|:------------------|:--|:----------------------|
| **TC04** | Biên trái      | Integer.MAX_VALUE | 5 | a = Integer.MAX_VALUE |
| **TC05** | Biên phải       | Integer.MIN_VALUE| 7 | a = 7                 |

# 2. Hàm divide
## Test case theo EP
| Mã TC    | Mô tả          | a | b  | Kết quả mong đợi                    |
|:---------|:---------------|:--|:---|:------------------------------------|
| **TC06** | Kiểm tra b > 0 | 3 | 1  | 3                                   |
| **TC07** | Kiểm tra b < 0 | 5 | -2 | -2                                  |
| **TC08** | Kiểm tra b = 0 | 2 | 0  | IllegalArgumentException            |
