package technical.test.api.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    public ResponseEntity<BookDTO> findById(@PathVariable int id) {
        return new ResponseEntity<>(bookService.findById(id), HttpStatus.OK);
    }

}
