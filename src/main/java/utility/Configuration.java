package utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class Configuration {

    public static String getProperty(String fileName, String propertyName) {
        Properties properties = new Properties();
        String propertyValue = null;
        try (InputStream input = Configuration.class.getClassLoader().getResourceAsStream(
                fileName)) {
            properties.load(Objects.requireNonNull(input));
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException ioex) {
            System.out.println("Problems opening properties:" + ioex);
        }
        return propertyValue;
    }
}
