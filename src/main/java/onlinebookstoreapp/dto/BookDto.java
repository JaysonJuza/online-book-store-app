package onlinebookstoreapp.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {
    private Long id;
    private String title;
    private String author;
    private BigDecimal isbn;
    private BigDecimal price;
    private String description;
    private String coverImage;
}
