package Test;

import org.testng.annotations.Test;

import PageObjectModel.childClass;

public class LoginPage extends TestBase {
	
	@Test
	public void login() {
		childClass cc=new childClass(driver);
		cc.setFirstName("Durgesh");
		cc.setLastName("Rai");
		cc.setEmail("xyz@gmail.com");
		cc.checkRadioBtn();
		cc.setUsernumber("1234567890");
		cc.setDOB();
		cc.setMonth("October");
		cc.setYear("2001");
		cc.setDay();
//		cc.setSubject("Physics"); m  
		cc.setCheckBox();
		cc.clickUploadFile("C:\\Users\\durgesh.rai\\TestFile.txt");
		cc.setAddress("Dharanipur Bishyan Gambhirpur azamgarh" );
		cc. setState();
		cc.selectCity();
		cc.clickBtn();
		cc.checkValidatemessage();
		
		
	}
	
	

}
