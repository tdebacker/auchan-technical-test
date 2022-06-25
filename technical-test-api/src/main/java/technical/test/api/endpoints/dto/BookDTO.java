package technical.test.api.endpoints.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private int id;

    private String title;

    private LocalDate publicationDate;

    private AuthorDTO author;

}
