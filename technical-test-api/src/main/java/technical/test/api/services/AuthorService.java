package technical.test.api.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.api.document.Author;
import technical.test.api.repository.AuthorRepository;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public void create(Author author) {
        authorRepository.save(author).subscribe();
    }

    public Flux<Author> findAll() {
        return authorRepository.findAll();
    }

    public Mono<Author> update(Author author) {
        return authorRepository.save(author);
    }

}
