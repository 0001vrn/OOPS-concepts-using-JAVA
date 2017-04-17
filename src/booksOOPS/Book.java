package booksOOPS;

/**
 * Created by Varun on 4/17/2017.
 */
public class Book {
    String title;
    String author;
    int pages;
    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    String getDetails(){
        return title+"-"+author+"-"+pages;
    }
}
