package BasicJava;

import java.io.*;
import java.nio.Buffer;

public class writeAndReadFile {
    public static void main(String[] args) throws IOException {
        File f=new File("ab.txt");
        boolean newFile = f.createNewFile();
        System.out.println(newFile);
        //we can directly use file writer to create a  file and write data inside it.
        //if file will be present then it will override it and if not present then it will create a new one.
        FileWriter fw=new FileWriter(f);
        //fr.write('a');
        fw.write("Hi Good Night");
        fw.write('\n');//-->> new line.
        fw.write("How are You");
        fw.flush();
        fw.close();
        FileReader fr=new FileReader("ab.txt");
        int i = fr.read();
        System.out.println(i);//gives ascii code value of first character.
        System.out.println((char) i);//down-casting to represent in character format.
        // to read all character
        while( i !=-1){
            System.out.println((char) i);
            i=fr.read();
        }
        fr.close();
        //Line by line
       // InputStreamReader ir=new InputStreamReader(System.in);--> it is required if buffer reader wants to communicates with the keyboard
        FileReader frr=new FileReader("ab.txt");// if we need to communicate to file we need bufferReader with fileReader.
        BufferedReader br=new BufferedReader(frr);
        String s = br.readLine();
        // to read all line till line is empty
        while(s!=null){
            System.out.println(s);
            s=br.readLine();
        }


    }
}
