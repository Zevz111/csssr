package org.openqa.selenium.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class BugNumber7 {
    public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://blog.csssr.ru/qa-engineer/");

            WebElement element = driver.findElement(By.xpath("//a[contains(text(),'НАХОДИТЬ НЕСОВЕРШЕНСТВА')]"));
            element.click();

            WebElement element2 = driver.findElement(By.xpath("//label[contains(.,'Чувство прекрасного')]"));
            element2.click();
            element2.click();

        }
    }