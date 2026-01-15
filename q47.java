package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

//wap to read 2 files data and write it in 3rd one.
public class q47 {
    public static void main(String[] args) throws IOException {
        try (
                FileWriter fw1 = new FileWriter("file1.txt");
                FileWriter fw2 = new FileWriter("file2.txt")
        ) {
            fw1.write("Ravi\nAmit\nSuman\nRahul\nNeha");
            fw2.write("Amit\nRahul\nPooja\nNeha");

            //System.out.println("Files created and names written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br1=new BufferedReader(new FileReader("file1.txt"));
            BufferedReader br2=new BufferedReader(new FileReader("file2.txt"));
            FileWriter fw=new FileWriter("file3.txt");) {
            String  line;
            while((line=br1.readLine())!=null){
                fw.write(line +System.lineSeparator());
            }
            while((line=br2.readLine())!=null){
                fw.write(line +System.lineSeparator());
            }
            System.out.println("Data written successfully into file3.txt");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
