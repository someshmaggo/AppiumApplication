package com.example.somaggo.appiumapplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class FirstTest {


    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException{


       // Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name.
        capabilities.setCapability("deviceName", "Samsung SM-T116IR Android 5.1.1, API 22");

        // Set BROWSER_NAME desired capability. It's Android in our case here.
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

        // Set android VERSION desired capability. Set your mobile device's OS version.
        capabilities.setCapability(CapabilityType.VERSION, "5.1.1");

        // Set android platformName desired capability. It's Android in our case here.
        capabilities.setCapability("platformName", "Android");

        // Set android appPackage desired capability. It is
        // com.android.calculator2 for calculator application.
        // Set your application's appPackage if you are using any other app.
        capabilities.setCapability("appPackage", "com.ionicframework.aceappclient150562");

        // Set android appActivity desired capability. It is
        // com.android.calculator2.Calculator for calculator application.
        // Set your application's appPackage if you are using any other app.
        capabilities.setCapability("appActivity", "com.ionicframework.aceappclient150562.MainActivity");

        // Created object of RemoteWebDriver will all set capabilities.
        // Set appium server address and port number in URL string.
        // It will launch calculator app in android device.

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }

    @Test
    public void testFirstCalculator() throws InterruptedException {


        // Click on DELETE/CLR button to clear result text box before running test.
        //driver.findElement(By.xpath("//android.widget.Button")).click();

        // Click on number 7 button.

        Thread.sleep(300);



        WebDriverWait wait = new WebDriverWait(driver,10000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@content-desc,'Sign Up')]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@content-desc,'Sign Up')]")));

        WebElement element = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Sign Up')]"));

        System.out.println(element.isDisplayed());

        element.isDisplayed();
        element.click();

        Actions actions = new Actions();

        //driver.findElement(By.name("Employee")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[contains(@text,'Enter 10 digit mobile no.')]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[contains(@text,'Enter 10 digit mobile no.')]")));

        //driver.findElement(By.name("Enter 10 digit mobile no.")).click();
        driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Enter 10 digit mobile no.')]")).sendKeys("9800000000");

//        driver.findElement(By.xpath("//android.view.View[@index='8']")).click();
//        driver.findElement(By.xpath("//*[@class='android.view.View' and @index='8']")).sendKeys("9800000000");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[contains(@text,'Enter 8 Digit Agent Code')]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[contains(@text,'Enter 8 Digit Agent Code')]")));

        //driver.findElement(By.name("Enter 8 Digit Agent Code")).click();
        driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Enter 8 Digit Agent Code')]")).sendKeys("70000412");

//        driver.findElement(By.xpath("//android.view.View[@index='6']")).click();
//        driver.findElement(By.xpath("//*[@class='android.view.View' and @index='6']")).sendKeys("70000412");

        //driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//*[@class='android.view.View' and @index='7']")).sendKeys("03/01/1981");

        //driver.findElement(NgBy.model("register.dob"));

        /*driver.findElementsByAccessibilityId("Views").click();
        AndroidElement list = (AndroidElement) driver.findElement(By.id("android:id/mobile_list"));
        MobileElement listGroup = list.findElement(MobileBy.
                AndroidUIAutomator("new UiScrollable(new UiSelector())" +
                        ".scrollIntoView(" + "new UiSelector().text(\"ListView:25\"));"));
        assertNotNull(listGroup.getLocation());
        listGroup.click();*/

        //driver.findElement(By.className("android.view.View:Year")).sendKeys("2000");



        //driver.findElement(By.name("Set")).click();

        //driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

        //driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
/*
        driver.findElement(By.xpath("//android.view.View[@index='7']")).click();

        WebDriverWait wait1 = new WebDriverWait(driver,30);
        wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.name("Set")));

        driver.findElement(By.name("Enter the value")).click();*/
        //driver.findElement(By.name("Enter the value")).sendKeys("2");
        //driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("//android.widget.Button")).click();

        //String val = driver.findElement(By.name("Enter the value")).getText();

        //WebDriverWait wait = new WebDriverWait(driver,5);
        //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.name("Enter the value"),val));

        //String name = driver.findElement(By.id("question")).getAttribute("name");'


        driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Enter date of birth')]")).click();

        String name = driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'question')]")).getAttribute("name");

        System.out.println(name);

        String[] arr = name.split("\\s+",-1);

        for(int i=0;i<5;i++)
        {
            System.out.print(arr);
        }

        if(arr[1].equals("+"))
        {
            int val = Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
            driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Enter the value')]")).sendKeys(String.valueOf(val));
        }
        else if(arr[1].equals("-"))
        {
            int val = Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
            driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Enter the value')]")).sendKeys(String.valueOf(val));
        }
        else if(arr[1].equals("*"))
        {
            int val = Integer.parseInt(arr[0])*Integer.parseInt(arr[2]);
            driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Enter the value')]")).sendKeys(String.valueOf(val));
        }


        /*String s = driver.findElement(By.name("Validation failed!")).getAttribute("name");

        while(s.equals("Validation failed!"))
        {
            driver.findElement(By.name("refresh")).click();
            driver.findElement(By.name("Enter the value")).sendKeys("4");
            driver.findElement(By.xpath("//android.widget.Button")).click();
        }*/

        driver.findElement(By.xpath("//android.widget.Button")).click();



        //driver.findElement(By.name("Enter the value"))




        //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    /*public static void scrollToElement(AndroidDriver driver, String elementName, boolean scrollDown){
        String listID = ((RemoteWebElement) driver.findElementByAndroidUIAutomator(
                "new UiSelector().text(\"Month\")")).getId();
        String direction;
        if (scrollDown) {
            direction = "down";
        } else {
            direction = "up";
        }
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", direction);
        scrollObject.put("element", listID);
        scrollObject.put("text", elementName);
        driver.executeScript("mobile: scrollTo", scrollObject);
    }*/

    @After
    public void End() {
        driver.quit();
    }
}