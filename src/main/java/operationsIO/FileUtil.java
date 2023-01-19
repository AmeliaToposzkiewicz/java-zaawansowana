package operationsIO;

import java.io.*;

public class FileUtil {
    public String readFile(String path) {
        //czytanie z pliku
        //automatycznie zamykamy plik
        var stringBuilder = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }

    public void writeFile(String path, String content) {
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(content);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // close zamyka i zapisze
        //flush zapisac i zajrzec do zaktualizowany zasob
    }
}
