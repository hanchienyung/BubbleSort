package bubble.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class SortingValueswArrayList {

        public static void main( String[] args )
        {
            ArrayList<Integer> alist = new ArrayList<>();

            alist.add(45);
            alist.add(87);
            alist.add(39);
            alist.add(32);
            alist.add(93);
            alist.add(86);
            alist.add(12);
            alist.add(44);
            alist.add(75);
            alist.add(50);



            // Display the original (unsorted values)
            System.out.print("before: ");
            System.out.println(alist);
            Collections.sort(alist);


            // Display the values again, now (hopefully) sorted.
            System.out.print("after : ");
            System.out.println(alist);

        }




}
