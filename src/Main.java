import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,1,5,5,8,9,3));
        Stream<Integer> stream = numbers.stream()
                .distinct()
                .filter(x -> x%2==0);
        IntStream intStream = stream.mapToInt(Integer::intValue);
        int sum = intStream.sum();
        System.out.println("До фильтрации: "+numbers);
        System.out.println("Сумма четных и неповторяющихся чисел: "+sum);

        System.out.println("Задание 2:");
       Map<Integer, String> intStrHM = new HashMap<>();
       intStrHM.put(1, "Misha");
       intStrHM.put(2, "Nik");
       intStrHM.put(3, "Din");
       intStrHM.put(4, "Kate");
       intStrHM.put(5, "Pole");
       intStrHM.put(9, "Olga");
       intStrHM.put(10, "Alex");
       intStrHM.put(11, "Lucy");
       intStrHM.put(13, "Lidia");

       Stream<Object> stringStream = intStrHM.entrySet().stream()
               .filter(x -> Arrays.asList(1,2,5,8,9,13).contains(x.getKey()))
               .filter(x -> x.getValue().length() % 2 != 0)
               .map(x -> new StringBuilder(x.getValue()).reverse().toString());

        System.out.println(stringStream.toList());
    }
}