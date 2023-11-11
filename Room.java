/**
 * Room
 * 
 * A class to simulate a room
 *
 * @author Jacob Sparks, Aliyah Lewis
 *
 */

public class Room {
  private int area;

  /**
   * Constructs a room with a specific area.
   *
   * @param area | The area of the room in square feet.
   */
  public Room(int area) {
    this.area = area;
  }

  /**
   * Accessor that retrieves the area of the room
   * in square feet
   * 
   * @return area | The area of the room in square feet
   */

  public int getSquareFeet() {
    return area;
  }

  /**
   * Mutator method that sets the area of the room
   * in square feet
   *
   * @param int area | The area of the room in square feet
   */

  public void setSquareFeet(int area) {
    this.area = area;
  }

  /**
   * Accessor method that retrieves the capacity of the room.
   * The capacity is how many chairs that can fit in the room.
   *
   * @return capacity | the capacity of the room
   */

  public int getCapacity() {
    // returns the capacity of the room.
    // The capacity is given by dividing the square feet
    // by 9 (using integer division).
    return area / 9;
  }

  /**
   * Display information about the room
   *
   * return String | A string displaying the area and capacity of the room
   */

  public String toString() {
    // returns the square feet and capacity of the room.
    return "Square Feet: " + area + ", Capacity: " + getCapacity();

  }

}
