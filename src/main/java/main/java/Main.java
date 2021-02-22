package main.java;


import binary_search.BinarySearch;
import rabin_karp.RabinKarpExtended;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("asd", "boris", "fedor", "gerasim", "will"));
        BinarySearch binarySearch = new BinarySearch(list);
        System.out.println(binarySearch.search("a"));
        System.out.println(binarySearch.search("z"));
    }
}
