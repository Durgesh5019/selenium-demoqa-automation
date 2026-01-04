package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class childClass extends BaseClass{
	
	
//constructor
	public childClass(WebDriver driver) {
		super(driver);
		
	}
	//page locator
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(id="userEmail")
	WebElement userEmail;
	@FindBy(xpath="//label[normalize-space()='Male']")
    WebElement radioBtn;	
	@FindBy(xpath="//input[@id='userNumber']")
	WebElement userNumber;
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	WebElement DOB;
	@FindBy(className="react-datepicker__month-select")
	WebElement month;
	@FindBy(className="react-datepicker__year-select")
	WebElement year;
	@FindBy(xpath="//div[contains(@class,'react-datepicker__day') and text()='19' and not(contains(@class,'outside-month'))]")
	WebElement Day;
	@FindBy(xpath="//div[@class='subjects-auto-complete__input']")
	WebElement subject;
	
	@FindBy(xpath="//label[normalize-space()='Sports']")
	WebElement clickCheckBox;
	
	@FindBy(id="uploadPicture")
	WebElement FileUpload;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement currentAddress;
	
	@FindBy(id="state")
	WebElement selectState;
	
	@FindBy(id="city")
	WebElement setCity;
	@FindBy(id="submit")
	WebElement submitbtn;
	
	@FindBy(xpath="//div[@id='example-modal-sizes-title-lg']")
	WebElement validatemessage;
	
	
	//Method
	public void setFirstName(String name) {
		firstName.sendKeys(name);
	}
	public void setLastName(String Lname) {
		lastName.sendKeys(Lname);
	}
	public void setEmail(String email) {
		userEmail.sendKeys(email);
	}
	public void checkRadioBtn() {
		radioBtn.click();
	}
	public void setUsernumber(String number) {
		userNumber.sendKeys(number);
	}
	public void setDOB() {
		DOB.click();
	
	}
	public void setMonth(String monthvalue) {
		month.sendKeys(monthvalue);
		
		
	}
	public void setYear(String Yearvalue) {
		year.sendKeys(Yearvalue);
	}
	public void setDay() {
		Day.click();
	}
	public void setSubject(String Subjectvalue) {
		subject.sendKeys(Subjectvalue);
	}
	public void setCheckBox() {
		clickCheckBox.click();
	}
	public void clickUploadFile(String uploadfile) {
		FileUpload.sendKeys(uploadfile);
		if(driver.findElement(By.xpath("//input[@id='uploadPicture']")).getText().equals("TestFile.txt"))
		{
			System.out.println("File uploaded ");
		}
		else {
			System.out.println("upload failed...");
		}
	}
	public void setAddress(String address) {
		currentAddress.sendKeys(address);
	}
	public  void setState() {
		selectState.click();
		WebElement stateInput = driver.findElement(By.id("react-select-3-input"));
		stateInput.sendKeys("NCR");
		stateInput.sendKeys(Keys.ENTER);
	}
	public void selectCity() {
		setCity.click();
		WebElement cityInput = driver.findElement(By.id("react-select-4-input"));
		cityInput.sendKeys("Delhi");
		cityInput.sendKeys(Keys.ENTER);
	}
	public void clickBtn() {
		submitbtn.click();
	}
	public void checkValidatemessage() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		if(validatemessage.getText().equals("Thanks for submitting the form")) {
			System.out.println("Form submitted successfully....");
		}
		else {
			System.out.println("Submission failed....");
		}
		
		
	}
	

}
