import java.util.Comparator;

public class IdComparator implements Comparator<LibraryItem> {

    @Override
    public int compare(LibraryItem o1, LibraryItem o2) {
        return Integer.parseInt(o1.getTitle())-Integer.parseInt(o2.getTitle());
    }
}
