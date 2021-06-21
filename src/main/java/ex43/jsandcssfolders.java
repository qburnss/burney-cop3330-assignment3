package ex43;

import java.io.File;
//Class for creating the JS and CSS folders in they are prompted by the user
public class jsandcssfolders {
//JS Folder Function
    public String JSFolder() {
        String dir =  "/js/";
        File newFolder = new File(dir);
        newFolder.mkdirs();
        return dir;
    }
    //CSS Folder Function
    public String CSSFolder() {
        String dir =  "/css/";
        File newFolder = new File(dir);
        newFolder.mkdirs();
        return dir;

    }
}
