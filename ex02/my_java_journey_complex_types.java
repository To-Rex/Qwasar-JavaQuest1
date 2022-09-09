import java.util.Arrays;

class JavaJourney {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};

    System.out.println("Original array: " + Arrays.toString(array));
    array[1] = 0;
    array[2] = 100;
    array[4] = -50;
    System.out.println("Changed array: " + Arrays.toString(array));
  }
}