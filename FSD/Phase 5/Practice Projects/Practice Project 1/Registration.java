package selenium.practiceproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Registration 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));       
        Actions a = new Actions(driver);
        a.moveToElement(e1).perform();
       driver.findElement(By.xpath("(//span[@class='nav-text'])[10]")).click();
       Thread.sleep(2000); 
       driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
       Thread.sleep(2000);
       driver.findElement(By.id("ap_password")).sendKeys("123456");
       Thread.sleep(2000);
       driver.findElement(By.id("signInSubmit")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[contains(text(),'Create a new Amazon account')]")).click();
       Thread.sleep(5000);     
       driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("Vishal");
       Thread.sleep(5000);
       driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("vishal@gmail.com");
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("vishal@12345");
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@id='continue'])")).click();
       }
}
