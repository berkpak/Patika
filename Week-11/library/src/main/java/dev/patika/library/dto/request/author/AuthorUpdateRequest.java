package dev.patika.library.dto.request.author;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorUpdateRequest {

    @Positive(message = "Id degeri pozsitif olmali")
    private int id;
    @NotNull(message = "Yazar adi bos olamaz")
    private String name;
    @NotNull(message = "Ulke bos olamaz")
    private String country;
    private LocalDate birthDate;
}
