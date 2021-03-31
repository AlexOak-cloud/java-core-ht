package HomeTask10Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);
        setInteger.add(4);
        setInteger.add(5);
        setInteger.add(6);
        setInteger.add(7);
        setInteger.add(8);
        setInteger.add(9);
        setInteger.add(10);
        setInteger.add(11);
        setInteger.add(12);
        setInteger.add(13);
        setInteger.add(14);
        setInteger.add(15);
        setInteger.add(16);
        setInteger.add(17);
        setInteger.add(18);
        setInteger.add(19);
        setInteger.add(20);
        fixedSet(setInteger);
        HomeTask10Util.showSetInteger(setInteger);
    }



    private static void fixedSet(Set<Integer> localSet){
        Iterator<Integer> iteratorFOrLocalSet = localSet.iterator();
        while(iteratorFOrLocalSet.hasNext()){
            int value = iteratorFOrLocalSet.next();
            if(value > 10 ){
                iteratorFOrLocalSet.remove();
            }
        }
    }
}
