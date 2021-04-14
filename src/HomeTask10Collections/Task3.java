package HomeTask10Collections;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    private static int nameMathes = 0;
    private static int secondNameMathes = 0;

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Генерал", "Шепард");
        map.put("Гендальф", "Белый");
        map.put("Энакин", "Скайуокер");
        map.put("Рональд", "Уизли");
        map.put("Никола", "Тесла");
        map.put("Генри", "Форд");
        map.put("Уолт", "Дисней");
        map.put("Джайна", "Праудмур");
        map.put("Стивен", "Сигал");
        map.put("Сержант", "Шепард");
        searchForMathes(map);
        System.out.println("Одинаковый имена : "+secondNameMathes+ " человек(а)");
        System.out.println("Одинаковые фамилии : " + nameMathes + " человек(а)");
    }

    //Это, конечно бред, но я старался ->
    public static void searchForMathes(Map<String,String> localMap){
        for(Map.Entry<String,String> externalTemporary: localMap.entrySet()){
            String externalKey = externalTemporary.getKey();
            String externalValue = externalTemporary.getValue();
            for(Map.Entry<String,String > interiorTemporary : localMap.entrySet()){
                String interiorKey = interiorTemporary.getKey();
                String interiorValue = interiorTemporary.getValue();
                if(externalKey.equals(interiorKey)) secondNameMathes++;
                if(externalValue.equals(interiorValue)) nameMathes++;
            }
        }
        nameMathes -= localMap.size();
        secondNameMathes -= localMap.size();
    }
}
