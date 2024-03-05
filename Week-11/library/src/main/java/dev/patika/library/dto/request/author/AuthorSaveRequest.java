package dev.patika.library.dto.request.author;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorSaveRequest {

    @NotNull(message = "Yazar adi bos olamaz")
    private String name;
    @NotNull(message = "Ulke bos olamaz")
    private String country;
    private LocalDate birthDate;

}
