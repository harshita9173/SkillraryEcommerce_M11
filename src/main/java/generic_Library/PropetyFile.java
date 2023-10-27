package generic_Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropetyFile {
	public String getPropertydata(String key) throws Throwable {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
		
	}
}
