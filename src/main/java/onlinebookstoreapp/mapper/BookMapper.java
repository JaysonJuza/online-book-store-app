package onlinebookstoreapp.mapper;

import java.util.List;
import onlinebookstoreapp.config.MapperConfig;
import onlinebookstoreapp.dto.BookDto;
import onlinebookstoreapp.dto.CreateBookRequestDto;
import onlinebookstoreapp.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);

    List<BookDto> toListDto(List<Book> books);
}
