package citi.ta_automation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting Selenium project!" );

        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--diable--notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        WebElement element = driver.findElement(By.xpath("//*[@id = 'email']"));
        element.sendKeys("email@gmail.com");
        WebElement element2 = driver.findElement(By.xpath("//*[@id = 'pass']"));
        element2.sendKeys("pass#");
         
        element2.submit();
    }
}
