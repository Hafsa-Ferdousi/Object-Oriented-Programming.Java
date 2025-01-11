/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsytem;

/**
 *
 * @author Asus
 */
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
