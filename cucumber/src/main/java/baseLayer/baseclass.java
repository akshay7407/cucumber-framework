package baseLayer;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;


public class baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public baseclass()  {
		try {
			prop=new Properties();
			FileInputStream  fis=new FileInputStream("C:\\Users\\lenovo\\Desktop\\java files\\cucumber\\src\\main\\java\\config\\config.properties");
			prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public static void initalization() {
	
	String browsername=prop.getProperty("browser");


		if(browsername.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\java files\\hybrid_framework\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\lenovo\\Desktop\\java files\\hybrid_framework\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
		else if (browsername.equals("opera")) {
			System.setProperty("webdriver.opera.driver",
					"C:\\Users\\lenovo\\Desktop\\java files\\hybrid_framework\\driver\\operadriver.exe");
			driver = new OperaDriver();

		}
           driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
           driver.get(prop.getProperty("url"));

	}

}
