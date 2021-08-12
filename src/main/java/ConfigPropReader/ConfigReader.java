package ConfigPropReader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	private FileInputStream fis;
	
	public Properties initializeProp(String language)
	{
		System.out.println("Language is :: "+language);
		try
		{
		
		switch (language.toLowerCase()) {
		case "english":
			fis = new FileInputStream("./src/test/resources/language/configFiles/English.properties");
			
			break;
		case "arabic":
			fis = new FileInputStream("./src/test/resources/language/configFiles/Arabic.properties");
			
			break;
		case "chinese":
			fis = new FileInputStream("./src/test/resources/language/configFiles/Chinese.properties");
			
			break;
		case "spanish":
			fis = new FileInputStream("./src/test/resources/language/configFiles/Spanish.properties");
			
			break;
		case "russian":
			fis = new FileInputStream("./src/test/resources/language/configFiles/Russian.properties");
			
			break;
		case "french":
			fis = new FileInputStream("./src/test/resources/language/configFiles/French.properties");
			
			break;
			
			

		default:
			System.out.println("Please check the language you entered : "+language);
			break;
		}
		prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return prop;
	}
	

}
