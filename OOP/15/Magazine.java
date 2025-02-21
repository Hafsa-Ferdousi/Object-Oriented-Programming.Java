
package librarymanagementsytem;

public class Magazine extends Item{
    private int issueNumber;
    public Magazine(String title, String author,int issueNumber) {
        super(title, author);
        this.issueNumber=issueNumber;
    }
    
    @Override
    public void show(){
      super.show();
        System.out.println("Issue Number: "+ issueNumber);
    }
}
