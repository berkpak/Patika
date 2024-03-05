package dev.patika.library.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id" , columnDefinition = "serial")
    private int id;

    @Column(name = "book_publication_year")
    private int publicationYear;

    @Column(name = "book_stock")
    private int stock;

    @Column(name = "book_name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_author_id",referencedColumnName = "author_id")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_publisher_id", referencedColumnName = "publisher_id")
    private Publisher publisher;

    @ManyToMany
    @JoinTable( name = "book2category",
            joinColumns = {
                    @JoinColumn(name = "book2cat_book_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "book2cat_category_id")
            }

    )
    private List<Category> categoryList;

    @OneToMany(mappedBy = "book")
    private List<BookBorrow> bookBorrowingList;
}
