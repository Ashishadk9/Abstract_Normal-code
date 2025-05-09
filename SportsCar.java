
/**
 * Write a description of class SportsCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SportsCar extends Car
{
   public SportsCar(String name,String description) {
      super(name,description); 
   }
   public void display(){
       System.out.println("Car Name: " + name);
       System.out.println("Description: " + description);
   }
}
