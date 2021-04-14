package HomeTask10Collections;

/*Напишите метод, который получает на вход Map<K, V>
и возвращает Map, где ключи изначения поменяны местами.
 Так как значения могутсовпадать, то тип значения в Map
 будетуже не K, а Collection<K>: Map<V, Collection<K>>*/

import com.sun.xml.internal.fastinfoset.util.QualifiedNameArray;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Молоко", 2);
        map.put("Батон", 1);
        map.put("Колбаса", 1);
        map.put("Сахар", 1);
        map.put("Мороженное", 4);
        HomeTask10Util.showMapStringInteger(map);
        System.out.println();
        System.out.println();
        Map<Quantity,String> fixedMap = exchangeValue(map);
        HomeTask10Util.showMapQuantityString(fixedMap);



    }


    private static Map<Quantity,String> exchangeValue(Map<String, Integer> actionMap) {
        Map<Quantity,String > fixedMap = new HashMap<>();
        for (Map.Entry<String, Integer> temporary : actionMap.entrySet()) {
            String key = temporary.getKey();
            int value = temporary.getValue();
            fixedMap.put(new Quantity(value),key);
        }
        return fixedMap;
    }


    public static class Quantity{
        int qantity;

        public Quantity(int qantity) {
            this.qantity = qantity;
        }

        public int getQantity() {
            return qantity;
        }

        @Override
        public String toString() {
            return String.valueOf(getQantity());
        }
    }
}
