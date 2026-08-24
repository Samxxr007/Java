import java.io.*;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws Exception {

        FileWriter writer = new FileWriter("sample.txt");

        writer.write('J');

        String data = "Java File Reader and Writer";
        writer.write(data);

        writer.close();

        FileReader reader = new FileReader("sample.txt");

        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

        reader.close();
    }
}