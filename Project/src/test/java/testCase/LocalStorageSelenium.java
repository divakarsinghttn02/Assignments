package testCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocalStorageSelenium {
    @Test
    public void localStorageSel() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String csmHit=(String) js.executeScript(String.format(
                "return window.localStorage.getItem('%s');", "csm-hit"));

        String csmAdb=(String) js.executeScript(String.format(
                "return window.localStorage.getItem('%s');", "csm:adb"));
        String csmbf=(String) js.executeScript(String.format(
                "return window.localStorage.getItem('%s');", "csm-bf"));
        System.out.println("Local Storage value of Amazon India");
        System.out.println("csm-hit :"+csmHit);
        System.out.println("csm:adb :"+csmAdb);
        System.out.println("csm-bf :"+csmbf);
        driver.quit();

    }

}
