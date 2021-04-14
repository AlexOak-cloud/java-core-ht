package HomeTask10Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*Создадим коллекцию Set с типом элементов String.
 Адобавим в неё вот такие десять строк:
 арбуз, банан, вишня, груша, дыня, ежевика,
  женьшень,земляника, ирис, картофель.
  Послеэтого выведем содержимое коллекции
  на экран соблюдаяпорядок добавления*/
public class Task7 {
    public static void main(String[] args) {
        Set<String> foodSet = new LinkedHashSet<>();
        foodSet.add("арбуз");
        foodSet.add("банан");
        foodSet.add("вишня");
        foodSet.add("груша");
        foodSet.add("дыня");
        foodSet.add("ежевика");
        foodSet.add("женьшень");
        foodSet.add("земляника");
        foodSet.add("ирис");
        foodSet.add("картофель");
        HomeTask10Util.showSetString(foodSet);
    }
}
