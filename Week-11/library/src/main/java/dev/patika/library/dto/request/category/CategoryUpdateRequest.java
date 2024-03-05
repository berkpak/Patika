package dev.patika.library.dto.request.category;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryUpdateRequest {

    @Positive
    private int id;
    @NotNull(message = "Kategori adi bos vey null olamaz")
    private String Name;
    private String description;
}
