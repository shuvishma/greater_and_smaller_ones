import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//import jdk.internal.org.jline.utils.InputStreamReader;

//import jdk.internal.org.jline.utils.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ;
        String[] str = read.readLine().trim().split(" ") ;
        int n = Integer.parseInt(str[0]) ;
        int k = Integer.parseInt(str[1]) ;
        str = read.readLine().trim().split(" ") ;
        int[] arr = new int[n] ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]) ;
        }

        HashSet<Integer> greater = new HashSet<>() ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= k) {
                greater.add(arr[i]) ;
            }    
        }
        //System.out.println(greater.size());
        if(greater.size() != 0){
            Iterator itr1 = greater.iterator() ;
            while (itr1.hasNext()) {
                System.out.print(itr1.next() + " ");
            }
        }
        else{
            System.out.print("-1");
        }


        System.out.println();


        HashSet<Integer> smallest = new HashSet<>() ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < k) {
                smallest.add(arr[i]) ;
            }    
        }
        //System.out.println(greater.size());
        if(smallest.size() != 0) {
            Iterator itr2 = smallest.iterator() ;
            while (itr2.hasNext()) {
                System.out.print(itr2.next() + " ");
            }
        }
        else{
            System.out.print("-1");
        }
        
    }
}