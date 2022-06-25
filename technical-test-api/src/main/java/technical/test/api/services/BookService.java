package technical.test.api.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.api.document.Book;
import technical.test.api.repository.BookRepository;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void create(Book book) {
        bookRepository.save(book).subscribe();
    }

    public Mono<Book> findById(int id) {
        return bookRepository.findById(id);
    }

    public Flux<Book> findAll() {
        return bookRepository.findAll();
    }

}
