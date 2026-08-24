import java.io.*;

public class FileCount {
    public static void main(String[] args) throws Exception {

        FileReader reader = new FileReader("sample.txt");

        int lines = 1;
        int chars = 0;
        int ch;

        while ((ch = reader.read()) != -1) {
            chars++;

            if (ch == '\n') {
                lines++;
            }
        }

        reader.close();

        System.out.println("Number of Lines = " + lines);
        System.out.println("Number of Characters = " + chars);
    }
}