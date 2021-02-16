package main.java;


import rabin_karp.RabinKarpExtended;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        RabinKarpExtended rabinKarpExtended = new RabinKarpExtended("asdasdqweqwewertyuiouytre");
        List<Integer> arrayList = rabinKarpExtended.search("as");

        for (Integer current : arrayList){
            System.out.println(current);
        }
    }
}
