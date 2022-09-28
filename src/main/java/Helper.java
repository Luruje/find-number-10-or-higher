import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Helper {
    public void find10orHigherFromFile(String fileName) {
        List<String> lines = readLinesFromFile(fileName);
        if (lines == null) {
            System.out.println("File is empty!");
        }

        lines.stream()
                .filter(this::containsNumberGreaterThan10)
                .forEach(System.out::println);

    }

    List<String> readLinesFromFile(String fileName) {
        List<String> fileLines = null;
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader)) {

            fileLines = reader.lines().collect(Collectors.toList());

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        return fileLines;
    }

    boolean containsNumberGreaterThan10(String s) {
        Matcher matcher = Pattern.compile("[1-9][0-9]").matcher(s);

        if (matcher.find()) {
            return true;
        }
        return false;
    }
}
