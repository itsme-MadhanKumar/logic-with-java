package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Question15
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://ecommerce-playground.lambdatest.io/");
        driver.findElement(By.xpath("(//div[@class='flex-fill'])[2]")).sendKeys("iphone");
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='price']"));
        System.out.println("Prices of iphones ");
        prices.forEach(a->{
            System.out.print(a.getText()+" ");
        });
        System.out.println("Count of the phones : "+prices.size());
        String title = driver.getTitle();
        if(title.contains("iphone"))
        {
            System.out.println("Title is verified");
        }
        driver.quit();
    }
}
