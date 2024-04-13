package demoblaze;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaseTest {
    WebDriver driver;

    @BeforeEach
    public void configuracionNavegador(){
        // CONFIGURACION DEL NAVEGADOR
        driver = new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));    

        }

        @Test
        public void NavegarCategoriaLaptop(){
            
            // PASO A PASO DE LA PRUEBA
            WebElement resultLaptopsLink = driver.findElement(By.partialLinkText("Laptops"));
            resultLaptopsLink.click();
           
            // PUNTOS DE CONTROL
    
            assertTrue(driver.findElement(By.partialLinkText("Sony vaio i5")).isDisplayed(), 
            "El titulo del portatil1 es visible");
            
            WebElement articledos =  driver.findElement(By.id("article"));
            assertTrue(articledos.isDisplayed());
                
        }

        @Test
        public void NavegarCategoriaPhones(){
            
            // PASO A PASO DE LA PRUEBA
            WebElement resultLaptopsLink = driver.findElement(By.partialLinkText("Phones"));
            resultLaptopsLink.click();
           
            // PUNTOS DE CONTROL
    
            assertTrue(driver.findElement(By.partialLinkText("Samsung galaxy s6")).isDisplayed(), 
            "El titulo del telefono es visible");
            
            WebElement articledos =  driver.findElement(By.id("article"));
            assertTrue(articledos.isDisplayed());
                
        }

        @Test
        public void NavegarCategoriamonitors(){
            
            // PASO A PASO DE LA PRUEBA
            WebElement resultLaptopsLink = driver.findElement(By.partialLinkText("Monitors"));
            resultLaptopsLink.click();
           
            // PUNTOS DE CONTROL
    
            assertTrue(driver.findElement(By.partialLinkText("Apple monitor 24")).isDisplayed(), 
            "La imagen del monitor visible");
            
            WebElement articledos =  driver.findElement(By.id("article"));
            assertTrue(articledos.isDisplayed());
               
        }

        @AfterEach
    public void salirNavegador(){
        driver.quit();
                            }
}
