package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected static WebDriver driver;
    private static String url_base = "https://www.google.com.br/";
    private static String path_driver = "src/test/java/automatizado/resource/chromedriver_103.0.5060.exe";

    @BeforeClass
    public static void iniciar(){
        System.setProperty("webdriver.chrome.driver", path_driver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url_base);
    }

    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
}
