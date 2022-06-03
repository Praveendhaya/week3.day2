package week3.day2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input[@name='searchVal']")).sendKeys("bags");
		 driver.findElement(By.className("rilrtl-button")).click();
		
		 driver.findElement(By.xpath("//input[@id='Men']/parent::div[@class='facet-linkhead']")).click();
		 driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		 System.out.println("no.of bags is "+driver.findElement(By.xpath("//div[text()='334']")).getText());
		 List<WebElement> e=driver.findElements(By.className("brand"));
			System.out.println("size is" +e.size());
			for(WebElement w:e)
			{
				String s=w.getText();
				System.out.println(s);
			}
			List<WebElement> f=driver.findElements(By.className("nameCls"));
			System.out.println("size is" +f.size());
			for(WebElement w:f)
			{
				String t=w.getText();
				System.out.println(t);
			}
	}


}
