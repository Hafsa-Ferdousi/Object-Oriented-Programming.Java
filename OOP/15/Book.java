
package librarymanagementsytem;


public class Book extends Item {
    private String ISBN;
    public Book(String title, String author,String ISBN) {
        super(title, author);
        this.ISBN= ISBN;
    }
    @Override
    public void show(){
       super.show();
        System.out.println("ISBN"+ISBN);
    }
}
