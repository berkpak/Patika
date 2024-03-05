package dev.patika.library.dto.response.publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherResponse {

    private int id;
    private int establishmentYear;
    private String name;
    private String address;


}
