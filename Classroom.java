import java.util.*;

/**
 * Classroom
 * 
 * A class derived from the room class to simulate a classroom
 *
 * @author 
 *
 */


class Classroom extends Room {
   int numberOfChairs;

  /**
   * Accessor that retrieves the number of chairs in the room
   * @return number of chairs
   */
  
    public int getNumberOfChairs() {
    return numberOfChairs;
  }

  /**
  * Mutator method that sets the number of chairs in the room
  * @param chairs, number of chairs in the room
  */

  public void setNumberOfChairs(int chairs) {
    this.numberOfChairs = chairs;
  }

    /**
    * Accessor method that overrides the capacity from the Room class.
    * The capacity is how many chairs that can fit in the room.
    * @return the capacity of the Classroom
    */

   //public int getCapacity() {
    //returns the capacity of the Classroom.

    return capacity;
   }

    /**
    * Constructor 1
    */

   public Classroom(int area) {
    squareFeet = area;
    numberOfChairs = 0;
  }

    /**
    * Constructor 2
    */

   public Classroom(int area, int chairs) {
    squareFeet = area;
    numberOfChairs = chairs;
  }

    /**
    * Display information about the Classroom
    */

    public String toString() {
        // displays the square feet 
        //displays capacity
        //displays number of chairs
        return String; 
    }

}
