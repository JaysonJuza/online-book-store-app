package onlinebookstoreapp.repository;

import java.util.List;
import onlinebookstoreapp.model.Book;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
