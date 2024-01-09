import java.util.Comparator;

public class Book implements Comparable {
    private String name;
    private int page;

    //Comparable interfaceden gelen compareTo metodunu override yap
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Book(String name, int page) {
        this.name = name;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

}
