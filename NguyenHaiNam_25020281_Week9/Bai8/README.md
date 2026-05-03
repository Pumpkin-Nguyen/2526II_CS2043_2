## Target folder
- `target` là thư mục chứa những file output mặc định của Maven. Trong đó chứa các file được generate ra (class file, report file, .jar file,...).

## `Package` phase
- Maven hoạt động dựa trên 1 vòng lệnh chặt chẽ. Khi pha `package` được gọi, nó sẽ chủ động gọi các pha trước đó là `validate`, `compile` và `test`. Cuối cùng, pha `package` sẽ compile các file java, và đóng gói vào 1 file jar duy nhất.