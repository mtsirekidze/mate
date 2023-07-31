package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BooksPage {
    public SelenideElement
            searchBox = $("#searchBox");
    public ElementsCollection publisherElements = $$("[class='rt-td']").filter(Condition.text("O'Reilly Media")),

    books =  $$(".action-buttons");
}
