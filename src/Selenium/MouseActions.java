package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions Act=new Actions(driver);
		 WebElement Double=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		 Thread.sleep(1000);
		 Act.doubleClick(Double).perform();
		 
		 driver.switchTo().alert().accept();
		 //Drag and Drop
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 WebElement From=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		 WebElement to=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		 Act.dragAndDrop(From, to).perform();
	}

}
