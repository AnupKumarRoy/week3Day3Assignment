package Week3Day4;



		import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Erail {

			public static void main(String[] args) throws InterruptedException, IOException {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://erail.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				WebElement from = driver.findElement(By.id("txtStationFrom"));
				from.clear();
				from.sendKeys("MAS",Keys.TAB);
				File src = driver.getScreenshotAs(OutputType.FILE);
				File des= new File("./screenshot./Frame1.png");
				FileUtils.copyFile(src, des);
				
				WebElement to = driver.findElement(By.id("txtStationTo"));
				to.clear();
				to.sendKeys("HWH",Keys.TAB);
				File src1 = driver.getScreenshotAs(OutputType.FILE);
				File des1= new File("./screenshot./Frame2.png");
				FileUtils.copyFile(src1, des1);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
				File src2 = driver.getScreenshotAs(OutputType.FILE);
				File des2= new File("./screenshot./Frame3.png");
				FileUtils.copyFile(src2, des2);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//table[@class='Month'])[3]//tr[5]/td[7]")).click();
				File src3 = driver.getScreenshotAs(OutputType.FILE);
				File des3= new File("./screenshot./Frame4.png");
				FileUtils.copyFile(src3, des3);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
				File src4 = driver.getScreenshotAs(OutputType.FILE);
				File des4= new File("./screenshot./Frame5.png");
				FileUtils.copyFile(src4, des4);
				Thread.sleep(5000);
				
				for (int i = 1; i < 15; i++) {
					if(i==5) 
						continue;
						String text1 = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[1]/a")).getText();
						String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a")).getText();
						System.out.println(text1+","+text+".");
						
					}
				
				Thread.sleep(5000);
				File src5 = driver.getScreenshotAs(OutputType.FILE);
				File des5= new File("./screenshot./Frame6.png");
				FileUtils.copyFile(src5, des5);

				}
				
				
				
	}


