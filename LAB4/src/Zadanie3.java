import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie3 {
    public Zadanie3(String plik, String wyraz){
        int count=0;
        try {
            File tenplik= new File(plik);
            Scanner scan = new Scanner(tenplik);
            while (scan.hasNextLine()) {
                String tekst = scan.nextLine();
                int len_str=tekst.length();
                int len_subStr=wyraz.length();
                int index=0;
                String temp;
                while(len_str-index>=len_subStr){
                    temp=tekst.substring(index,index+(len_subStr));
                    if(temp.equals(wyraz)) count++;
                    index++;
                }
            }
            scan.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Brak takiego pliku");
            e.printStackTrace();
        }
        System.out.println("Znaleziono " + count + " wyrazu "+wyraz);
    }
}
