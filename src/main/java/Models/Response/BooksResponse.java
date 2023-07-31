package Models.Response;

import lombok.Data;

import java.util.List;

@Data
public class BooksResponse {
    public List<Book> books;
}