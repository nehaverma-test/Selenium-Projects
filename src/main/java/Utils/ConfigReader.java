package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	static Properties prop;

	static {

		try {
			FileInputStream fin = new FileInputStream(new File(
					"C:\\Users\\NEHA\\Desktop\\Workspace list\\AutomationProject1\\automation_project\\src\\main\\resources\\config.properties"));

			prop = new Properties();
			prop.load(fin);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
