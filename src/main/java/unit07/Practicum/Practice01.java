package unit07.Practicum;

public class Practice01 {
  public static String arrayToString(int[] int_array) {
    String empty_string = "[";
    for(int i = 0; i < int_array.length - 1; i++) {
      empty_string += (int_array[i] + ", ");
    }
    empty_string += (int_array[int_array.length - 1] + "]");
    return empty_string;
  }

  public static void main(String[] args) {
    int[] int_array = new int[]{1, 2, 3, 4, 5};
    System.out.println(arrayToString(int_array));
  }

}