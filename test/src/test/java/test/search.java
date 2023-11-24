package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class search {

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

		
		//SEARCHbtn
        Thread.sleep(10000);
	 WebElement searchBtn= driver.findElement(By.xpath("//body[1]/div[3]/div[4]/div[3]/div[1]/div[2]/div[4]/div[8]/span[1]"));
	   searchBtn.click();
	    Thread.sleep(10000);
		//Basic search
	driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Blockchain");
	 Thread.sleep(5000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[1]/button[1]")).click();
	  Thread.sleep(10000);
		//Advanced
   	//Refine search
		driver.findElement(By.xpath("//span[contains(text(),'Refine Search')]")).click();
       Thread.sleep(10000);
		//checkboxs
       Thread.sleep(10000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[2]/span[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Blockchain Technology");
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")).sendKeys("Blockchain came because of the occurrence of incredulity to single authorities by introducing the concept of network decentralization");
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/input[1]")).sendKeys("10.26555/jiteki.v8i2.24327");
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[5]/input[1]")).sendKeys("Universitas Ahmad Dahlan, Kampus ");		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]/*[1]")).click();
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(10000);
		
		

	}

}
