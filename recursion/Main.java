package recursion;

import java.util.List;
import recursion.recursions.Permutations;

public class Main {
  public static void main(String[] args) {
    Permutations permutations = new Permutations();

    System.out.println("Permutations");
    System.out.println("inputs List \n" + permutations.getInput("janvier", 0, false).size());

    List<String> arr = permutations.getInput("janvier", 0, false);
    for (int i = 0; i < arr.size(); i++) {
      for (int j = i + 1; j < arr.size(); j++) {
        if (arr.get(i).equals(arr.get(j))) {
          System.out.println("Duplicate element found " + arr.get(i));
        }
      }
    }
  }
}
