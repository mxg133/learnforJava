package qinghua.ThrowIO.Object;

import java.io.*;

public class SerializableTexter {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Book book = new Book(10086, "Java book", "J.fla", 30);
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("book.dat")
        );
        oos.writeObject(book);
        oos.close();

        book = null;
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("book.dat")
        );
        book = (Book)ois.readObject();
        ois.close();
        System.out.println(book.m_id);
        System.out.println(book.m_name);
        System.out.println(book.m_auhtor);
        System.out.println(book.m_price);
    }
}
