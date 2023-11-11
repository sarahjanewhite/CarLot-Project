import java.util.*;

/**
 * Room
 * 
 * A class to simulate a room
 *
 * @author 
 *
 */


public class Room {
   private int squareFeet;

    /**
     * Accessor that retrieves the area of the room
     * in square feet
     * @return the area of the room in square feet
     */
    
     public int getSquareFeet() {
     return squareFeet;
   }

   /**
    * Mutator method that sets the area of the room
    * in square feet
    * @param int area, the area of the room in square feet
    */

   public void setSquareFeet(int area) {
     this.squareFeet = area;
   }

    /**
    * Accessor method that retrieves the capacity of the room.
    * The capacity is how many chairs that can fit in the room.
    * @return the capacity of the room
    */

   public int getCapacity() {
    //returns the capacity of the room.
    //The capacity is given by dividing the square feet 
    //by 9 (using integer division).

    return capacity;
   }

    /**
    * Construct a Room
    */

   public Room(int area) {
    squareFeet = area;
  }

    /**
    * Display information about the room
    */

    public String toString() {
        // returns the square feet and capacity of the room.
        return String; 
    }

}
