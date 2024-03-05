package dev.patika.library.dto.request.bookBorrow;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowSaveRequest {

    @NotNull(message = "Isim bos olamaz")
    private String borrowerName;
    @NotNull(message = "Mail bos olamaz")
    private String borrowerEmail;
    private LocalDate borrowingDate;
    private LocalDate returnDate;
    private int bookId;
}
