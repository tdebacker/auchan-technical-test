package technical.test.api.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import technical.test.api.document.Book;
import technical.test.api.endpoints.dto.BookDTO;

@Component
@AllArgsConstructor
public class BookMapper {

    public Book dtoToEntity(BookDTO bookDTO) {
        Book book = new Book();
        book.setId(bookDTO.getId());
        book.setTitle(bookDTO.getTitle());
        book.setPublicationDate(bookDTO.getPublicationDate());
        book.setAuthor(book.getAuthor());

        return book;
    }

    public BookDTO entityToDto(Book book) {
        return BookDTO.builder()
                .id(book.getId())
                .title(book.getTitle())
                .publicationDate(book.getPublicationDate())
                .build();
    }

}
