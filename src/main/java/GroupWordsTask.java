import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {

    public static Map.Entry<String, String> transform(Map.Entry<Character, List<String>> e) {
        return new AbstractMap.SimpleEntry<>(String.valueOf(e.getKey()), Collections.frequency(e.getValue(), e.getKey())
                .stream().collect(Collectors.joining()));
    }

    public static Map<String, String> groupIt(List<String> array) {
        return array.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet().stream().map(GroupWordsTask::transform).collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue));

    }
}
