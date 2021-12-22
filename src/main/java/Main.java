import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> test1 = Arrays.asList("1", "2", "abc", "a3");
        System.out.println(MapTask.mapping(test1));
        List<String> test2 = Arrays.asList("abc", "taras");
        System.out.println(FlattingTask.flattingStrings(test2));
        List<Integer> test3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15);
        System.out.println(FizzBuzzTask.fizzBuzzIt(test3));
        List<String> test4 = Arrays.asList("ABC", "BCB", "AAA", "BC");
        System.out.println(GroupWordsTask.groupIt(test4));
    }
}
