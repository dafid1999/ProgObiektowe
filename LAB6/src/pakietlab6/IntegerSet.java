package pakietlab6;

public class IntegerSet {
    private boolean[] zbior;
    public IntegerSet(){
        this.zbior=new boolean[100];
    }

    public static IntegerSet union(IntegerSet a, IntegerSet b){
        IntegerSet nowy = new IntegerSet();
        int i=0;
        while(i<100){
            if(a.zbior[i] || b.zbior[i]){
                nowy.zbior[i]=true;
            }
            i++;
        }
        return nowy;
    }

    public static IntegerSet intersection(IntegerSet a, IntegerSet b){
        IntegerSet nowy = new IntegerSet();
        int i=0;
        while(i<100){
            if(a.zbior[i] && b.zbior[i]){
                nowy.zbior[i]=true;
            }
            i++;
        }
        return nowy;
    }

    public void insertElement(int i){
        this.zbior[i-1]=true;
    }
    public void deleteElement(int i){
        this.zbior[i-1]=false;
    }
    @Override
    public String toString(){
        StringBuilder liczby= new StringBuilder();
        int i=0;
        while(i<100){
            if(this.zbior[i]){
                liczby.append(i+1);
                liczby.append(" ");
            }
            i++;
        }
        return liczby.toString();
    }
    public boolean equals(IntegerSet b){
        return this.toString().equals(b.toString());
    }
}
