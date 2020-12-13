package lab12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ListaZadan {
    private PriorityQueue <Task> list;

    public void pisz(){
        Scanner scan = new Scanner(System.in);
        String[] words;
        String line = scan.nextLine();
        Iterator<String> iterator;
        while (!line.equals("zakoncz")){
            words = line.split(" ");
            iterator= Arrays.stream(words).iterator();
            if(iterator.hasNext()){
                iterator.next();
                if(words[0].equals("dodaj")){
                    System.out.println("Dodałem polecenie! :)");
                    int prio = 0;
                    StringBuffer opisowo= new StringBuffer();
                    if(iterator.hasNext()){
                        prio=Integer.parseInt(iterator.next());
                    }
                    while (iterator.hasNext()){
                        opisowo.append(iterator.next());
                        opisowo.append(" ");
                    }
                    list.add(new Task(prio,opisowo.toString()));
                }
                else if(words[0].equals("nastepne")){
                    list.remove();
                    System.out.println("Usunąłem polecenie! :)");
                }
                else {
                    System.out.println("Nie rozpoznano polecenia! :(");
                }
            }
            line = scan.nextLine();

        }
    }

    public ListaZadan(){
        this.list = new PriorityQueue<>();
        this.pisz();
    }

    public void wypisz(){
        PriorityQueue<Task> kopia = new PriorityQueue<>(this.list);
        while(!kopia.isEmpty()){
            Task e = kopia.remove();
            System.out.println("Priorytet: "+e.priority);
            System.out.println("Opis: "+e.opis);
        }
    }
}

class Task implements Comparable<Task>{
    public Task(int priority, String opis){
        this.opis=opis;
        this.priority=priority;
    }

    int priority;
    String opis;

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority, o.priority);
    }
}