class Book {
    private int book_number;
    private String title;
    private String author;
    private double price;
    
    public void setbook_number (int book_num) {
        this.book_number = book_num;
    }
    
    public void settitle (String book_title) {
        this.title = book_title;
    }
    
    public void setauthor (String book_author) {
        this.author = book_author;
    }
    
    public void setprice (double book_price) {
        this.price = book_price;
    }
    
    public int getbook_number () {
        return book_number;
    }
    
    public String gettitle () {
        return title;
    }
    
    public String getauthor () {
        return author;
    }
    
    public double getprice() {
        return price;
    }
    
}