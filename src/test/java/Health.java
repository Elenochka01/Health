
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Health {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oea16\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.health-ecommerce.com/");
        driver.manage().window().maximize();
        System.out.println("Opened Website");

        Thread.sleep(3000);
        WebElement about = driver.findElement(By.xpath(Locators.about));
        Actions actions = new Actions(driver);
        actions.moveToElement(about).perform();
        System.out.println("Navigated About section");

        Thread.sleep(3000);
        WebDriverWait waitForWho = new WebDriverWait(driver, 25);
        WebElement whoWeAre = waitForWho.until(ExpectedConditions.elementToBeClickable(By.xpath(Locators.whoWeAre)));
        whoWeAre.click();
        System.out.println("Opened Who we Are");

        Thread.sleep(3000);
        about = driver.findElement(By.xpath(Locators.about));
        actions.moveToElement(about).perform();

        Thread.sleep(3000);
        WebDriverWait waitForWhat = new WebDriverWait(driver, 25);
        WebElement whatWeDo = waitForWhat.until(ExpectedConditions.elementToBeClickable(By.xpath(Locators.whatWeDo)));
        whatWeDo.click();
        System.out.println("Opened What we do");

        Thread.sleep(3000);
        about = driver.findElement(By.xpath(Locators.about));
        actions.moveToElement(about).perform();

        Thread.sleep(3000);
        WebDriverWait waitForCulture = new WebDriverWait(driver, 25);
        WebElement ourCulture = waitForCulture.until(ExpectedConditions.elementToBeClickable(By.xpath(Locators.ourCulture)));
        ourCulture.click();
        System.out.println("Opened Our Culture");

        Thread.sleep(3000);
        about = driver.findElement(By.xpath(Locators.about));
        actions.moveToElement(about).perform();

        Thread.sleep(3000);
        WebDriverWait waitForImpact = new WebDriverWait(driver, 25);
        WebElement ourImpact = waitForImpact.until(ExpectedConditions.elementToBeClickable(By.xpath(Locators.ourImpact)));
        ourImpact.click();
        System.out.println("Opened Our Impact");

        Thread.sleep(3000);
        about = driver.findElement(By.xpath(Locators.about));
        actions.moveToElement(about).perform();

        Thread.sleep(3000);
        WebDriverWait waitForLeader = new WebDriverWait(driver, 25);
        WebElement ourLeadership = waitForLeader.until(ExpectedConditions.elementToBeClickable(By.xpath(Locators.ourLeadership)));
        ourLeadership.click();
        System.out.println("Opened Leadership");

        Thread.sleep(3000);
        WebElement button= driver.findElement(By.xpath(Locators.button));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(button).perform();

        Thread.sleep(3000);
        WebElement email= driver.findElement(By.xpath(Locators.email));
        email.sendKeys("123456@gmail.com");

        Thread.sleep(3000);
        driver.quit();
        System.out.println("Closed Browser");

    }
}
