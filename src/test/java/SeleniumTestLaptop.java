import Utility.DriverFactory;
import Utility.PropertiesFile;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class SeleniumTestLaptop {
    //Seteo variable url con la dirección a la que quiero que navegue
    private String url = PropertiesFile.getProperty("url_base");
    //Seteo de Webdriver
    private WebDriver driver = DriverFactory.getDriver();

    @Test
    public void NavigateToDemoblaze() throws InterruptedException {
        //Dirección a la que quiero que navegue
        driver.navigate().to(url);
        //Para poner el driver en fullscreen
        driver.manage().window().maximize();
        //Para comparar la dirección en la que está con la que quiero que esté
        assertEquals("https://www.demoblaze.com/index.html", driver.getCurrentUrl());
        //Le agrego un wait para darle tiempo a cargar el sitio
        WebElement laptops = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.linkText("Laptops")));
        //Una vez que carga el sitio, le doy click al elemento indicado
        laptops.click();
        //Le agrego un wait para darle tiempo a cargar el sitio
        WebElement primerProductoSonyVaio = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.linkText("Sony vaio i5")));
        //primerProductoSonyVaio.getText();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String nombrePrimerProduct = driver.findElement(By.linkText("Sony vaio i5")).getText();
        System.out.println(nombrePrimerProduct);

        //System.out.println(primerProductoSonyVaio);
        //Declaro el nombre del producto como String para poder obtener el valor con un getText()
        //String nombreProductoSony = driver.findElement(By.linkText("Sony vaio i5")).getText();
        //WebElement nombreProductoSony = new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> driver.findElement(By.linkText("Sony vaio i5")));
        //assertEquals(nombreProductoSony.getText(), "Sony vaio i5");
        //Obtengo el nombre del producto
        //System.out.println(nombreProductoSony);


        //Una vez que carga el sitio, le doy click al elemento indicado
        //primerProductoSonyVaio.click();


        //sleep(1000);
        //Declaro el precio del producto como String para poder obtener el valor con un getText()
        //String precioProductoSony = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h5:nth-child(2)")).getText();
       // String precioVaio = driver.findElement(By.className("price-container")).getText();
        //String precioProductoSony = driver.findElement(By.cssSelector("css=.col-lg-4:nth-child(1) h5")).getText();
        //WebElement precioProductoSony = new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h5:nth-child(2)")));
        //System.out.println(precioProductoSony);
        //assertEquals(precioProductoSony.getText(),"$790");

        //System.out.println(precioProductoSony);
        //Obtengo el nombre del producto
        //assertEquals(precioProductoSony.getText(),);
        //System.out.println(precioProductoSony);

        //div[@id='tbodyid']//div[1]//div[1]//div[1]//h5[1]
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String precioVaio = driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//div[1]//h5[1]")).getText();
        System.out.println(precioVaio);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Una vez que carga el sitio, le doy click al elemento indicado
        primerProductoSonyVaio.click();

        //Guardar precio laptop
        //WebElement precioPrimerProductoSonyVaio = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.attributeToBe("css=.price-container"));
        //WebElement precioVaio = driver.findElement(By.cssSelector("class=\"price-container\""));


        //Una vez que carga el sitio, le doy click al elemento indicado
        //WebElement precioPrimerProductoSonyVaio= new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.cssSelector(""))));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //String precioVaio = driver.findElement(By.xpath("//div[@id='tbodyid']/h3")).getText();
        //System.out.println(precioVaio);

        //Le agrego un wait para darle tiempo a cargar el sitio
        WebElement primerProductoSonyVaioAddToCart = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.linkText("Add to cart")));
        //Una vez que carga el sitio, le doy click al elemento indicado
        primerProductoSonyVaioAddToCart.click();
        //Le agrego un wait para darle tiempo a cargar el sitio
        WebElement verCart = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("cartur")));
        //Una vez que carga el sitio, le doy click al elemento indicado
        verCart.click();
        sleep(2000);

        driver. quit();
    }


}
