package dev.patika.library.dto.response.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {

    private int id;
    private int publicationYear;
    private int stock;
    private String name;
    private int authorId;
    private int publisherId;
}
