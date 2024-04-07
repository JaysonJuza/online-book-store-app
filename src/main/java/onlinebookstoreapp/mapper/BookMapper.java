package onlinebookstoreapp.mapper;

import onlinebookstoreapp.config.MapperConfig;
import onlinebookstoreapp.dto.BookDto;
import onlinebookstoreapp.dto.CreateBookRequestDto;
import onlinebookstoreapp.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDtoModel(Book book);

    Book toBookModel(CreateBookRequestDto requestDto);
}
