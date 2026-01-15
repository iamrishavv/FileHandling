package Assignment;

import java.io.*;
import java.nio.Buffer;
import java.util.HashSet;

//wap to find names available in 2 files.
public class q48 {
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

        HashSet<String> set=new HashSet<>();

        try (BufferedReader br1=new BufferedReader(new FileReader("file1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
                ){
            String line;
            //Read first file and add
            while((line=br1.readLine())!=null){
                set.add(line.trim());
            }
            //read 2nd file and check common names
            System.out.println("Common names are: ");
            while((line=br2.readLine())!=null){
                if(set.contains(line.trim())){
                    System.out.println(line);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
