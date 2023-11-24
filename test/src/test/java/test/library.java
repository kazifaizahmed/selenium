package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class library {

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

		//ADD library
	WebElement libraryBtn= driver.findElement(By.xpath("//span[contains(text(),'Library')]"));
		action.moveToElement(libraryBtn).click().perform();
		Thread.sleep(3000);
		WebElement addLibrary= driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]"));
		Thread.sleep(2000);
		action.moveToElement(addLibrary).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("react-select-4-input")).sendKeys("Next");
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		Thread.sleep(10000);

		//My project
				WebElement testProject = driver.findElement(By.xpath("//p[contains(text(),'Next')]"));
		        testProject.click();
		        Thread.sleep(5000);
				
				//adddoc
				WebElement addDocumentButton = driver.findElement(By.className("add-doc"));
		         addDocumentButton.click();
		
	         WebElement fileInput = driver
		                 .findElement(By.xpath("//div[contains(text(),'Drop a pdf document here or click to select one')]"));
	         fileInput.click();
		         Thread.sleep(15000);
		         driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	         Thread.sleep(5000);
	         driver.findElement(By.className("bp3-dialog-close-button")).click();
	         Thread.sleep(5000);
	         
					
//				//up pic
			WebElement uploadPic= driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[3]"));
				action.moveToElement(uploadPic).click().perform();
				driver.findElement(By.xpath("//div[contains(text(),'Drop a .jpg/ .jpeg/ .png file here or click to sel')]")).click();
					Thread.sleep(15000);
			driver.findElement(By.xpath("//button[contains(text(),'Upload')]")).click();			
			Thread.sleep(5000);
				//collaborators
			      WebElement addCollab= driver.findElement(By.className("collaborator"));
			addCollab.click();
			driver.findElement(By.xpath("//body/div[9]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("sadnan@gmail.com");
			driver.findElement(By.xpath("//body/div[9]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
				driver.findElement(By.xpath("//div[contains(text(),'Admin')]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
				Thread.sleep(5000);
				driver.findElement(By.className("bp3-dialog-close-button")).click();
				 Thread.sleep(5000);
			
				
     			//ADD TAG
			driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[5]")).click();
			//driver.findElement(By.xpath("//body/div[9]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("sadnan");
				//driver.findElement(By.xpath("//body/div[9]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/label[3]")).click();
			 Thread.sleep(5000);
				driver.findElement(By.className("bp3-dialog-close-button")).click();
			
				
			
				
				//LIST
				Thread.sleep(10000);
				driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[7]")).click();
					
		
		
	}

}
