package booksOOPS;

/**
 * Created by Varun on 4/17/2017.
 */
public class Test1 {
    public static void main(String[] args){

        Book b = new Book("a","b",1);
        Ebook eb = new Ebook("c","d",2,"pdf");
        PrintedBook pb = new PrintedBook("e","f",3,1,10.0);
        System.out.println(eb.getAppxSize());
    }
}
