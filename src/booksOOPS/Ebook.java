package booksOOPS;

/**
 * Created by Varun on 4/17/2017.
 */
public class Ebook extends Book {
    int appxSize;
    String format;
    public Ebook(String title, String author, int pages,String format) {
        super(title, author, pages);
        this.format = format;
        setAppxSize();
    }

    void setAppxSize(){
        int pages=Integer.parseInt(this.getDetails().split("-")[2]);
        switch(format){
            case "mobi":
                appxSize = 15 * pages;
                break;
            case "pdf":
                appxSize = 10 * pages;
                break;
            case "epub":
                appxSize = 5 * pages;
                break;
        }
    }

    public int getAppxSize() {
        return appxSize;
    }
}
