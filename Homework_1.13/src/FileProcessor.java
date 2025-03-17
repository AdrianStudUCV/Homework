import java.io.*;

public class FileProcessor {

    public static int readNumberFromFile(String filePath) {
        int x = 1; // Valoare implicită
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            if (line != null) {
                x = Integer.parseInt(line.trim()); // Convertim la int
            }
        } catch (FileNotFoundException e) {
            System.out.println("Eroare: Fișierul nu a fost găsit. Se folosește valoarea implicită.");
        } catch (IOException e) {
            System.out.println("Eroare: Problemă la citirea fișierului. Se folosește valoarea implicită.");
        } catch (NumberFormatException e) {
            System.out.println("Eroare: Format invalid. Se folosește valoarea implicită.");
        }
        return x;
    }
}
