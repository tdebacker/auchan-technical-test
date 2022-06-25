package technical.test.api.mapper;

import org.springframework.stereotype.Component;
import technical.test.api.document.Author;
import technical.test.api.endpoints.dto.AuthorDTO;

@Component
public class AuthorMapper {

    public Author dtoToEntity(AuthorDTO authorDTO) {
        Author author = new Author();
        author.setId(authorDTO.getId());
        author.setName(authorDTO.getName());
        author.setGender(authorDTO.getGender());

        return author;
    }

}
