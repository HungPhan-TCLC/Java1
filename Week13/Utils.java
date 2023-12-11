import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Utils {
    public static String readContentFromFile(String path) {
        String result = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String a= reader.readLine();
            while (a != null) {
                result += a + "\n";
                a = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void writeContentToFile(String path) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write("Hi");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeContentToFile2(String path) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.write("Hi");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File[] files = new File(folderPath).listFiles();
        for (File file : files) {
            if (file.getName().equals(fileName)) return file;
        }
        return null;
    }
}