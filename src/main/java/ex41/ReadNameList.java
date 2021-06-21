package ex41;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadNameList {
    //Will read the array list of names and return the list to main to display
    public static ArrayList<String> read(String filePath) throws IOException {
        //declaring list
        ArrayList<String> inputList = new ArrayList<>();
        //takes in path for reading
        File inputText = new File(filePath);
        //scans names
        Scanner names = new Scanner(inputText);
        //While loop that'll continue to read if there are more strings to be read and will term when there is nothing left
        while (names.hasNext()) {
            inputList.add(names.nextLine());
        }
        //returns to main
        return inputList;
    }
}
