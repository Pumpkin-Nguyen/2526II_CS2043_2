# Vấn đề của đoạn code
- Vi phạm nguyên tắc Open/Closed
- Khi cần thêm 1 đơn hàng mới, ta cần sửa ít nhất 2 chỗ tại hàm getDeliveryFee() và getLabel(), dẫn tới khả năng sai sót, thiếu cao.
- Các quy tắc logic của mỗi đơn hàng bị rải rác tại nhiều nơi, rất khó bảo trì sau này.

