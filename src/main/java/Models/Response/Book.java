package Models.Response;

import lombok.Data;

@Data

public class Book {
    public String isbn;
    public String title;
    public String subTitle;
    public String author;
    public String publish_date;
    public String publisher;
    public int pages;
    public String description;
    public String website;
}