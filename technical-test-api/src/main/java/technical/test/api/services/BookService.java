package technical.test.api.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import technical.test.api.document.Book;
import technical.test.api.endpoints.dto.BookDTO;
import technical.test.api.mapper.BookMapper;
import technical.test.api.repository.BookRepository;

import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    public void create(BookDTO bookDTO) {
        Book book = bookMapper.dtoToEntity(bookDTO);
        bookRepository.save(book).subscribe();
    }

    public BookDTO findById(int id) {
        Book foundBook = bookRepository.findById(id).block();
        if (foundBook == null) {
            throw new NoSuchElementException();
        }
        return bookMapper.entityToDto(foundBook);
}

    public Flux<Book> findAll() {
        return bookRepository.findAll();
    }

}
