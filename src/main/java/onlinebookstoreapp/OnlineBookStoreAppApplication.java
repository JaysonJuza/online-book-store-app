package onlinebookstoreapp;

import java.math.BigDecimal;
import onlinebookstoreapp.model.Book;
import onlinebookstoreapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineBookStoreAppApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(OnlineBookStoreAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setAuthor("Stephen King");
            book.setTitle("Holly");
            book.setCoverImage("hand-drawn");
            book.setDescription("Detective novel");
            book.setIsbn(BigDecimal.valueOf(320));
            book.setPrice(BigDecimal.valueOf(1500));

            bookService.save(book);
            System.out.println(bookService.findAll());
        };
    }
}
