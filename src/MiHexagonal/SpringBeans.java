package MiHexagonal;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import MiHexagonal.core.driven_ports.BookRepository;
import MiHexagonal.core.driver_ports.BookService;
import MiHexagonal.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {
        @Bean
        BookService bookService(final BookRepository bookRepository) {
            return new BookServiceImpl(bookRepository);

}

}
