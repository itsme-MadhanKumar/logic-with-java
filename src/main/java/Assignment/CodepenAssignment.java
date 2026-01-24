package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CodepenAssignment {

    public static void main(String[] args) throws InterruptedException
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        options.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Navigate to URL "https://codepen.io/unknownUser7/pen/ZEdGLbq".
        driver.get("https://codepen.io/unknownUser7/pen/ZEdGLbq");
        driver.switchTo().frame("result");

        //	 * > Enter the username as "user" and password as "pass".
        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("pass");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "window.__alertText = null;" +
                        "window.alert = function(msg) { window.__alertText = msg; };"
        );
        //	 * > Click on the Login button.
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(1000);

        //	 * > Handle alert and retrieve the text of the alert.
        //	 * > Note: Handle the unexcepted alert.
        String alertText = (String) js.executeScript("return window.__alertText;");
        System.out.println("Alert Text: " + alertText);

        //	 * > Verify the welcome text.
        WebElement welcomeText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("welcomePage"))
        );
        System.out.println("Welcome Text: " + welcomeText.getText());
        driver.quit();
    }
}
