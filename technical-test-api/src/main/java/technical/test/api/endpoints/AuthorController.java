package technical.test.api.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.api.document.Author;
import technical.test.api.services.AuthorService;

@RestController
@AllArgsConstructor
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Author author) {
        authorService.create(author);
    }

    @GetMapping
    public ResponseEntity<Flux<Author>> findAll() {
        return new ResponseEntity<>(authorService.findAll(), HttpStatus.OK);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Mono<Author> update(@RequestBody Author author) {
        return authorService.update(author);
    }

}
