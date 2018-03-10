
import java.io.*;

public class Parser {

    public static void main(String[] args) {
            try {
                FileInputStream fstream = new FileInputStream("input.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                FileWriter writer = new FileWriter("Format.csv");
                String strLine;
                while ((strLine = br.readLine()) != null) {
                    System.out.println(strLine);
                    writer.write(strLine + "\n");
                }
                fstream.close();
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка-Reader");
            }
    }
}

