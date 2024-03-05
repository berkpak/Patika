package dev.patika.library.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "bookBorrows")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrow_id", columnDefinition = "serial")
    private int id;
    @Column(name = "borrow_name")
    private String borrowerName;
    @Column(name = "borrow_mail")
    private String borrowerEmail;
    @Temporal(TemporalType.DATE)
    @Column(name = "borrow_date")
    private LocalDate borrowingDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "borrow_return_date")
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "borrow_book_id" ,referencedColumnName = "book_id")
    private Book book;

}
