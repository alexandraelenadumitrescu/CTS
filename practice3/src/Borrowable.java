public interface Borrowable {
    void borrowItem()throws ItemNotAvailableException;
    void returnItem();
}
