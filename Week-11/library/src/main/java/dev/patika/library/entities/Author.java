package dev.patika.library.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "authors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",columnDefinition = "serial")
    private int id;
    @Column(name = "author_name")
    private String name;
    @Column(name = "author_country")
    private String country;
    @Temporal(TemporalType.DATE)
    @Column(name = "author_birth_date")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "author")
    private List<Book> bookList;

}
