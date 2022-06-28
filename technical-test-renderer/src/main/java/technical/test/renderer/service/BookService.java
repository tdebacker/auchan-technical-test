package technical.test.renderer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.awt.print.Book;

@Service
public class BookService {

    private static final String BASE_URL = "http://localhost:8088";
    private final WebClient client = getWebClient();

    private WebClient getWebClient() {
        return WebClient.create(BASE_URL);
    }

    public Flux<Book> findAll() {
        return client.get()
                .uri("/book")
                .retrieve()
                .bodyToFlux(Book.class);
    }

}
