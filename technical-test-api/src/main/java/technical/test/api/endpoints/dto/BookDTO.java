package technical.test.api.endpoints.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class BookDTO {

    private int id;

    private String title;

    private LocalDate publicationDate;

}
