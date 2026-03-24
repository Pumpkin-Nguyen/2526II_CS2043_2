# <T extends Comparable<T>>
- Cho phép sử dụng hàm compareTo() để so sánh 2 đối tượng kiểu T bất kỳ.

```java
(array[j].compareTo(array[j + 1]) > 0)

```

- compareTo() trả về: 
  + 1 số dương > 0 nếu array[j] lớn hơn array[j + 1]
  + 0 nếu array[j] bằng array[j + 1]
  + 1 số âm < 0 nếu array[j] nhỏ hơn array[j + 1]