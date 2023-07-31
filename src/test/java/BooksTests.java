import Models.Request.BookRequest;
import Steps.BooksSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

//@Listeners(Config.class)
@Epic("bookstore testing")
@Feature("bookstore test cases")
public class BooksTests extends Config {

    BooksSteps booksSteps = new BooksSteps();

    @Test
    @Description("Validate books with publisher name")
    @Story("validate books")
    public void validateBooksByPublisherInUI() {

        booksSteps.searchBasedOnPublisher()
                .assertBooksNumber(booksSteps.getOReillyBooksSizeFromUI(), BookRequest.getBooksByPublisher("O'Reilly Media").size())
                .assertLastBookInApi()
                .assertLastBookInUi();
    }
}
