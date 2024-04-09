package onlinebookstoreapp.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class CreateBookRequestDto {
    private String title;
    private String author;
    private BigDecimal isbn;
    private BigDecimal price;
    private String description;
    private String coverImage;
}
