package Steps;

import Data.BooksData;
import Models.Request.BookRequest;
import Pages.BooksPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.refresh;
import static org.testng.Assert.assertEquals;

public class BooksSteps {

    BooksData booksData = new BooksData();
    BooksPage booksPage = new BooksPage();

    @Step
    public BooksSteps searchBasedOnPublisher() {
        booksPage.searchBox.setValue(booksData.publisherToSearch);
        return this;
    }

    public int getOReillyBooksSizeFromUI() {
        return booksPage.publisherElements.size();
    }

    @Step
    public BooksSteps assertBooksNumber(int uiBookCount, int apiBookCount) {
        assertEquals(uiBookCount, apiBookCount);
        return this;
    }

    @Step
    public BooksSteps assertLastBookInUi() {
        refresh();
        assertEquals(booksPage.books.get(booksPage.books.size()-1).getText(), booksData.expectedTitle);
        return this;
    }

    @Step
    public BooksSteps assertLastBookInApi() {

        assertEquals(BookRequest.getAllBooks().getBooks().get(BookRequest.getAllBooks().getBooks().size() - 1).getTitle(), booksData.expectedTitle);
        return this;
    }

}
