import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configfile {
	private static Properties properties;
	static {
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\pc\\eclipse-workspace\\javapartice_prograam123\\Sendtojeevan\\src\\main\\resources\\Resource");
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties file");
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
