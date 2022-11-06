import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String,Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){
      collection.put(title, true);
    }

    public String removeTitle(String title){
      collection.remove(title);
      return title;
    }

    public void checkOut(String title){
      collection.replace(title, true, false);
     }

    public void returnBook(String title){
      collection.replace(title, false, true);
    }

    public boolean containsTitle(String title){
      if (collection.contains(title)){
        return true;}
      else{
        return false;}
      }

    public boolean isAvailable(String title){
      Boolean return_value = true;
      if (collection.contains(title)){
        if (collection.get(title) == true){
          return_value = true;
          }
      else{
        return_value = false;}
      }
      return return_value;}

    public void printCollection(){
      System.out.println(collection.toString());
    }
    




  
    public static void main(String[] args) {
      Library Forbes = new Library("Forbes", "Green St", 3);
      System.out.println(Forbes);
      Forbes.addTitle("Lord of the Rings");
      Forbes.addTitle("Dr Seuss");
      Forbes.checkOut("Dr Seuss");

    }
  
  }