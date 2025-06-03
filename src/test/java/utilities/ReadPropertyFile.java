package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
    public static void main(String[] args) throws IOException {
        // This class is intended to read properties from a file.
        // Implementation details would go here.
        System.out.println("ReadPropertyFile class is ready for implementation.");

        FileReader fr = new FileReader("src/test/resources/configfiles/config.properties");
        Properties p = new Properties();
        p.load(fr);
        System.out.println(p.getProperty("browser"));
        System.out.println(p.getProperty("testurl"));

    }
}
