package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class trashAndUser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		Actions action=new Actions(driver);

		driver.get("https://app.flowcite.com/sign-in");
		driver.manage().window().maximize();

		driver.findElement(By.id("emailInput")).sendKeys("test@user.com");
		driver.findElement(By.id("passwordInput")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/button")).click();
		Thread.sleep(10000);


		
		//Trash
		
				driver.findElement(By.xpath("//body[1]/div[3]/div[4]/div[3]/div[1]/div[2]/div[4]/div[10]/span[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id='select1']")).click();
				//Thread.sleep(5000);
				//driver.findElement(By.xpath("")).click();
				//Thread.sleep(5000);
				//Test user
				Thread.sleep(5000);
				
		        driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[1]/div[2]/div[4]/div[12]/div[1]/div[3]/*[1]")).click();
				driver.findElement(By.xpath("//div[contains(text(),'Edit Information')]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[contains(text(),'Change Password')]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();y
				
				
		
		
	}

}
