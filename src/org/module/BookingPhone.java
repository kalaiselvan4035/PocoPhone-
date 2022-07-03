package org.module;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingPhone {
	public static void main(String[] args) throws WebDriverException, IOException {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\program\\Flipkartphone\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
			driver.findElement(By.xpath("(//div[@class='_HYyiu'])[2]")).click();
			driver.findElement(By.xpath("//div[text()='POCO F4 5G (Night Black, 128 GB)']")).click();
			Set<String> s = driver.getWindowHandles();
			List<String> l = new ArrayList<String>(s);
			driver.switchTo().window(l.get(1));
			driver.findElement(By.cssSelector("svg._1KOMV2[width='16']")).click();
			driver.findElement(By.xpath("//span[text()='Continue']")).click();
		} finally {
			TakesScreenshot ts = (TakesScreenshot) driver;
			FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),
					new File("D:\\program\\Flipkartphone\\ScreenShot\\image.png"));
		}

	}

}
