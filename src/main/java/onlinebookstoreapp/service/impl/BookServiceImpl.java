package onlinebookstoreapp.service.impl;

import java.util.List;
import onlinebookstoreapp.dto.BookDto;
import onlinebookstoreapp.dto.CreateBookRequestDto;
import onlinebookstoreapp.exception.EntityNotFoundException;
import onlinebookstoreapp.mapper.BookMapper;
import onlinebookstoreapp.model.Book;
import onlinebookstoreapp.repository.BookRepository;
import onlinebookstoreapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public BookDto save(CreateBookRequestDto requestDto) {
        Book book = bookMapper.toBookModel(requestDto);
        return bookMapper.toDtoModel(bookRepository.save(book));
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toDtoModel)
                .toList();
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Book by id: " + id + " not found!"));
        return bookMapper.toDtoModel(book);
    }
}
