package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TelerikAssignment
{
    public static final  String Helptype = "Invoicing/Billing";
    public static final  String Interesttype = "Testing Framework";
    public static final  String FirstName = "Madhan";
    public static final String LastName = "Kumar";
    public static void main(String[] args) throws InterruptedException
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Launch the browser and Load Url as "https://www.telerik.com/contact"
        driver.get("https://www.telerik.com/contact");

        //Select "Invoicing/Billing" from the first dropdown using selectByValue
        WebElement help = driver.findElement(By.xpath("//select[@id='Dropdown-1']"));
        Select select = new Select(help);
        select.selectByValue(Helptype);

        //Choose "Testing Framework" from the dropdown
        WebElement interest = driver.findElement(By.id("Dropdown-2"));
        Select select2 = new Select(interest);
        select2.selectByValue(Interesttype);

        //Enter 'Your First Name' in the first name field
        driver.findElement(By.id("Textbox-1")).sendKeys(FirstName);

        //	 * > Enter 'Your Last Name' in the last name field
        driver.findElement(By.id("Textbox-2")).sendKeys(LastName);

        Thread.sleep(2000L);
        //	 * > Select "United States" from the country dropdown using selectByIndex
        WebElement country = driver.findElement(By.id("Country-1"));
        Select select3 = new Select(country);
        select3.selectByIndex(1);
        //	 * > Quit the driver
        driver.quit();

    }
}
