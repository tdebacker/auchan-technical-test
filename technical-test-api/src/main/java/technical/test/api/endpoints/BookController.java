package technical.test.api.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.api.document.Book;
import technical.test.api.endpoints.dto.BookDTO;
import technical.test.api.services.BookService;

@RestController
@AllArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody BookDTO bookDTO) {
        bookService.create(bookDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mono<Book>> findById(@PathVariable int id) {
        return new ResponseEntity<>(bookService.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Flux<Book>> findAll() {
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }

}
