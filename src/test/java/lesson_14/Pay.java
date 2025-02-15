package lesson_14;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class Pay {
    public static Mts mtsHomePage;
    public static WebDriver driver;
    public static final String PAGE_URL = "http://mts.by";

    @BeforeAll
    static void before() {
        driver = new ChromeDriver();
        mtsHomePage = new Mts(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
        mtsHomePage.clickCookieCancelBtn();
    }

    @AfterAll
    static void after() {
        driver.quit();
    }

    @Test
    @DisplayName("Заголовок формы")
    public void title() {
        String expectedTitle = "Онлайн пополнение без комиссии";
        String actualValue = mtsHomePage.getPaySectionTitle();
        assertEquals(expectedTitle, actualValue, "Заголовок формы не совпадает");
        System.out.println("Заголовок совпал: " + actualValue);
    }

    @ParameterizedTest
    @DisplayName("Логотивы платежных систем")
    @ValueSource(strings = {"visa.svg", "visa-verified.svg", "mastercard.svg", "mastercard-secure.svg", "belkart.svg"})
    void payPics(String src) {
        boolean isDisplayed = mtsHomePage.isDisplayedImg(src);
        assertTrue(isDisplayed, "Картинка " + src + " не отображается");
        if (isDisplayed) {
            System.out.println("Картинка " + src + " отображается");
        }
    }



    @Test
    @DisplayName("Работа кнопки 'Продолжить'")
    void payForm() {
        String name = "Окно оплаты";
        mtsHomePage.setPhoneField("297777777");
        mtsHomePage.setSumField("50");
        mtsHomePage.clickPayBtn();

        String actualValue = mtsHomePage.getFrameLink();
        assertEquals("https://checkout.bepaid.by/widget_v2/index.html", actualValue, name + " не открылось");
        System.out.println(name + " открылось");
    }
}

