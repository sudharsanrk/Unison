//version 1: Developed by <venkat> on June 1st 2024

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.BaseClass;

public class Socialmediaicons {
    static WebDriver driver = BaseClass.driver;

    public static void President_Profile() {
        try {
            Thread.sleep(1000);
            WebElement profile = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[1]/div/div[1]/div"));
            Actions actions = new Actions(driver);
            actions.moveToElement(profile);
            actions.perform();
        } catch (Exception e) {
            System.out.println("An error occurred in President_Profile: " + e.getMessage());
        }
    }
    
    public static void Facebook() {
        try {
            String originalHandle = driver.getWindowHandle();
            WebElement facebook = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[1]/div/div[3]/div/div[1]/a/i"));
            Thread.sleep(1000);
            Actions newTab = new Actions(driver);
            newTab.keyDown(Keys.CONTROL).click(facebook).keyUp(Keys.CONTROL).build().perform();

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.facebook.com/";
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Matches the URL");
            } else {
                System.out.println("Please check the URL");
            }

            driver.close();
            driver.switchTo().window(originalHandle);
        } catch (Exception e) {
            System.out.println("An error occurred in Facebook: " + e.getMessage());
        }
    }

    public static void Twitter() {
        try {
            String originalHandle = driver.getWindowHandle();
            WebElement twitter = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[1]/div/div[3]/div/div[2]/a/i"));
            Thread.sleep(1000);
            Actions newTab = new Actions(driver);
            newTab.keyDown(Keys.CONTROL).click(twitter).keyUp(Keys.CONTROL).build().perform();

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://x.com/";
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Matches the URL");
            } else {
                System.out.println("Please check the URL");
            }

            driver.close();
            driver.switchTo().window(originalHandle);
        } catch (Exception e) {
            System.out.println("An error occurred in Twitter: " + e.getMessage());
        }
    }

    public static void linkedin() {
        try {
            String originalHandle = driver.getWindowHandle();
            WebElement linkedin = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[1]/div/div[3]/div/div[3]/a/i"));
            Thread.sleep(1000);
            Actions newTab = new Actions(driver);
            newTab.keyDown(Keys.CONTROL).click(linkedin).keyUp(Keys.CONTROL).build().perform();

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.linkedin.com/in/dinesh-pappen-2282a812/";
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Matches the URL");
            } else {
                System.out.println("Please check the URL");
            }

            driver.close();
            driver.switchTo().window(originalHandle);
        } catch (Exception e) {
            System.out.println("An error occurred in linkedin: " + e.getMessage());
        }
    }

    public static void Cofounder_Profile() {
        try {
            Thread.sleep(1000);
            WebElement profile = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[2]/div"));
            Actions actions = new Actions(driver);
            actions.moveToElement(profile);
            actions.perform();
        } catch (Exception e) {
            System.out.println("An error occurred in Cofounder_Profile: " + e.getMessage());
        }
    }

    public static void Facebookcofounder() {
        try {
            String originalHandle = driver.getWindowHandle();
            WebElement facebook = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div[1]/a/i"));
            Thread.sleep(1000);
            Actions newTab = new Actions(driver);
            newTab.keyDown(Keys.CONTROL).click(facebook).keyUp(Keys.CONTROL).build().perform();

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.facebook.com/";
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Matches the URL");
            } else {
                System.out.println("Please check the URL");
            }

            driver.close();
            driver.switchTo().window(originalHandle);
        } catch (Exception e) {
            System.out.println("An error occurred in Facebookcofounder: " + e.getMessage());
        }
    }

    public static void Twittercofounder() {
        try {
            String originalHandle = driver.getWindowHandle();
            WebElement twitter = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div[2]/a/i"));
            Thread.sleep(1000);
            Actions newTab = new Actions(driver);
            newTab.keyDown(Keys.CONTROL).click(twitter).keyUp(Keys.CONTROL).build().perform();

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://x.com/";
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Matches the URL");
            } else {
                System.out.println("Please check the URL");
            }

            driver.close();
            driver.switchTo().window(originalHandle);
        } catch (Exception e) {
            System.out.println("An error occurred in Twittercofounder: " + e.getMessage());
        }
    }

    public static void linkedincofounder() {
        try {
            String originalHandle = driver.getWindowHandle();
            WebElement linkedin = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div[3]/a/i"));
            Thread.sleep(1000);
            Actions newTab = new Actions(driver);
            newTab.keyDown(Keys.CONTROL).click(linkedin).keyUp(Keys.CONTROL).build().perform();

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.linkedin.com/in/pachidam/";
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Matches the URL");
            } else {
                System.out.println("Please check the URL");
            }

            driver.close();
            driver.switchTo().window(originalHandle);
        } catch (Exception e) {
            System.out.println("An error occurred in linkedincofounder: " + e.getMessage());
        }
    }

    public static void Cofounder2_Profile() {
        try {
            Thread.sleep(1000);
            WebElement profile = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[3]/div"));
            Actions actions = new Actions(driver);
            actions.moveToElement(profile);
            actions.perform();
        } catch (Exception e) {
            System.out.println("An error occurred in Cofounder2_Profile: " + e.getMessage());
        }
    }

    public static void Facebookcofounder2() {
        try {
            String originalHandle = driver.getWindowHandle();
            WebElement facebook = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[3]/div/div[3]/div/div[1]/a/i"));
            Thread.sleep(1000);
            Actions newTab = new Actions(driver);
            newTab.keyDown(Keys.CONTROL).click(facebook).keyUp(Keys.CONTROL).build().perform();

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.facebook.com/";
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Matches the URL");
            } else {
                System.out.println("Please check the URL");
            }

            driver.close();
            driver.switchTo().window(originalHandle);
        } catch (Exception e) {
            System.out.println("An error occurred in Facebookcofounder2: " + e.getMessage());
        }
    }

    public static void Twittercofounder2() {
        try {
            String originalHandle = driver.getWindowHandle();
            WebElement twitter = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[3]/div/div[3]/div/div[2]/a/i"));
            Thread.sleep(1000);
            Actions newTab = new Actions(driver);
            newTab.keyDown(Keys.CONTROL).click(twitter).keyUp(Keys.CONTROL).build().perform();

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://x.com/";
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Matches the URL");
            } else {
                System.out.println("Please check the URL");
            }

            driver.close();
            driver.switchTo().window(originalHandle);
        } catch (Exception e) {
            System.out.println("An error occurred in Twittercofounder2: " + e.getMessage());
        }
    }

    public static void linkedincofounder2() {
        try {
            String originalHandle = driver.getWindowHandle();
            WebElement linkedin = driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[6]/div/div/div/div/div[2]/div[3]/div/div[3]/div/div[3]/a/i"));
            Thread.sleep(1000);
            Actions newTab = new Actions(driver);
            newTab.keyDown(Keys.CONTROL).click(linkedin).keyUp(Keys.CONTROL).build().perform();

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(originalHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }
            
            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.linkedin.com/in/ghouse-mulla-ba597620/";
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Matches the URL");
            } else {
                System.out.println("Please check the URL");
            }

            driver.close();
            driver.switchTo().window(originalHandle);
            driver.quit();
        } catch (Exception e) {
            System.out.println("An error occurred in linkedincofounder2: " + e.getMessage());
        }
    }
}
