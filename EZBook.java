public class EZBook extends Book {
    private int fileSize;

    public EZBook() {
        this.fileSize = 0;
    }

    public EZBook(String author,String title,int fileSize){
        super(author,title);
        this.fileSize=fileSize;
    }
    @Override
    public  void displayInfo(){
        super.displayInfo();
        System.out.println(" File size: " + fileSize);
    }






}
