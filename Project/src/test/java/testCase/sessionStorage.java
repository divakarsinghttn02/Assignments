package testCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class sessionStorage {

    @Test
    public void sessionStorageSel()  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String pageset=(String) js.executeScript(String.format(
                "return window.sessionStorage.getItem('%s');", "rwolLastPageSet"));
        String eelsts=(String) js.executeScript(String.format(
                "return window.sessionStorage.getItem('%s');","eelsts"));
        String csmtid=(String) js.executeScript(String.format(
                "return window.sessionStorage.getItem('%s');", "csmtid"));
        String csaTabbedBrowsing=(String) js.executeScript(String.format(
                "return window.sessionStorage.getItem('%s');","csa-tabbed-browsing"));
        String H8ER7MVWTDEEMNE2ZPHW=(String) js.executeScript(String.format(
                "return window.sessionStorage.getItem('%s');","H8ER7MVWTDEEMNE2ZPHW"));
        String csmPreviousURL=(String) js.executeScript(String.format(
                "return window.sessionStorage.getItem('%s');","CSM_previousURL"));

        System.out.println("Session Storage value of Amazon India");

        System.out.println("rwolLastPageSet :"+pageset);
        System.out.println("eelsts :"+eelsts);
        System.out.println("csmtid :"+csmtid);
        System.out.println("csa-tabbed-browsing :"+csaTabbedBrowsing);
        System.out.println("H8ER7MVWTDEEMNE2ZPHW :"+H8ER7MVWTDEEMNE2ZPHW);
        System.out.println("CSM_previousURL :"+csmPreviousURL);
        System.out.println("==============================================");
        driver.quit();
    }
}

