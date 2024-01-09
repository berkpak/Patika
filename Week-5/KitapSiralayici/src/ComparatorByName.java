import java.util.Comparator;

public class ComparatorByName implements Comparator<Book> {
    // Comparator interfaces
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
