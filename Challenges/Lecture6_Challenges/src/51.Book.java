class Book {

    String title;
    String author;
    String isbn;
    int qty;
    static int totalbooks;

    static{
        totalbooks = 0;
    }
    {
        //This block will execute at the time of reference creating that is why it store null value.
        totalbooks++;
        //System.out.println("BOOK NAME: "+title+" AUTHOR NAME: "+author+" ISBN: "+isbn);
    }
    Book(String title, String author, String isbn, int qty){

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.qty = qty;
        System.out.println("BOOK NAME: "+title+" AUTHOR NAME: "+author+" ISBN: "+isbn);
    }

    public void borrowBook(){
        if(qty > 0) {
            totalbooks--;
            qty--;
        }
        else System.out.println("No Book in library");
    }

    public void returnBook(){
        totalbooks++;
        qty++;
    }

    public static void getTotalBooks(){
        System.out.println("Total Number of Books: "+totalbooks);
    }

}
