import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(5);
        intList.add(16);
        intList.add(-1);
        intList.add(-2);
        intList.add(32);
        intList.add(3);
        intList.add(5);
        intList.add(8);
        intList.add(23);
        intList.add(4);
        //Отфильтруйте положительные числа.
        intList.removeIf(x -> x < 0);
        //Найдите среди этих положительных чисел четные.
        intList.removeIf(x -> x % 2 != 0);
        //Отсортируйте отфильтрованные числа в порядке возрастания.
        Collections.sort(intList);
        //Выведите результат на экран.
        System.out.println(intList);
    }

}