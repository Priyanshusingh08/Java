import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {


        // Creating a File...


         File myfile = new File("zxcv.txt");

        // try {
        //     myfile.createNewFile();
        // } catch (IOException e) {
        //     System.out.println(e);
        //     e.printStackTrace();
        // }


        // Writing in a file

        try {
            FileWriter fileWriter = new FileWriter("zxcv.txt");
            fileWriter.write("Writing into a File \n This is line number 2 ...!");
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        // Reading a file
       
        try{
            Scanner sc = new Scanner(myfile);
           
            while(sc.hasNextLine()){
               String line = sc.nextLine();
               System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
