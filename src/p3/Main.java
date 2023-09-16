package p3;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File myFile = new File("D:\\myFolder100323\\myFile.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());
        try {
            boolean created = myFile.createNewFile();
        } catch (IOException exception){}
        if (myFile.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("File not found");
        }
        System.out.println("File size: " + myFile.length());

        if (myFile.canRead()){
            System.out.println("File can be read");
        }

        if (myFile.canWrite()){
            System.out.println("File can be write");
        }




    }

}
