//This is a Page file for test the Risk Management Drop down of the Unison consulting website.
//
//Date : 29-05-2024 |Initial Version : 1.0 |  Updated by Sai Krishna
//				    |                      |
//Date : 03-05-2024 | New Version    : 1.1 |  Updated by Sai Krishna
//
//Version- 1.1 Update : This is totally new Page file added to the existing project to test Risk Management Dropdown of the Website.


package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.BaseClass;

public class RMDropdownPage extends BaseClass {
    
    public static void RMDropdown() {
        try {
            WebElement Drop = driver.findElement(By.xpath("//*[@id=\"menu-item-4194\"]/a/span[1]"));
            Drop.click();
            Thread.sleep(200);    
        } catch (Exception e) {
            System.out.println("Exception in RMDropdown: " + e.getMessage());
        }
    }

    public static void DropdownCreditRisk() {
        try {
            RMDropdown();
            WebElement CreditDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4297\"]/a/span[1]"));
            CreditDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownCreditRisk: " + e.getMessage());
        }
    }

    public static void DropdownMarketRisk() {
        try {
            RMDropdown();
            WebElement MarketDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4296\"]/a/span[1]"));
            MarketDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownMarketRisk: " + e.getMessage());
        }
    }

    public static void DropdownLiquidityRisk() {
        try {
            RMDropdown();
            WebElement LiquidityDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4295\"]/a/span[1]"));
            LiquidityDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownLiquidityRisk: " + e.getMessage());
        }
    }

    public static void DropdownEnterpriseRisk() {
        try {
            RMDropdown();
            WebElement EnterpriseDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4294\"]/a/span[1]"));
            EnterpriseDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownEnterpriseRisk: " + e.getMessage());
        }
    }

    public static void DropdownRegulatoryRisk() {
        try {
            RMDropdown();
            WebElement RegulatoryDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4293\"]/a/span[1]"));
            RegulatoryDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownRegulatoryRisk: " + e.getMessage());
        }
    }

    public static void DropdownStatisticalBehavioralModelling() {
        try {
            RMDropdown();
            WebElement StatisticalDrop = driver.findElement(By.xpath("//*[@id=\"menu-item-4292\"]/a/span[1]"));
            StatisticalDrop.click();
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println("Exception in DropdownStatisticalBehavioralModelling: " + e.getMessage());
        }
    }
}
