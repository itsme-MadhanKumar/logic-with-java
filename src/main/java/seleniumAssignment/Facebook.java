package seleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
public class Facebook
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.facebook.com/");
        List<WebElement> list = driver.findElements(By.xpath("//div[@id='pageFooter']//ul//li//a"));
        list.forEach(a->
        {
            System.out.println(a.getText());
        });

        //================================OUTPUT =============================================
        //தமிழ்
        //తెలుగు
        //ಕನ್ನಡ
        //اردو
        //हिन्दी
        //മലയാളം
        //සිංහල
        //ਪੰਜਾਬੀ
        //বাংলা
        //ગુજરાતી
        //
        //Sign up
        //Log in
        //Messenger
        //Facebook Lite
        //Video
        //Meta Pay
        //Meta Store
        //Meta Quest
        //Ray-Ban Meta
        //Meta AI
        //Meta AI more content
        //Instagram
        //Threads
        //Voting Information Centre
        //Privacy Policy
        //Privacy Centre
        //About
        //Create ad
        //Create Page
        //Developers
        //Careers
        //Cookies
        //AdChoices
        //Terms
        //Help
        //Contact uploading and non-users
        //Settings
        //Activity log
        //
        //Process finished with exit code 0
    }
}
