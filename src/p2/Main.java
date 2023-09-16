package p2;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File dir = new File("D:\\myFolder100323\\test2");
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Folder is created");
        }
        File newDir = new File("D:\\myFolder100323\\test3");
        dir.renameTo(newDir);
        boolean deleted = newDir.delete();
        if (deleted) {
            System.out.println("Folder is deleted");
        }
    }

}
