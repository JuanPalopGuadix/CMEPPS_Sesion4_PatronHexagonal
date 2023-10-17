package MiHexagonal.core.driver_ports;

import MiHexagonal.core.driven_ports.BookRepository;
import MiHexagonal.core.domain.Book;

public class BookServiceImpl implements BookService {
	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {

	        this.bookRepository = bookRepository;

	}

	public Book getBook(Long id) {

	        return bookRepository.findById(id);

	}
}
