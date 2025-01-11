package librarymanagementsytem;

/**
 *
 * @author Asus
 */
public class Item {
  private String title;
  private String authour;

public Item(String title,String authour){
    this.authour=authour;
    this.title=title;
}
 public String getTitle(){
     return title;
 }
 public String getAuthor(){
     return authour;
 }
 public void show(){
     System.out.println("Title: " + title +",Authour:"+ authour);
 }
}
