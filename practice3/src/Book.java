public class Book extends LibraryItem implements Borrowable{

    @Override
    public int compareTo(LibraryItem o) {
        return this.getTitle().compareTo(o.getTitle());

    }

    @Override
    public void borrowItem() throws ItemNotAvailableException {
        if(this.isBorrowed()){
            throw new ItemNotAvailableException("cartea este deja imprumutata");
        }else{
            this.setBorrowed(true);
        }
    }

    @Override
    public void returnItem() {
        this.setBorrowed(false);
    }
}
