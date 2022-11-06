/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

    /**
   * Checks if the house has a dining room
   * @return True or False: if the house has dining room or not
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
 }

  public int nResidents(){
    return residents.size();
  }

  public void moveIn(String name){
    residents.add(name);
  }

  public String moveOut(String name){
    residents.remove(name);
    return name;
  }
  public boolean isResident(String person){
    if (residents.contains(person)){
      return true;}
    else{
      return false;
    }
    }
  public static void main(String[] args) {
    House home = new House("Baldwin", "15 Bedford Terrace", 4, false);
    System.out.println(home);
    home.moveIn("Anna");
    home.moveIn("Paavani");
    home.moveOut("Paavani");
    home.isResident("Anna");
    home.nResidents();
  }

}