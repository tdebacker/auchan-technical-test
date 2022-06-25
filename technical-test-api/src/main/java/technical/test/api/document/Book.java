package technical.test.api.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Getter
@Setter
@ToString
public class Book {

    @Id
    private int id;

    private String title;

    private LocalDate publicationDate;

    private int authorId;

}
