package comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args){
        String baseUrl="http://the-internet.herokuapp.com/login";
        //Launch the Chrome Browser
        WebDriver driver=new ChromeDriver();

        //open the Url in to the browser
        driver.get(baseUrl);

        //maximize Browser size
        driver.manage().window().maximize();

        //we give implicit wait for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // Get the Title of the page
        System.out.println("Title of the page :" + driver.getTitle());

        //Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page Source " + driver.getPageSource());

        //Enter the Username to Username field
        WebElement usernameField = driver.findElement(By.name("username"));
        //Action
        usernameField.sendKeys("tomsmith");

        // Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        //Action
        passwordField.sendKeys("SuperSecretPassword!");

        //Close the Browser
        driver.close();

    }
}













