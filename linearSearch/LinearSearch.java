package linearSearch;

import java.util.NoSuchElementException;

class LinearSearch {
    private BigName[] bigNames = {
            new BigName(38, "Cristiano Ronaldo"),
            new BigName(34, "Lionel MESSI"),
            new BigName(38, "Lebron James"),
            new BigName(60, "Brendan Eich"),
            new BigName(34, "Stephen Curry"),
            new BigName(48, "Joseph Kabila"),
    };

    /**
     * Searching through the array without
     * iterating it
     */
    public BigName findName(int index) {
        BigName javaScriptCoFounder = null;

        if (bigNames[index] != null) {
            javaScriptCoFounder = bigNames[index];
        } else {
            throw new NoSuchElementException();
        }
        return javaScriptCoFounder;
    }
}
