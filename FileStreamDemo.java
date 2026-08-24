import java.io.*;

public class FileStreamDemo {
    public static void main(String[] args) throws Exception {

        FileOutputStream out = new FileOutputStream("data.txt");

        out.write('A');

        String data = "Hello Java File Handling";
        out.write(data.getBytes());

        out.close();

        FileInputStream in = new FileInputStream("data.txt");

        int ch;
        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }

        in.close();
    }
}