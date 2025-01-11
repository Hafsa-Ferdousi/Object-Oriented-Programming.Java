
package librarymanagementsytem;


public class Library {
    private Item[]items;
    private int itemCount;
    
    public Library(int capcity){
        items = new Item[capcity];
        itemCount=0;
        
    }
    public void addItem(Item item){
        if (itemCount<items.length){
         items[itemCount++]=item; 
        }else{
            System.out.println("library is full , cannot add more items.");
        }
    }
    public void displayAllItems(){
        for(int i=0;i<itemCount;i++){
            items[i].show();
            System.out.println();
        }
    }
    
}
