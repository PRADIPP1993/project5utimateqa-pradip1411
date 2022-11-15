package project5utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chorme {

    public static void main(String[] args) {
        //1.setup any browser.
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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
