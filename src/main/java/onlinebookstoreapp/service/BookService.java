package onlinebookstoreapp.service;

import java.util.List;
import onlinebookstoreapp.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
