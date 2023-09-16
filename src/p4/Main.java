package p4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) {

        String file = "myFile.txt";

        try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("arc.zip"));
            FileInputStream fileInputStream = new FileInputStream(file);
        ) {
            ZipEntry entry = new ZipEntry("myFile.txt");
            zipOutputStream.putNextEntry(entry);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            zipOutputStream.write(buffer);
            zipOutputStream.closeEntry();
        }catch (Exception exception){}

        try(ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("arc.zip"))){
            ZipEntry zipEntry;
            String name;
            while ((zipEntry = zipInputStream.getNextEntry())!=null){
                name = zipEntry.getName();
                System.out.printf("File name: %s \n", name);
                FileOutputStream fileOutputStream = new FileOutputStream("new"+name);
                for(int c = zipInputStream.read(); c != -1; c = zipInputStream.read()){
                    fileOutputStream.write(c);
                }
                fileOutputStream.flush();
                zipInputStream.closeEntry();
                fileOutputStream.close();
            }
        }catch (Exception exception){}

    }

}
