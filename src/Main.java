import com.google.gson.Gson;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Pokupatel p1 = new Pokupatel("Fedorov Oleg Alekseevich", "kuku97", "adressExample");
        Gson g = new Gson();
        String json = g.toJson(p1);
        System.out.println("1: " + json);
        try (PrintStream out = new PrintStream(new FileOutputStream("jsonShopper.txt"))) {
            out.print(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String json2 = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("jsonShopper.txt")))  {
            json2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json2);
    }
}
