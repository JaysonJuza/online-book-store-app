package onlinebookstoreapp.service.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import onlinebookstoreapp.dto.BookDto;
import onlinebookstoreapp.dto.CreateBookRequestDto;
import onlinebookstoreapp.exception.EntityNotFoundException;
import onlinebookstoreapp.mapper.BookMapper;
import onlinebookstoreapp.model.Book;
import onlinebookstoreapp.repository.BookRepository;
import onlinebookstoreapp.service.BookService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDto save(CreateBookRequestDto requestDto) {
        Book book = bookMapper.toModel(requestDto);
        return bookMapper.toDto(bookRepository.save(book));
    }

    @Override
    public List<BookDto> findAll() {
        return bookMapper.toListDto(bookRepository.findAll());
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Book by id: " + id + " not found!"));
        return bookMapper.toDto(book);
    }
}
