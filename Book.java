public class Book {

    private String author;
    private String title;

    public Book() {
        this.author = "there is no author name" ;
        this.title = "there is no title name";
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void displayInfo(){
        System.out.print(title+" "+author);
    }



}
