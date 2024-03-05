package dev.patika.library.dto.request.bookBorrow;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowUpdateRequest {
    @Positive(message = "Id degeri pozitif olmali")
    private int id;
    @NotNull(message = "Isim bos olamaz")
    private String borrowerName;
    @NotNull(message = "Mail bos olamaz")
    private String borrowerEmail;
    private LocalDate borrowingDate;
    private LocalDate returnDate;
    private int bookId;
}
