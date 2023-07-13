import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReportsPage {
    private WebDriver driver;
    private By reportsContainer = By.id("reports-container");

    public ReportsPage() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        // Create a new ChromeDriver instance
        driver = new ChromeDriver();
    }

    public void open(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void clickReportsContainer() {
        WebElement reportsContainerElement = driver.findElement(reportsContainer);
        reportsContainerElement.click();
    }

    public void close() {
        driver.quit();
    }

    public static void main(String[] args) {
        ReportsPage reportsPage = new ReportsPage();
        reportsPage.open("https://example.com/reports");
        reportsPage.clickReportsContainer();
        reportsPage.close();
    }
}
