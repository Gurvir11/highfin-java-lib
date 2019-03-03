package File.reading;

import java.io.File;
import java.io.FileNotFoundException;

public class Scanner {

    static int findNumLines(File file) throws FileNotFoundException {
        java.util.Scanner lines = new java.util.Scanner(file);
        int numOfLines = 0;
        while (lines.hasNextLine()) {
            if (lines.nextLine() != null) {
                numOfLines++;
                System.out.println(numOfLines);
            }
        }
        return numOfLines;
    }
}
