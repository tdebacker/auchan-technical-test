package technical.test.api.endpoints.dto;

import lombok.Getter;
import lombok.Setter;
import technical.test.api.document.enums.Gender;

@Getter
@Setter
public class AuthorDTO {

    private int id;

    private String name;

    private Gender gender;

}
