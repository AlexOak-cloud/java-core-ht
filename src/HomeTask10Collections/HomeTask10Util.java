package HomeTask10Collections;

import javafx.concurrent.Task;

import java.util.*;

public class HomeTask10Util {

    public static void showSetString(Set<String> localSet) {
        for (String temporary : localSet) {
            System.out.println(temporary);
        }
    }

    public static void showSetInteger(Set<Integer> localSet) {
        for (Integer temporary : localSet) {
            System.out.println(temporary);
        }
    }

    public static void showMapStringInteger(Map<String, Integer> localMap) {
        for (Map.Entry<String, Integer> temporary : localMap.entrySet()) {
            String key = temporary.getKey();
            int value = temporary.getValue();
            System.out.println(key + " " + value);
        }
    }

    public static void showMapStringString(Map<String, String> localMap) {
        for (Map.Entry<String, String> temporary : localMap.entrySet()) {
            String key = temporary.getKey();
            String value = temporary.getValue();
            System.out.println(key + " " + value);
        }
    }

    public static Set<Integer> createLinkedHashSetInteger() {
        return new LinkedHashSet<>();
    }

    public static Set<String> createLinkedHashSetString() {
        return new LinkedHashSet<>();
    }

    public static Map<Collection<Integer>, Set<String>> creatHashMapIntegerString() {
        return new HashMap<>();
    }

    public static void showMapIntegerString(Map<Integer, String> localMap){
        for(Map.Entry<Integer,String> temporoary : localMap.entrySet()){
            int key = temporoary.getKey();
            String value = temporoary.getValue();
            System.out.println(key + " " + value);
        }
    }

    public static void showMapQuantityString(Map<Task8.Quantity,String> localMap){
        for(Map.Entry<Task8.Quantity,String> temporary : localMap.entrySet()){
            Task8.Quantity key = temporary.getKey();
            String value = temporary.getValue();
            System.out.println(key + " " + value);
        }
    }
}
