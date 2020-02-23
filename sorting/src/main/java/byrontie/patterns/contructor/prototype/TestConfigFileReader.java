package byrontie.patterns.contructor.prototype;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestConfigFileReader {

    public Map<String, String> readFile(String path) {

        Map<String, String> configs = new HashMap<>();

        try (Stream<String> stream = Files.lines(Paths.get(path))) {

            configs = stream.collect(Collectors.toMap(this::getKey, this::getValue));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return configs;
    }

    private String getKey(String line) {
        return line.substring(line.indexOf("=") - 1);
    }

    private String getValue(String line) {
        return line.substring(line.indexOf("=") + 1);
    }

    public Map<String, String> readFileMocked(String path) {

        Map<String, String> configs = new HashMap<>();

        configs.put("url", "www.bestbuy.ca");
        configs.put("author", "byron tie");

        return configs;
    }
}