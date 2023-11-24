package TestCases;

import java.util.List;

import org.testng.annotations.Test;

import PageObject.Credential_path;
import config.config11;

public class Tc_02_editEmployeeDetails extends Credential_path
{
    @Test
	public void Tc_02_editEmployeeDetails()
	{
    	
    	
    	 config11.obj_bi.urlopen(URL);
    	 config11.obj_bi.verifiedTitle(or_LoginActTitle);
    	 config11.obj_bi.Element_Sendkeys(or_username, or_name);
 		 config11.obj_bi.Element_Sendkeys(or_password, or_pass);
 		 config11.obj_bi.click(or_loginButoon);
 		 config11.obj_bi.verifiedTitle(or_HomePageActTitle);
 		 
 		 config11.obj_bi.verifiedText(or_welcometext,WelcomeText);
 		 config11.obj_bi.Action_class2(or_PIM_HEADER, or_employee_List);
 		 config11.obj_bi.switchframe(frameName);
 		 config11.obj_bi.selectclassByindex(or_Selectclass_BYsearch,index);
 		 config11.obj_bi.Element_Sendkeys(or_Bysearch_value, or_Lname);
 		 config11.obj_bi.click(or_searchButoon);
 		 config11.obj_bi.findNameONtABLE(or_table_xpath,or_secoundrow,or_secoundrow_name, employeename);
 		 
  //personal details 
 		 config11.obj_bi.click(or_personaldetails);
 		 config11.obj_bi.click(clickonEditbutton);
 		 config11.obj_bi.Element_Sendkeys(or_Nickname, nickname);
 		 config11.obj_bi.Element_Sendkeys(or_sdnNumber,sdnNumber);
 		 config11.obj_bi.Element_Sendkeys(or_sinNumber,sinNumber);
// 		 config11.obj_bi.click(calender_icon);
// 		 config11.obj_bi.dateOfBirth(or_monthYear, or_dayList, or_NextButton);
 		 config11.obj_bi.Element_Sendkeys(or_calenderaBox, DOB);
 		 config11.obj_bi.Element_Sendkeys(or_otherID, otherid);
 		 config11.obj_bi.Element_Sendkeys(or_drivingLicenceNO, drivingLNO);
 		 config11.obj_bi.Element_Sendkeys(or_drivingExpiryLicence, drivinglicenceExpiry);
 		 config11.obj_bi.selectclassBytext(or_maritalStatus, maritalStatus);
 		 config11.obj_bi.click(savebUTTON);
 		 
 		 
   // contactdetails
 		 
 	try {	 
 		 config11.obj_bi.click(or_contactdetails);
 		 config11.obj_bi.click(or_clickonEDITbutton);
 		 config11.obj_bi.selectclassBytext(or_coutryBox, countryName);
 		 config11.obj_bi.Element_Sendkeys(or_streetnAME1, streetnAME1);
 		 config11.obj_bi.Element_Sendkeys(or_streetnAME2, streetnAME2);
 		 config11.obj_bi.Element_Sendkeys(or_city, city);
 		 config11.obj_bi.Element_Sendkeys(or_State,state);
 		 config11.obj_bi.Element_Sendkeys(or_zipcode,zipcode);
 		 config11.obj_bi.Element_Sendkeys(or_homeTelephone,homeTelephone);
 		 config11.obj_bi.Element_Sendkeys(or_mobileNumber,mobileNumber);
 		 config11.obj_bi.Element_Sendkeys(or_emailID,emailID);
 		 config11.obj_bi.click(or_submitButton);
 	}
 	catch(Exception e)
 	{
 		System.out.println("exception "+e);
 	}
 		
 	
 	
 	}

}
