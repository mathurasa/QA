import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        // Create a new ChromeDriver instance
        driver = new ChromeDriver();
    }

    public void open(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void setUsername(String username) {
        WebElement usernameInput = driver.findElement(usernameField);
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void setPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordField);
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void close() {
        driver.quit();
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.open("https://example.com/login");
        loginPage.setUsername("username");
        loginPage.setPassword("password");
        loginPage.clickLoginButton();
        loginPage.close();
    }
}
