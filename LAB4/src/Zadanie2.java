import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie2 {
    public Zadanie2(String plik, char znak){
        int ilosc=0;
        try {
            File tenplik= new File(plik);
            Scanner scan = new Scanner(tenplik);
            while (scan.hasNextLine()) {
                String tekst = scan.nextLine();
                ilosc += (int)tekst.chars().filter(ch -> ch == znak).count();
            }
            scan.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Brak takiego pliku");
            e.printStackTrace();
        }
        System.out.println("Znaleziono " + ilosc + " znaków "+znak);
    }
}