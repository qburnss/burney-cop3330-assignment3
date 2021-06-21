package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
//Function to generate the website
public class generatewebsite {

//Strings used throughout functions and initialized in main function
    public String siteName, author;
    //Function to write index.html file
    public String HTML() {
        //create skeleton for output
        String dir = "./website/" + siteName + "/index.html";
        String index = "<title> " + siteName + " </title>\n<meta> " + author + " </meta>";
        File file = new File(dir);
        //write html file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(index);
            writer.close();
            return dir;
        } catch(Exception q) {
            return "Fail";
        }

    }
    public String Website() {
        String dir = "./website/" + siteName;
        File newFolder = new File(dir);
        newFolder.mkdirs();
        return dir;


    }


}
