# 1. Hàm deposit
## Test case theo EP
| Mã TC                           | Mô tả          | amount | Kết quả mong đợi |
|:--------------------------------|:---------------|:-------|:-----------------|
| **deposit_validAmount_success** | Amount > 0     | 30     | void             |

## Test case theo BVA
| Mã TC                         | Mô tả      | amount | Kết quả mong đợi         |
|:------------------------------|:-----------|:-------|:-------------------------|
| **deposit_amountEqual0_fail** | Amount = 0 | 0      | IllegalArgumentException |
| **deposit_amountBelow0_fail** | Amount < 0 | -1     | IllegalArgumentException |

# 2. Hàm withdraw
## Test case theo EP
| Mã TC                               | Mô tả                     | amount | Kết quả mong đợi |
|:------------------------------------|:--------------------------|:-------|:-----------------|
| **withdraw_validAmount_success**    | 0 < Amount < balance 500) | 30     | true             |
| **withdraw_greaterBalance_success** | Amount > balance (500)    | 501    | false            |

## Test case theo BVA
| Mã TC                          | Mô tả      | amount | Kết quả mong đợi         |
|:-------------------------------|:-----------|:-------|:-------------------------|
| **withdraw_amountEqual0_fail** | Amount = 0 | 0      | IllegalArgumentException |
| **withdraw_amountBelow0_fail** | Amount < 0 | -1     | IllegalArgumentException |