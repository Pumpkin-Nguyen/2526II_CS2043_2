- Nâng cấp JUnit 5.9.2: Xoá bỏ thư viện junit:junit:4.10 để tránh tình trạng xung đột thư viện và thay thế bằng junit-jupiter:5.9.2.

- Giải quyết lỗi tương thích Java: File pom.xml cũ đang sử dụng Java 1.8. Tuy nhiên, các thư viện Logback 1.4+ và Hibernate 6.2+ đều yêu cầu môi trường chạy tối thiểu là Java 11 (Phổ biến nhất hiện nay là Java 17). Nếu giữ nguyên Java 8, quá trình build sẽ báo lỗi "Unsupported class file major version". Giải pháp là nâng cấp <maven.compiler.source> và <maven.compiler.target> lên 17.

- Bổ sung maven-surefire-plugin: Để đảm bảo thư viện Junit 5 hoạt động, cần khai báo thêm plugin maven-surefire-plugin (phiên bản 3.1.2 trở lên) vì plugin mặc định của Maven bản cũ không nhận diện được JUnit 5 (JUnit Platform).

- Đồng bộ cấu hình maven-compiler-plugin: Nâng cấp version của plugin này từ 3.1 lên 3.11.0 và đổi tag configuration thành 17 để đồng bộ với properties của dự án.