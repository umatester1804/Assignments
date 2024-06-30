package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
public static void main(String[] args) throws InterruptedException {
	// launch browser
	ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver=new EdgeDriver();
	// launch url
	driver.get("https://www.facebook.com/login.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
}
}
 
