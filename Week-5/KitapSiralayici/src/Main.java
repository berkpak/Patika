import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Book sinifindan yeni kitap nesnesi uret
        Book newBook1 = new Book("Yuzuklerin Efendisi",1000,"J.R.R Tolkien","1954");
        Book newBook2 = new Book("Sherlock Holmes",400,"Arthur Conan Doyle","1887");
        Book newBook3 = new Book("Dune",600,"Frank Herbert","1965");
        Book newBook4 = new Book("Narnia Gunlukleri",900,"Clive Staples Lewis","1950");
        Book newBook5 = new Book("Harry Potter",500,"J. K. Rowling","1997");

        //bookPage adinda set yapisinda sakla
        TreeSet<Book> bookPage = new TreeSet<>(new ComparatorByPage());

        //bookpage.add(new Book("y",100));
        bookPage.add(newBook1);
        bookPage.add(newBook2);
        bookPage.add(newBook3);
        bookPage.add(newBook4);
        bookPage.add(newBook5);

        System.out.println("-----------------------------");
        System.out.println("Sayfa sayisina gore siralama");
        System.out.println();
        //Kitaplari saya sayisina gore sirala
        for(Book book : bookPage){
            System.out.println(book.getName() + " - " + book.getPage() + " - " + book.getAuthor() +" "+ book.getReleaseDate());
        }

        //bookName adinda set yapisinda sakla
        TreeSet<Book> bookName = new TreeSet<>();

        //bookName.add(new Book("Yuzuklerin Efendisi",100));
        bookName.add(newBook1);
        bookName.add(newBook2);
        bookName.add(newBook3);
        bookName.add(newBook4);
        bookName.add(newBook5);

        System.out.println("-----------------------------");
        System.out.println("Kitap adina gore siralama");
        System.out.println();
        //Kitaplari isme gore sirala
        for (Book book2 : bookName){
            System.out.println(book2.getName()+" - " + book2.getPage() + " - " + book2.getAuthor() +" "+ book2.getReleaseDate());
        }
    }
}