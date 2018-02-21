import java.io.*;

public class FileReader {

    public static void main(String[] args) {

        try {
            FileInputStream fstream = new FileInputStream("/home/alex/Downloads/Telegram Desktop/2.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}


