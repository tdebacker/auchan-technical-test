package technical.test.renderer.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import technical.test.renderer.service.BookService;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    public String showBooks(final Model model) {
        IReactiveDataDriverContextVariable ctx = new ReactiveDataDriverContextVariable(bookService.findAll().subscribe());
        model.addAttribute("books", ctx);

        return "books";
    }

}
