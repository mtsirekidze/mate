package Models.Request;

import Models.Response.Book;
import Models.Response.BooksResponse;
import io.restassured.response.Response;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class BookRequest {
    private static final String BASE_URL = "https://bookstore.toolsqa.com/BookStore/v1";

    public static BooksResponse getAllBooks() {
        Response response = given()
                .contentType("application/json")
                .when()
                .get(BASE_URL + "/Books");

        return response.getBody().as(BooksResponse.class);
    }

    public static List<Book> getBooksByPublisher(String publisher) {
        BooksResponse booksResponse = getAllBooks();
        return booksResponse.getBooks().stream()
                .filter(book -> book.getPublisher().equals(publisher))
                .collect(Collectors.toList());
    }
}
