public class PairUtil<T>{
    public static <T> Pair<T> swap(Pair<T> para){
        Pair<T> nowa_para = new Pair<>(para.getFirst(), para.getSecond());
        nowa_para.swap();
        return nowa_para;
    }
}