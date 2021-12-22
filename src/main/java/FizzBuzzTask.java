import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzTask {

    public static List<String> fizzBuzzIt(List<Integer> array) {
        return array.stream().map(x -> {
            if (x % 3 == 0) {
                if (x % 5 == 0) return "fizz buzz";
                return "fizz";
            }
            if (x % 5 == 0) {
                return "buzz";
            }
            return x.toString();
        }).collect(Collectors.toList());
    }
}
