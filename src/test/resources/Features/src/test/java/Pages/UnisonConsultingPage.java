//This is a Page file to write the methods for test the Unison Consulting - The Differentiator Section in
//Unison Consulting Website.
//
//Date : 29-05-2024 |Initial Version : 1.0 |  Updated by Sai Krishna
//					|					   |
//Date : 31-05-2024 | New Version    : 1.1 |  Updated by Sai Krishna

//Version- 1.1 Update : Click on next image step was added and methods for scenario outline was also updated.

package Pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utilities.BaseClass;

public class UnisonConsultingPage extends BaseClass {
    
// --------------------Exception for form not found-----------------------------
    public static class FormNotFoundException extends RuntimeException {
        public FormNotFoundException(String message) {
            super(message);
        }
    }

//    -----------------View Our Partners section ------------------------------
    
    public static void OurPartners() throws IOException {
        try {
            WebElement VOPButton = driver.findElement(By.xpath("//*[@id='partner']/div/div/div/div/div/div[1]/div/div[2]/a"));
            VOPButton.click();
            
        } catch (NoSuchElementException e) {
            System.out.println("View Our Partners button not found.");
        }
    }

    public static void OurPartnersImages() throws Exception {
        try {
            WebElement Partners = driver.findElement(By.xpath("//*[@id='us_grid_1']/div[1]/article[1]/div/a"));

            if (Partners.isDisplayed()) {
                System.out.println("Our Partners images are displayed successfully");
            } else {
                System.out.println("Our Partners images are not displayed");
            }
            Thread.sleep(500);
            BaseClass.takeScreenshot("I should see our partners images");
        } catch (NoSuchElementException e) {
            System.out.println("Our Partners images not found.");
        } 
    }

    public static void ClickingImage() throws Exception {
        try {
            WebElement Image = driver.findElement(By.xpath("//*[@id=\"us_grid_1\"]/div[1]/article[1]/div/a"));
            Image.click();
            Thread.sleep(500);
            BaseClass.takeScreenshot("I click on the image");
        } catch (NoSuchElementException e) {
            System.out.println("Image not found.");
        } 
      }

    // This Method has been updated.
    public static void ClickingNextImage() throws Exception {
        try {
            WebElement NextImage = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/figure/img"));
            NextImage.click();
            Thread.sleep(500);
        } catch (NoSuchElementException e) {
            System.out.println("Next image not found.");
        }
    }

//    -------------------------- Join Our Partners Section -------------------------
    
    public static void JoinOurPartners() {
        try {
            WebElement joinPartnersNetworkButton = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[2]/div/div/div/div/div[1]/div[2]/div/div[2]/a"));
            joinPartnersNetworkButton.click();
        } catch (NoSuchElementException e) {
            System.out.println("Join Our Partners button not found.");
        }
    }

    public static void FormValues(String fname, String lastname, String email, String cname, String country, String msg) throws Exception {
        try {
            driver.findElement(By.xpath("//*[@id=\"wpcf7-f4580-o1\"]/form/p/span[1]/input")).sendKeys(fname);
            driver.findElement(By.xpath("//*[@id=\"wpcf7-f4580-o1\"]/form/p/span[2]/input")).sendKeys(lastname);
            driver.findElement(By.xpath("//*[@id=\"wpcf7-f4580-o1\"]/form/p/span[3]/input")).sendKeys(email);
            driver.findElement(By.xpath("//*[@id=\"wpcf7-f4580-o1\"]/form/p/span[4]/input")).sendKeys(cname);

            WebElement countryNameDropdown = driver.findElement(By.xpath("//*[@id=\"wpcf7-f4580-o1\"]/form/p/span[5]/select"));
            Select select = new Select(countryNameDropdown);
            select.selectByVisibleText(country);

            driver.findElement(By.xpath("//*[@id=\"wpcf7-f4580-o1\"]/form/p/span[6]/textarea")).sendKeys(msg);
            Thread.sleep(500);

            BaseClass.takeScreenshot("User enters First Name as " + fname + ", Last Name as " + lastname + ", Work Mail as " + email + ", Company Name as " + cname + ", Your Message as " + msg);
        } catch (ElementNotInteractableException e) {
        	System.out.println("Form not Found");
        } 
        }

    public static void Send() throws Exception {
        try {
            WebElement CheckBox = driver.findElement(By.xpath("//*[@id=\"wpcf7-f4580-o1\"]/form/p/span[7]/span/span/label/input"));
            CheckBox.click();
            WebElement sendButton = driver.findElement(By.xpath("//*[@id=\"wpcf7-f4580-o1\"]/form/p/input"));
            sendButton.click();
            Thread.sleep(500);
            BaseClass.takeScreenshot("User clicks on the send button");
        } catch (ElementNotInteractableException e) {
            System.out.println("Send button or checkbox not found.");
        } 
    }

    public static void XBtn() throws Exception {
        try {
            WebElement xButton = driver.findElement(By.xpath("//*[@id=\"popmake-4579\"]/button"));
            xButton.click();
            Thread.sleep(500);
            BaseClass.takeScreenshot("Click on x Btn");
        } catch (ElementNotInteractableException e) {
            System.out.println("X button not found.");
        } 
    }
}
