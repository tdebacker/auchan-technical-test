package technical.test.api.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.api.document.Book;
import technical.test.api.endpoints.dto.BookDTO;
import technical.test.api.mapper.BookMapper;
import technical.test.api.repository.BookRepository;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    public void create(BookDTO bookDTO) {
        Book book = bookMapper.dtoToEntity(bookDTO);
        bookRepository.save(book).subscribe();
    }

    public Mono<Book> findById(int id) {
        return bookRepository.findById(id);
    }

    public Flux<Book> findAll() {
        return bookRepository.findAll();
    }

}
