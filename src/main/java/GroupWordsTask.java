import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupWordsTask {

    public static Map.Entry<String,String> transform(Map.Entry<Character, List<String>> el){
        return new AbstractMap
                .SimpleEntry<>(
                String.valueOf(el.getKey()),
                el.getValue().stream().collect(joining()));
    }

    public static Map<String, String> groupIt(List<String> array) {
        return array.stream()
                .collect(groupingBy(value -> value.charAt(0), HashMap::new, toList()))
                .entrySet()
                .stream()
                .map(GroupWordsTask::transform)
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue))
                .entrySet()
                .stream()
                .collect(toMap(Map.Entry::getKey, x -> x.getValue().chars().filter(y -> y == x.getKey().charAt(0)).count()));
    }
}
