package recursion.recursions;

import java.util.ArrayList;

public class Permutations {
    String userInput;

    ArrayList<String> inputsList = new ArrayList<>();

    //If the initial inputs has already been used and 
    //pushed to inputsList
    String currentInput = "";

    public ArrayList<String> getInput(
        String input, int currentIndex, Boolean searchComplete) {
        
        /**
         * Before the program starts, we will only have 
         * on input to proceed with, and that's argument.
         */
        if (!inputsList.contains(input)) {
            inputsList.add(input);
        }

        for (int i = 0; i < inputsList.size(); i++) {
            if (!inputsList.isEmpty()) {
                currentInput = inputsList.get(i);

                if (currentInput.length() == 2) {
                    var s1 = currentInput.substring(0, 1);
                    var s2 = currentInput.substring(1, 2);
                    inputsList.add(s2 + s1);
                }

                else if (currentInput.length() >= 3) {
                    var s1 = currentInput.substring(0, 1);
                    var s2 = currentInput.substring(1, 2);
                    var r = currentInput.substring(2, currentInput.length());

       
                    if (!inputsList.contains(s2 + r + s1)) {
                        inputsList.add(s2 + r + s1);
                    }
                    if (!inputsList.contains(s1 + r + s2)) {
                        inputsList.add(s1 + r + s2);
                    }
                    if (!inputsList.contains(s2 + s1 + r)) {
                        inputsList.add(s2 + s1 + r);
                    }
                    if (!inputsList.contains(r + s1 + s2)) {
                        inputsList.add(r + s1 + s2);
                    }
                    if (!inputsList.contains(r + s2 + s1)) {
                        inputsList.add(r + s2 + s1);
                    }
                }
                /**
                 * Keeping track of every input from the array
                 * after all the possible permutations are applied
                 */
                currentIndex += 1;
            }
        }
       /**
       * currentInput.length()-3 for the 3 substring
       * we previously had on the currentInput
       */
        if (currentIndex >=  inputsList.size()) {
            searchComplete = true;
        }
        
        if (!searchComplete) {
            getInput(input, currentIndex, searchComplete);
        }
        return inputsList;
    }
}
