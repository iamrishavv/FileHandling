package BasicJava;

import java.io.*;

//The process of storing object data into  a file/bits/bytes is called serialization(to avoid data loss if program terminated.)
//the process of converting back file data to object data is called deserialization
//To perform  Serialization and de-serialization we need to implement serializable Marker interface.
public class serializationAndDeserialization {
    static class Person implements Serializable{
        //we can define our serial uid son that if our .class file changes it doest not give invalid class exception.
        // if after serialization we change our object data then after this the sid will not change and will not give error.
        @Serial
        private static final long serialVersionUID = 1L;
        int id;
        String name;
        //transient is a keyword used in serialization to indicate that a variable should NOT be serialized.
        //The value of a transient variable is skipped during serialization.
        transient int passWord;
        Person(int id,String name, int passWord){
            this.id=id;
            this.name=name;
            this.passWord=passWord;
        }

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p=new Person(1,"rishav",10);
        System.out.println(" Serialization Started");
        FileOutputStream fos=new FileOutputStream("person.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(p);
        oos.flush();
        oos.close();
        System.out.println(" Object Serialized successfully");
        System.out.println("DeSerialization Started");
        FileInputStream fis=new FileInputStream("person.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object obj = ois.readObject();
        Person p1=(Person) obj;
        System.out.println( p1.id);
        System.out.println(p1.name);
        System.out.println(p1.passWord);
        System.out.println("Deserialization ended");


    }
}
