import java.io.File;

public class Main {
    public static void main(String[] args) {
        File dir = new File("D:\\myFolder100323");
        if (dir.isDirectory()){
            for(File item: dir.listFiles()){
                if (item.isDirectory()){
                    System.out.println(item.getName() + " \t folder");
                }else{
                    System.out.println(item.getName() + " \t file");
                }
            }
        }
    }
}