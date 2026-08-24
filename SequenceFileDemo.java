import java.io.*;

public class SequenceFileDemo {
    public static void main(String[] args) throws Exception {

        FileInputStream file1 = new FileInputStream("file1.txt");
        FileInputStream file2 = new FileInputStream("file2.txt");

        SequenceInputStream sequence =
                new SequenceInputStream(file1, file2);

        FileOutputStream output =
                new FileOutputStream("combined.txt");

        int ch;

        while ((ch = sequence.read()) != -1) {
            output.write(ch);
        }

        sequence.close();
        output.close();

        System.out.println("Two files combined successfully.");
    }
}