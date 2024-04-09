package onlinebookstoreapp.service;

import java.util.List;
import onlinebookstoreapp.dto.BookDto;
import onlinebookstoreapp.dto.CreateBookRequestDto;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto findById(Long id);
}
