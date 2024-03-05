package dev.patika.library.dto.request.book;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookUpdateRequest {

    @Positive(message = "Id degeri pozitif olmalidir")
    private int id;
    @NotNull(message = "Yayin tarihi bos veya null olamaz")
    private int publicationYear;
    @NotNull(message = "Stok sayisi bos veya null olamaz")
    private int stock;
    @NotNull(message = "Kitap adi bos veya null olamaz")
    private String name;
    private int authorId;
    private int publisherId;
}
