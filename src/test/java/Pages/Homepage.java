//Version history
//V1.0 - initial code push by SaiKrishna on <29-05-24>
//V1.1 - Added missing scenarios in this Homepage class by <venkat> on 30-05-2024
//     Line no:41-47 here SaiKrishna written the code in displayed method.
//     <Venkat> Added the code from line no: 49-74 its saves the time until no to wait the  button is displayed
//		I added one method to base class which is repeated two times.
     

package Pages;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.BaseClass;

public class Homepage {

    static WebDriver driver = BaseClass.driver;
    public static void TitleCheck(String expectedTitle) {
        try {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
            String actualTitle = driver.getTitle();
            Assert.assertEquals("The title of the website does not match", expectedTitle, actualTitle);
        } catch (Exception e) {
            // Handle the exception here
            System.out.println("Exception occurred in TitleCheck: " + e.getMessage());
        }
    }
    public static void LogoCheck() {
        try {
            WebElement logo = driver.findElement(By.xpath("//*[@id='page-header']/div[1]/div/div[1]/div/a/img"));
            Assert.assertTrue("The website logo is not displayed", logo.isDisplayed());
        } catch (Exception e) {
            // Handle the exception here
            System.out.println("Exception occurred in LogoCheck: " + e.getMessage());
        }
    }
    
//	public static void ReadMoreBtnCheck() {
//  WebElement readMoreButton = driver.findElement(By.xpath("//*[@id=\"slider-1-slide-1-layer-2\"]"));
//  if(!readMoreButton.isDisplayed()) {
//  	while(!readMoreButton.isDisplayed());
//  }
//  readMoreButton.click();
//}
    
    public static void Read_more_under_powering() {
        try {
            WebElement bulletbutton = driver.findElement(By.xpath("//*[@id=\"rev_slider_1_1\"]/rs-bullets/rs-bullet[1]/span"));
            Thread.sleep(500);
            bulletbutton.click();
            WebElement readmore = driver.findElement(By.xpath("//*[@id=\"slider-1-slide-1-layer-2\"]"));
            Thread.sleep(500);
            readmore.click();
        } catch (Exception e) {
            // Handle the exception here
            System.out.println("Exception occurred in Read_more_under_powering: " + e.getMessage());
        }
    }
    public static void Read_more_button_Helping() {
        try {
            Thread.sleep(1000);
            WebElement bulletbutton = driver.findElement(By.xpath("//*[@id=\"rev_slider_1_1\"]/rs-bullets/rs-bullet[2]/span"));
            bulletbutton.click();
            Thread.sleep(500);
            WebElement readmore = driver.findElement(By.xpath("//*[@id=\"slider-1-slide-2-layer-2\"]"));
            readmore.click();
        } catch (Exception e) {
            // Handle the exception here
            System.out.println("Exception occurred in Read_more_button_Helping: " + e.getMessage());
        }
    }

    public static void JoinUsBtnCheck() {
        try {
            WebElement joinUsButton = driver.findElement(By.xpath("//*[@id=\"slider-1-slide-3-layer-2\"]"));
            if (!joinUsButton.isDisplayed()) {
                while (!joinUsButton.isDisplayed())
                    Thread.sleep(500);
            }
            joinUsButton.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            // Handle the exception here
            System.out.println("Exception occurred in JoinUsBtnCheck: " + e.getMessage());
        }
    }

    public static void JoinUsPageCheck() {
        try {
            String JoinUsUrl = driver.getCurrentUrl();
            Assert.assertEquals("https://unisonconsulting.com.sg/our-partners/", JoinUsUrl);
            BaseClass.Home();
        } catch (Exception e) {
            // Handle the exception here
            System.out.println("Exception occurred in JoinUsPageCheck: " + e.getMessage());
        }
    }
}

