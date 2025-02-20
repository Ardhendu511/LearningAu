import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileconfigfile { 
	private static Properties properties;

    static {
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\pc\\eclipse-workspace\\javapartice_prograam123\\Search_flipkart_product\\src\\main\\resources");
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties file");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
