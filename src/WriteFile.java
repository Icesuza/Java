import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args){
//        try(FileOutputStream fileOutputStream
//                    = new FileOutputStream("test.txt",false)){
//            System.out.print("Insert data: ");
//            byte[] data = (new Scanner(System.in).nextLine().getBytes(StandardCharsets.UTF_8));
//            fileOutputStream.write(data);
//            System.out.println(Arrays.toString(data));
//            System.out.println("File have written successfully");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        try(FileInputStream fileInputStream
//                = new FileInputStream("test.txt")){
//                while(true){
//                    int data = fileInputStream.read();
//                    if(data == -1){
//                        break;
//                    }
//                    System.out.print((char) data);
//                }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        try(FileInputStream fileInputStream
                    = new FileInputStream("durian.jpg")){
            Integer data = 0;
            try(FileOutputStream fileOutputStream
                        = new FileOutputStream("Durian-1.png")){
                while ((data=fileInputStream.read())!=-1){
                    fileOutputStream.write(data.byteValue());
                }
                System.out.println("Created new durian :)");
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
