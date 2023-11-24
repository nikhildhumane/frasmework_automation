package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObject.Credential_path;
import config.config11;

public class TC_01_AddNewEmployee extends Credential_path
{
	@Test
	public void TC_01_AddNewEmployee() 
	{
		
	    config11.obj_bi.urlopen(URL);
		config11.obj_bi.verifiedTitle(or_LoginActTitle);
		config11.obj_bi.Element_Sendkeys(or_username, or_name);
		config11.obj_bi.Element_Sendkeys(or_password, or_pass);
		config11.obj_bi.click(or_loginButoon);
		config11.obj_bi.verifiedTitle(or_HomePageActTitle);
		config11.obj_bi.verifiedText(or_welcometext,WelcomeText);
	    config11.obj_bi.Action_class(or_PIM_HEADER, or_employee_List, or_ADD_employee);
	    config11.obj_bi.switchframe(frameName);
	    config11.obj_bi.Element_Sendkeys(or_lastname, or_Lname);
	    config11.obj_bi.Element_Sendkeys(or_Firstname, or_Fname);
	    config11.obj_bi.Element_Sendkeys(or_middlename, or_mdname);
	    config11.obj_bi.Element_Sendkeys(or_uploadprofile, or_UPLphoto);
	    config11.obj_bi.click(or_saveButon);
	    config11.obj_bi.closedBrowser();
		
	
   }

}
