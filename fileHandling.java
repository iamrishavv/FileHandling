package BasicJava;

import java.io.File;
import java.io.IOException;

//File handling in Java means creating, reading, writing, and deleting files to store data permanently.
//👉 Java provides file handling using:
//1️⃣ java.io (old / stream-based)
//2️⃣ java.nio.file (new / faster, Java 7+)
//🔹 Common File Operations
//Create a file
//Write data to file
//Read data from file.
//Append data
//Delete a file
public class fileHandling {

    public static void main(String[] args) throws IOException {
        //create new file
        File f=new File("abc.txt");
        if(f.createNewFile()){
            System.out.println("new file created");
        }else{
            System.out.println("File already exist");
        }
        // create a directory
        File f1=new File("My_directory");
        if(f1.mkdir()){
            System.out.println("Directory created");
        }else {
            System.out.println("Directory already exist");
        }
        //create a file inside a directory.
        File f2=new File(f1,"a.txt");
        if(f2.createNewFile()){
            System.out.println("file created inside " +f1 +"directory");
        }else{
            System.out.println("file already exist inside the directory");
        }
        File f3=new File(f1,"b.txt");
        boolean newFile = f3.createNewFile();
        System.out.println(newFile);
        File f4=new File(f1,"mydir2");
        boolean mkdir = f4.mkdir();
        System.out.println(mkdir);
        //print the contents of a directory(inside it directory or file).
        String[] list = f1.list();
        for(String x:list){
            System.out.println(x);
        }
        File[] files = f1.listFiles();
        for (File x: files) {
            if (x.isFile()) {
                System.out.println("FILE : " + x.getName());
            } else if (x.isDirectory()) {
                System.out.println("DIR  : " + x.getName());
            }
        }
        //delete a file
        File f5=new File("z.txt");
        if(f5.createNewFile()){
            System.out.println("file created");
        }else{
            System.out.println("file already present");
        }
        boolean delete = f5.delete();
        System.out.println(delete);

    }
}
