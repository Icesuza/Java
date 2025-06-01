import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;

public class UploadFile {
    public static void main(String[] args){
        String fileName = "durian.jpg";
        String []splits  = fileName.split("\\.");

        try(BufferedInputStream uploadedFile
                    = new BufferedInputStream(new FileInputStream(fileName))){
            String  newFileName = UUID.randomUUID()+"."+splits[1];
            try(BufferedOutputStream newFile
                        = new BufferedOutputStream(
                    new FileOutputStream("D:\\" + newFileName, true))){
                int data = 0;
                while ((data=uploadedFile.read())!=-1){
                    newFile.write((data));
                }
                System.out.println("New file uploaded: " + newFileName);
            }

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
