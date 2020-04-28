package Chop3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorAndFor {

	public static void main(String[] args) { 
      /*  Collection<Integer> sampleCollection = new ArrayList<Integer>(); 
        for (int i = 0; i < 10; i++) { 
            sampleCollection.add(i); 
        } 
        System.out.println(sampleCollection);

        for (Iterator<Integer> iterator = sampleCollection.iterator(); iterator.hasNext();) { 
            if (iterator.next() % 3 == 0) { 
                iterator.remove(); 
            } 
        } 
        System.out.println(sampleCollection); */
        
        Collection<Integer> sampleCollection = new ArrayList<Integer>(); 
        for (int i = 0; i < 10; i++) { 
            sampleCollection.add(i); 
        } 
        System.out.println(sampleCollection);

        for (Integer integer : sampleCollection) { 
            if (integer % 3 == 0) { 
                sampleCollection.remove(integer); 
            } 
        } 
        System.out.println(sampleCollection); 
    } 
     

}
