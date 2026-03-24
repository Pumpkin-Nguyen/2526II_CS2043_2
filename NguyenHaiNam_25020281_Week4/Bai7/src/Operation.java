@FunctionalInterface // Đảm bảo interface chỉ có duy nhất 1 hàm abstract
interface Operation<T> {
    T excute(T a, T b);
}
