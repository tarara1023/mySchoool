package myextras.dataStructure_Algoritms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Arrays1 {

    public static void main(String[] args) {
       Array numbers = new Array(3);
       numbers.insert(10);
       numbers.insert(20);
       numbers.removeAt(0);

       numbers.print();

    }
}
