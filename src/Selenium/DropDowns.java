package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
//Index
//value
//VisibleText
public class DropDowns {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		Select dropdown=new Select(driver.findElement(By.id("user_title")));
		dropdown.selectByIndex(4);
		dropdown.selectByValue("Duke");
		dropdown.selectByVisibleText("Doctor");
		

	}

}
