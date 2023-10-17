package MiHexagonal.core.driven_ports;
import MiHexagonal.core.domain.Book;
public interface BookRepository {
	Book findById(Long id);
}
