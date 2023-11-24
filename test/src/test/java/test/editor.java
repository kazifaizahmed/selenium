package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class editor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		Actions action=new Actions(driver);

		driver.get("https://app.flowcite.com/sign-in");
		driver.manage().window().maximize();

		driver.findElement(By.id("emailInput")).sendKeys("test@user.com");
		driver.findElement(By.id("passwordInput")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/button")).click();
		Thread.sleep(5000);

		
		
		WebElement editorBtn= driver.findElement(By.xpath("//body[1]/div[3]/div[4]/div[3]/div[1]/div[2]/div[4]/div[4]/span[1]"));
				action.moveToElement(editorBtn).click().perform();
				Thread.sleep(5000);	
		//create file
				  WebElement createBtn = driver.findElement(By.xpath("//button[contains(text(),'Create File')]"));
			        createBtn.click();
			        Thread.sleep(8000);

			        driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Next");
			        Thread.sleep(10000);

			        WebElement selProj = driver.findElement(By.xpath("//div[contains(text(),'Select Project')]"));
			        action.moveToElement(selProj).click().perform();
			        Thread.sleep(5000);

			        driver.findElement(By.xpath("//p[contains(text(),'Blank Project')]")).click();
			        Thread.sleep(10000);

			        driver.findElement(By.xpath("(//button[contains(text(),'Create')])[2]")).click();
			        Thread.sleep(15000);
			        driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/*[1]")).click();
		//upload project
				Thread.sleep(10000);
				driver.findElement(By.xpath("//button[contains(text(),'Upload Project')]")).click();	
				Thread.sleep(10000);
				driver.findElement(By.xpath("//body/div[8]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Filetitleee");
				//Thread.sleep(2000);
				//driver.findElement(By.xpath("//body/div[8]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]")).click();
				//Thread.sleep(5000);
				//driver.findElement(By.xpath("//body/div[8]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[2]/*[1]")).click();
				//Thread.sleep(5000);
				driver.findElement(By.xpath("//div[contains(text(),'Drop a .zip file here or click to select one')]")).click();
				//Thread.sleep(5000);
				//driver.findElement(By.xpath("//body/div[8]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
				Thread.sleep(10000);
				driver.findElement(By.className("bp3-dialog-close-button")).click();
		
		
		
		
	}

}
