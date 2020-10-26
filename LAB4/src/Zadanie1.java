import java.util.ArrayList;

public class Zadanie1 {
    public static int countChar(String str, char c) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static int countSubStr(String str, String subStr) {
        int dl_str = str.length();
        int dl_subStr = subStr.length();

        if (str.isEmpty() || subStr.isEmpty() || dl_subStr > dl_str) {
            return 0;
        }

        int index = 0;
        int count = 0;
        String temp;

        for (int i = 0; i < dl_str; i++) {
            if (index + dl_subStr <= dl_str) {
                temp = str.substring(index, index + dl_subStr);
                if (temp.equals(subStr)) {
                    count++;
                }
                index++;
            }
        }
        return count;
    }

    public static String middle(String str) {
        String wynik;
        int dl = str.length();
        if (dl % 2 == 1) {
            wynik = str.substring(dl / 2, dl / 2 + 1);
        } else {
            wynik = str.substring(Math.abs(dl / 2) - 1, Math.abs(dl / 2) + 1);
        }
        return wynik;
    }

    public static String repeat(String str, int n) {
        StringBuilder napis = new StringBuilder();
        while (n > 0) {
            napis.append(str);
            n--;
        }

        return napis.toString();
    }

    public static int[] where(String str, String subStr) {
        int[] tab = new int[countSubStr(str, subStr)];
        int n = 0;
        int dl_str = str.length();
        int dl_subStr = subStr.length();

        if (str.isEmpty() || subStr.isEmpty() || dl_subStr > dl_str) {
            return tab;
        }

        int index = 0;
        String temp;

        for (int i = 0; i < dl_str; i++) {
            if (index + dl_subStr <= dl_str) {
                temp = str.substring(index, index + dl_subStr);
                if (temp.equals(subStr)) {
                    tab[n] = i;
                    n++;
                }
                index++;
            }
        }
        return tab;
    }

    public static String change(String str) {
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase((str.charAt(i)))) {
                temp.append(String.valueOf(str.charAt(i)).toLowerCase());
            } else temp.append(String.valueOf(str.charAt(i)).toUpperCase());
        }
        return temp.toString();
    }

    public static String nice(String str) {
        StringBuffer temp = new StringBuffer("");
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            index++;
            if (index % 3 == str.length() % 3 && i != str.length() - 1) {
                temp.append(",");
            }
        }
        return temp.toString();
    }

    public static String nice (String str, char c, int n){
        StringBuffer temp = new StringBuffer();
        int index=0;
        for (int i=0;i<str.length();i++){
            temp.append(str.charAt(i));
            index++;
            if(index%n==str.length()%n&&i!=str.length()-1){
                temp.append(c);
            }
        }
        return temp.toString();
    }
}
