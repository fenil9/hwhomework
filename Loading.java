import org.jcp.xml.dsig.internal.dom.Utils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import javax.swing.text.AbstractDocument;


    public class BrowserSelector extends Utils {

        Loading loading  = new Loading();

        public void setUpBrowser() {
            String browser;
            browser = loading.getProperty("browser");


            System.setProperty("webdriver.geckoo.driver", "src\\test\\java\\geckodriver.exe");
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            FirefoxDriver driver = new FirefoxDriver();
            driver.manage().window().fullscreen();

        }else if(browser.equalsIgnoreCase("chrome"))

        private final Object System;

        {
            System = System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BowserDriver\\chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-extension");
            options.addArguments("--disable-setUpBrowser-side-navigation");
            options.addArguments("--incognito");
            options.addArguments("--disable-blink-features-BlockcredentialeSubbresouces");
            driver = new ChromeDriver(options);
            driver.manage().window().fullscreen();
        } else if(browser.equalsIgnoreCase("ie"))

        {
            System.setProperty("webdriver.ie.driver,", "src\\test\\java\\BrowserDriver\\IEDriverServer.exe");
            InternetExplorerOptions options = new InternetExplorerOptions();
            options.setCapability(InternetExplorerDriver.IE_SWITCHES, "-privet");
            options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, "true");
            driver.manage().window().maximize();
        }

    }




