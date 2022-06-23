package technical.test.api.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import technical.test.api.document.enums.Gender;

@Document
@Getter
@Setter
public class Author {

    @Id
    private int id;

    private String name;

    private Gender gender;

}
