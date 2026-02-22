public class Magazine extends LibraryItem{
    @Override
    public int compareTo(LibraryItem o) {
        return this.getTitle().compareTo(o.getTitle());
    }

}
