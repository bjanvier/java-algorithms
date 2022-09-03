package trees.binaryTree;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("questions.txt");
        Scanner fileIn = new Scanner(file);

        while (fileIn.hasNext()) {
            String line = fileIn.nextLine();
            System.out.println(line);
        }
        fileIn.close();
    }
}
