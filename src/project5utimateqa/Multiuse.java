package project5utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multiuse {

    //1.setup any browser.
    static String browser = "edge";
    //2.open URL.
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        //1.setup any browser.
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();

            //1.setup any browser.
        } else if (browser.equalsIgnoreCase("firefox")) {
            //firefox driver line.
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();

            //1.setup any browser
        } else if (browser.equalsIgnoreCase("edge")) {
            //edge driver line.
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong Browser Name");
        }

        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        // we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3.Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        // 4.Get the current URL name
        String Url = driver.getCurrentUrl();
        System.out.println(" Current Url: " + Url);

        // 5.Get page Source code
        System.out.println("page Source : " + driver.getPageSource());

        //Find the email field element
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("test123@gmail.com");


        //find the password filed element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("test123");

        //close the browser
        driver.quit();


    }

}
