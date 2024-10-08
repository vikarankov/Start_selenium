package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsILCarro {

    WebDriver driver = new ChromeDriver();

    @Test
    public void cssIlCarro(){
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();

        WebElement btnSearch = driver.findElement(By.cssSelector("a[ng-reflect-router-link='search']"));
        System.out.println(btnSearch.getText());

        WebElement btnLetCarWork = driver.findElement(By.cssSelector("div[class='header']>a:nth-child(2)"));
        System.out.println(btnLetCarWork.getText());

        WebElement spanCity = driver.findElement(By.cssSelector("form[class='ng-untouched ng-pristine ng-invalid']"));
        System.out.println(spanCity.getAttribute("class"));


        pause(5);
        // driver.close();
        driver.quit();
    }

    public void pause(int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
