package booksOOPS;

/**
 * Created by Varun on 4/17/2017.
 */
class PrintedBook extends Book{
    int available;
    double basePrice;
    double sellingPrice;
    public PrintedBook(String title, String author, int pages, int available, double basePrice){
        super(title,author,pages);
        this.available = available;
        this.basePrice = basePrice;
        setSellingPrice();
    }

    void setSellingPrice(){
        sellingPrice = basePrice + 0.05*basePrice + 0.02*available;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    void buy(){
        if(available>0)
        {
            available--;
            setSellingPrice();
        }
    }

}