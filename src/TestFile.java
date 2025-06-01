import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class TestFile {
    public static void main(String [] args){
//        Path path = Paths.get("Person.excel");
//        Path path1 = Paths.get("D:\\person.excel");
//        Path directory = Paths.get("Folder");
//        try{
//            //Files.createFile(path);
//            //Files.delete(path);
//            //Files.move(path,path1);
//            //Files.createDirectory(directory);
//            Files.delete(directory);
//            System.out.println("File created successfully");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        File file = new File("Person.db");
        try{
            //Create a file
            if(file.createNewFile()){
                System.out.println("Create file successfully");
            }
            else{
                System.out.println("File existed");
            }
            //rename a file
//            if(file.renameTo(new File("People.db"))){
//                System.out.println("File have been renamed");
//            }
//            else{
//                System.out.println("File not found or cannot rename");
//            }
            //delete file
//            if(file.delete()){
//                System.out.println("Delete successfully");
//            }
//            else{
//                System.out.println("File not found or cannot delete");
//            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
