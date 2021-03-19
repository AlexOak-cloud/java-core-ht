package HomeTask4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = Utils.createArray(10);
        Utils.initAnyArray(array);
        Utils.showArray(array);

        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array.length / 2; j++) {
                if (array[i] < array[j]) {
                    int sort = array[i];
                    array[i] = array[j];
                    array[j] = sort;
                }
            }
        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int sort = array[i];
                    array[i] = array[j];
                    array[j] = sort;
                }
            }
        }
        Utils.showArray(array);
    }
}
