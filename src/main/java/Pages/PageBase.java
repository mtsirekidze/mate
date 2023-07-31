package pages;

import com.codeborne.selenide.Selenide;

public class PageBase {
    public PageBase() {
        Selenide.page(this);
    }
}
