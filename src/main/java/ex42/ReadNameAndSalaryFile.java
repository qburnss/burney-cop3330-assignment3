package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class ReadNameAndSalaryFile {
    //Function to open and read file
    public static String ReadNAndSFile(List<String> Last, List<String> First, List<Integer> Salary) {
        try {
            //open file
            File NAndSFile = new File("C:\\Users\\18137\\IdeaProjects\\burney-cop3330-ex0\\burney-cop3330-assignment3\\src\\main\\java\\ex42\\excercise42_input.txt");
            //scan strings
            Scanner reading = new Scanner(NAndSFile);

            while (reading.hasNextLine()){

                String string = (reading.nextLine());
                //separate each string with the comma for placement
                String[] separate = string.split(",");
                //adding strings to lists depending on placement in file
                int i = 0;

                Last.add(separate[i]);
                First.add(separate[i+1]);
                Salary.add(Integer.parseInt(separate[i+2]));
            }
            reading.close();
       }//If file cannot be found, return failure message
        catch (FileNotFoundException e) {
            return "Failed";
        }
        return null;
    }
}
