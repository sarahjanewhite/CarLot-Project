/**
 * The Classroom class represents a room specifically designed as a classroom,
 * extending the functionality of the Room class.
 * 
 * @author Jacob Sparks, Aliyah Lewis
 */
class Classroom extends Room {

  /**
   * The number of chairs in the classroom.
   */
  private int chairs;

  /**
   * Constructs a Classroom with the given area and initializes the number of
   * chairs to 0.
   *
   * @param area The area of the classroom.
   */
  public Classroom(int area) {
    super(area);
  }

  /**
   * Constructs a Classroom with the given area and number of chairs.
   *
   * @param area   The area of the classroom.
   * @param chairs The number of chairs in the classroom.
   */
  public Classroom(int area, int chairs) {
    super(area);
    this.chairs = chairs;
  }

  /**
   * Gets the number of chairs in the classroom.
   *
   * @return The number of chairs.
   */
  public int getChairs() {
    return chairs;
  }

  /**
   * Sets the number of chairs in the classroom.
   *
   * @param chairs The new number of chairs.
   */
  public void setChairs(int chairs) {
    this.chairs = chairs;
  }

  /**
   * Gets the seating capacity of the classroom, which is equal to the number of
   * chairs.
   *
   * @return The seating capacity.
   */
  @Override
  public int getCapacity() {
    return chairs;
  }

  /**
   * Returns a string representation of the Classroom, including its area and
   * number of chairs.
   *
   * @return A string representation of the Classroom.
   */
  @Override
  public String toString() {
    return super.toString() + ", Chairs: " + chairs;
  }
}
