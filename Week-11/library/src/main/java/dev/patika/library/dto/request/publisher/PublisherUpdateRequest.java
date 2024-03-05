package dev.patika.library.dto.request.publisher;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherUpdateRequest {

    @Positive(message = "Id degeri pozitif olmali")
    private int id;
    @NotNull(message = "Yayinevi adi bos olamaz")
    private String name;
    @NotNull(message = "Yayinevi adresi bos olamaz")
    private String address;
    @NotNull(message = "Yayin tarihi bos olamaz")
    private int establishmentYear;
}
