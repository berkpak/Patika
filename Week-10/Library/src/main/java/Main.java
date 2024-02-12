import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        //Author
        Author author = new Author();
        author.setName("George R. R. Martin");
        author.setCountry("USA");
        author.setBirthDate(LocalDate.of(1948, 9, 20));
        entityManager.persist(author);

        //Publisher
        Publisher publisher = new Publisher();
        publisher.setName("Epsilon");
        publisher.setAddress("Istanbul");
        publisher.setEstablishmentYear(2019);
        entityManager.persist(publisher);

        //Category
        Category fantasyLiterature = new Category();
        fantasyLiterature.setName("Fantasy Literature");
        fantasyLiterature.setDescription("test");
        entityManager.persist(fantasyLiterature);

        Category novel = new Category();
        novel.setName("Novel");
        novel.setDescription("test");
        entityManager.persist(novel);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(fantasyLiterature);
        categoryList.add(novel);

        //Book
        Book book = new Book();
        book.setName("Fire & Blood");
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setCategoryList(categoryList);
        book.setStock(10);
        book.setPublicationYear(2018);
        entityManager.persist(book);

        //BookBorrow
        BookBorrowing bookBorrowing = new BookBorrowing();
        bookBorrowing.setBorrowerName("Test");
        bookBorrowing.setBook(book);
        bookBorrowing.setBorrowingDate(LocalDate.of(2024,2,9));
        bookBorrowing.setReturnDate(LocalDate.of(2024,2,16));
        entityManager.persist(bookBorrowing);

        transaction.commit();
    }
}
