/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Boiana
 */
public class AddBagTest {

    private WebDriver driver;
    private String baseUrl;

    public AddBagTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testAddBag3() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.marshalls.com/us/store/shop/womens-tote-bags/_/N-3343251189?mm=Beauty+%26+Accessories%3Af%3A+%3A2%3ATote+Bags%3AHandbags+%26+Luggage");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//div[@id='style-4000204939']/div/div/a/img[2]")).click();
        driver.get("https://www.marshalls.com/us/store/jump/product/beauty-accessories-beauty-accessories-handbags-tote-bags/Nylon-Puffy-Holdall/4000204939?colorId=NS4154762&pos=1:2&N=3343251189");
        driver.findElement(By.id("addItemToOrder")).click();
        driver.findElement(By.linkText("View Bag")).click();
        driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
        driver.quit();
    }
}
