package recursion;

import java.util.List;
import recursion.recursions.Permutations;

public class Main {
  public static void main(String[] args) {
    Permutations permutations = new Permutations();
    List<String> arr = permutations.getInput("janvierzagabe", 0, false);

    System.out.println("Permutations");
    System.out.println("inputs List => " + arr.size());

    // for (int i = 0; i < arr.size(); i++) {
    // System.out.println(arr.get(i));
    // for (int j = i + 1; j < arr.size(); j++) {
    // if (arr.get(i).equals(arr.get(j))) {
    // System.out.println("Duplicate element found " + arr.get(i));
    // }
    // }
    // }
  }
}
