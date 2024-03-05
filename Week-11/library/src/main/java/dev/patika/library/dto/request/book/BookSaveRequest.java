package dev.patika.library.dto.request.book;

import dev.patika.library.entities.Category;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSaveRequest {

    @NotNull(message = "Kitap adi bos veya null olamaz")
    private String name;
    @NotNull(message = "Yayin tarihi bos veya null olamaz")
    private int publicationYear;
    @NotNull(message = "Stok sayisi bos veya null olamaz")
    private int stock;
    private int authorId;
    private int publisherId;
    private List<Category> categoryList;

}
