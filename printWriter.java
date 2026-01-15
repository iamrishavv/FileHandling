package BasicJava;

import java.io.*;

//PrintWriter is a character output stream used to write text data (characters, strings, numbers) to:
//Files ,Console,Any Writer/OutputStream
//👉 It makes writing data easy and readable using print() and println() methods.
//Why it is used..
//Can write any data type directly
//No need for manual conversion to String
//Supports auto-flush
//Cleaner than FileWriter / BufferedWriter
public class printWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter pw =new PrintWriter("a.txt");
        //constructors
        //PrintWriter pw = new PrintWriter("file.txt");
        //PrintWriter pw = new PrintWriter(new FileWriter("file.txt"));
        //PrintWriter pw = new PrintWriter(System.out); // console

        pw.println("Hello Java");
        pw.println(100);
        pw.println(10.5);
        pw.println(true);
        pw.write("hi");
        pw.flush();
        pw.close();

        //print
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
