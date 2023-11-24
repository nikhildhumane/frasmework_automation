package BusinessLogic;

import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BusinessLogic1 
{ 
	public String name = null;
	public ChromeOptions co;
	public WebDriver driver;
	public WebDriverWait wait;
	public String or_UserdirectiryPath=System.getProperty("user.dir");
	public String or_ChromeOption_argument="--remote-allow-origins=*"; 
	public String URL="http://183.82.103.245/nareshit/login.php";
    
	public void urlopen(String siteName)
	{
		 System.setProperty("webdriver.chrome.driver", or_UserdirectiryPath+"\\driver\\chromedriver.exe");
	      co=new ChromeOptions();
	      co.addArguments(or_ChromeOption_argument);
	      driver=new ChromeDriver(co);
	     
	      driver.get(siteName);
	      
	}
	public void verifiedTitle(String Exptitle)
	{
		String ActTitle=driver.getTitle();

    	if(ActTitle.equals(Exptitle))
		{
			System.out.println("home Page title match");
		}
		else
		{
			System.out.println("home page title not match");
		}
	}
	
	public void verifiedText(String welText,String Exptitle)
	{
		String ActTitle=driver.findElement(By.xpath(welText)).getText();

    	if(ActTitle.equals(Exptitle))
		{
			System.out.println("welcome text match");
		}
		else
		{
			System.out.println("welcome text not match");
		}
	}
	
	public void Element_Sendkeys(String xpath,String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	public void click(String click)
	{
		driver.findElement(By.xpath(click)).click();
	}
	
	public void Action_class(String pimName,String EmployeeList,String addemployee )
	{
		WebElement pim=driver.findElement(By.xpath(pimName));
    	WebElement employee_list=driver.findElement(By.xpath(EmployeeList));
    	WebElement Add_employee=driver.findElement(By.xpath(addemployee));
    	Actions n=new Actions(driver);
    	n.moveToElement(pim).build().perform();
    	n.moveToElement(employee_list).build().perform();
    	n.moveToElement(Add_employee).build().perform();
    	Add_employee.click();
	}
	public void Action_class2(String pimName,String EmployeeList )
	{
		WebElement pim=driver.findElement(By.xpath(pimName));
    	WebElement employee_list=driver.findElement(By.xpath(EmployeeList));
    	
    	Actions n=new Actions(driver);
    	n.moveToElement(pim).build().perform();
    	n.moveToElement(employee_list).build().perform();
    	
    	employee_list.click();
	}
	
	
	public void selectclassByValue(String select_xpath,String value1)
	{
		WebElement drop=driver.findElement(By.xpath(select_xpath)); 
		Select s=new Select(drop);
		s.selectByValue(value1);
	}
	
	public void selectclassByindex(String select_xpath,int value1)
	{
		WebElement drop=driver.findElement(By.xpath(select_xpath)); 
		Select s=new Select(drop);
		s.selectByIndex(value1);
	}
	public void selectclassBytext(String select_xpath,String value1)
	{
		WebElement drop=driver.findElement(By.xpath(select_xpath)); 
		Select s=new Select(drop);
		s.selectByVisibleText(value1);
	}
	public void deselectclassByValue(String select_xpath)
	{
		WebElement drop=driver.findElement(By.xpath(select_xpath)); 
		Select s=new Select(drop);
		s.deselectAll();
	}
	
	public void findNameONtABLE(String xpathtable,String tablepath1,String tablepath2,String employeename)
	{
		WebElement tableElement=driver.findElement(By.xpath(xpathtable));
		List<WebElement> tableRows = tableElement.findElements(By.xpath(tablepath1));
         for (WebElement row : tableRows) {
             // Identify the cell containing the name
             WebElement nameCell = row.findElement(By.xpath(tablepath2));
             // Check if the cell contains the expected name
             String cellText = nameCell.getText();
             System.out.println("name="+cellText);
             nameCell.click();
             if (cellText.equals(employeename))
             {
                 // Capture the name
                 name = cellText;
                 break; // Assume only one row has the name
             }
         }

         if (name != null) {
             System.out.println("Captured name: " + name);
         } else {
             System.out.println("No name found");
         }
	}
	
	
	public void dateOfBirth(String year_Month,String alldayList,String NextButton)
	{
		String ExpDate="18";
		String ExpMonthYear="November 1990";
		while(true)
			{
			  String calmonthyear=driver.findElement(By.xpath(year_Month)).getText();
			 
			  if(calmonthyear.equals(ExpMonthYear))
			  {
				  List<WebElement> daylist=driver.findElements(By.xpath(alldayList));
				  
				  for(WebElement e:daylist)
				  {
					  String calDay=e.getText();
					  
					  if(calDay.equals(ExpDate))
					  {
						  e.click();
						  break;
					  }
				  }
				  break;
			  }
			  else
			  {
				 driver.findElement(By.xpath(NextButton)).click();
			  }
			  
			}
		

	}
	
	
	
	
	public void switchframe(String frame)
	{
		driver.switchTo().frame(frame);
	}
	public void closedBrowser()
	{
		driver.quit();
	}

}
