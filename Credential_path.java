package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Credential_path 
{
	public ChromeOptions co;
	public WebDriver driver;
	public WebDriverWait wait;
	
	public String URL="http://183.82.103.245/nareshit/login.php";
	public String or_UserdirectiryPath=System.getProperty("user.dir");
	public String or_ChromeOption_argument="--remote-allow-origins=*"; 
	
	    public String or_LoginActTitle="OrangeHRM - New Level of HR Management";
	    public String or_HomePageActTitle="OrangeHRM";
	    public String or_welcometext="//li[normalize-space()='Welcome admin']";
	    public String WelcomeText="Welcome admin";
       
        public String or_username="//input[@name='txtUserName']";
		public String or_name="admin";
		public String or_password="//input[@name='txtPassword']";
		public String or_pass="admin";
		public String or_loginButoon="//input[@name='Submit']";
		
		
		public String or_PIM_HEADER="//*[@id='pim']/a/span[@class='drop current']";
		public String or_employee_List="//span[normalize-space()='Employee List']";
		public String or_ADD_employee="//span[normalize-space()='Add Employee']";
		public String frameName="rightMenu";
		
	//add employee
		
		public String or_lastname="//input[@id='txtEmpLastName']";
		public String or_Lname="DUMMY";
		public String or_Firstname="//input[@id='txtEmpFirstName']";
		public String or_Fname="ROCKY";
		public String or_middlename="//input[@id='txtEmpMiddleName']";
		public String or_mdname="ppm";
		public String or_uploadprofile="//input[@id='photofile']";
		public String or_UPLphoto="C:\\Users\\nikhildhumane\\Downloads\\Image (34).png";
		public String or_saveButon="//input[@id='btnEdit']";
		
//edit employee
		
		public String or_Selectclass_BYsearch="//select[@id='loc_code']";
		public int index=3;
		public String or_Bysearch_value="//input[@id='loc_name']";
		public String or_searchButoon="//input[@value='Search']";
		public String or_table_xpath="//table[@class='data-table']";
		public String or_secoundrow="//tr[@class='odd']";
		public String or_secoundrow_name="//tr[@class='odd']/td[3]";
		public String employeename="ROCKY ppm DUMMY";
		
		
   //personal details 		
		public String or_personaldetails="//span[normalize-space()='Personal Details']";
		public String clickonEditbutton="//input[@id='btnEditPers']";
        public String or_Nickname="//input[@id='txtEmpNickName']";
        public String nickname="vk";
        public String or_sdnNumber="//input[@id='txtNICNo']";
        public String sdnNumber="$123456";
        public String or_sinNumber="//input[@id='txtSINNo']";
        public String sinNumber="$123456";
        
        public String or_calenderaBox="//input[@id='DOB']";
        public String DOB="1990-11-10";
        public String calender_icon="//input[@name='btnDOB']";
        public String or_monthYear="//div[@class='calheader']";
        public String or_dayList="//table/tbody/tr/td";
        public String or_NextButton="//a[@title='Previous month']";
        
        public String or_otherID="//input[@id='txtOtherID']";
        public String otherid="$12345";
        
        public String or_drivingLicenceNO="//input[@id='txtLicenNo']";
        public String drivingLNO="$12345";
        
        public String or_drivingExpiryLicence="//input[@id='txtLicExpDate']";
        public String drivinglicenceExpiry="2025-11-10";
        
        public String or_maritalStatus="//select[@id='cmbMarital']";
        public String maritalStatus="Married";
        public String savebUTTON="//input[@id='btnEditPers']";
        
        
 //contact details
        
        public String or_contactdetails="//span[normalize-space()='Contact Details']";
        public String or_clickonEDITbutton="//input[@id='btnEditContact']";
        public String or_coutryBox="//select[@name='cmbCountry']";
        public String countryName="India";
        public String or_streetnAME1="//input[@name='txtStreet1']";
        public String streetnAME1="ABC BULDING";
        public String or_streetnAME2="//input[@name='txtStreet2']";
        public String streetnAME2="LONAVAL 11";
        public String or_city="//input[@id='cmbCity']";
        public String city="amrutsar";
        public String or_State="//input[@id='txtState']";
        public String state="punjab";
        public String or_zipcode="//input[@name='txtzipCode']";
        public String zipcode="474225";
        public String or_homeTelephone= "//input[@name='txtHmTelep']";
        public String homeTelephone="7785559962";  
        public String or_mobileNumber="//input[@name='txtMobile']";
        public String mobileNumber="8899545511";
        public String or_emailID="//input[@name='txtWorkEmail']";
        public String emailID="sdl@gmail.com";
        public String or_submitButton="//input[@id='btnEditContact']";
        

}
