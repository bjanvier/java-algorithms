package recursion.recursions;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    String userInput;
    List<String> inputsList = new ArrayList<>();
    String input = "";

    public void with2Chars() {
        if (input.length() == 2) {
            var s1 = input.substring(0, 1);
            var s2 = input.substring(1, 2);
            inputsList.add(s2 + s1);
        }
    }

    public List<String> getInput(String input, int index, Boolean complete) {
        // Before the program starts, we will only have
        // on input to proceed with, and that's argument.
        if (!inputsList.contains(input)) {
            inputsList.add(input);
        }

        for (int i = 0; i < inputsList.size(); i++) {
            if (!inputsList.isEmpty()) {
                input = inputsList.get(i);

                with2Chars();

                if (input.length() >= 3) {
                    var s1 = input.substring(0, 1);
                    var s2 = input.substring(1, 2);
                    var r = input.substring(2, input.length());

                    // These combinations will
                    // try every possible combination
                    // from the input.
                    String[] strList = {
                            s2 + r + s1, s1 + r + s2,
                            s2 + s1 + r, r + s1 + s2,
                            r + s2 + s1
                    };

                    for (String str : strList) {
                        add(inputsList, str);
                    }
                }
                /**
                 * Keeping track of every input from the array
                 * after all the possible permutations are applied
                 */
                index += 1;
            }
        }
        if (index >= inputsList.size()) {
            complete = true;
        }
        if (!complete) {
            getInput(input, index, complete);
        }
        return inputsList;
    }

    // Add a new found input if it's not already
    // contained in the input list.
    public void add(List<String> list, String str) {
        if (!list.contains(str)) {
            list.add(str);
        }
    }
}
