
package librarymanagementsytem;


public class LibraryManagementSytem {

    public static void main(String[] args) {
       Book b= new Book("Java Programmong","James Gosling", "123-125");
       Magazine m=new Magazine("Tech Today","Various Authors",42);
       Library library=new Library(10);
       
       library.addItem(b);
      library.addItem(m);
       library.displayAllItems();
    }
    
}
