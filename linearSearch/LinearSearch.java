package linearSearch;

import java.util.NoSuchElementException;

class LinearSearch {

    private int age = 10;
    private BigName currentUser = new BigName(60, "Brendan Eich");

    private BigName[] bigNames = {
            new BigName(38, "Cristiano Ronaldo"),
            new BigName(34, "Lionel MESSI"),
            new BigName(38, "Lebron James"),
            new BigName(60, "Brendan Eich"),
            new BigName(34, "Stephen Curry"),
            new BigName(48, "Joseph Kabila"),
    };

    /**
     * The search here is about stopping the
     * iteration when age becomes 18
     * 
     * There is no any array involved in this search
     * 
     * @return
     */
    public int getAge() {
        while (age <= 17) {
            age++;
        }
        return age;
    }

    /**
     * Looping through the whole array until
     * the match is found
     */
    public BigName findJSCoFounder() {
        BigName javaScriptCoFounder = new BigName();

        for (BigName student : bigNames) {
            if (student.age == 60 && student.name.equals(currentUser.name)) {
                javaScriptCoFounder = student;
                break;
            }
        }
        return javaScriptCoFounder;
    }

    /**
     * This could be a quick search rather than
     * looping in the whole array list to find a
     * match
     * 
     * @param index
     * @return
     */
    public BigName findName(int index) {
        if (bigNames[index] == null) {
            throw new NoSuchElementException();
        }
        return bigNames[index];
    }
}
