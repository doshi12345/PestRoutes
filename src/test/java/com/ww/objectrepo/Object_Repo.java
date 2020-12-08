package com.ww.objectrepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Object_Repo {

    WebDriver driver;
	public Object_Repo (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
         
	}

	
//LoginPage Webelements
	@FindBy (id= "inputUser")
	private WebElement username1;
	public WebElement getusername() {
		return username1;
	}
	
	@FindBy (id= "inputPassword")
	private WebElement password1;
	public WebElement getpassword() {
		return password1;
	}


	@FindBy (xpath= "//input[@type='submit']")
	private WebElement loginbtn;
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
//HomePage Webelements
	@FindBy (xpath= "//a[contains(text(), 'New Customer')]")
	private WebElement newcustomer;
	public WebElement getnewcustomer() {
		return newcustomer;
	}
	
	
	
	@FindBy (xpath= "//input[@name = 'fname']")
	private WebElement firstnamebox;
	public WebElement getfirstnamebox() {
		return firstnamebox;
	}
	
	
	@FindBy (xpath= "//input[@name = 'lname']")
	private WebElement lastnamebox;
	public WebElement getlastnamebox() {
		return lastnamebox;
	}
	
	@FindBy (xpath= "//input[@name = 'address']")
	private WebElement addressbox;
	public WebElement getaddressbox() {
		return addressbox;
	}
	
	@FindBy (xpath= "//input[@name = 'zip']")
	private WebElement zipbox;
	public WebElement getzipbox() {
		return zipbox;
	}
	
	@FindBy (xpath= "//button[@id='globalCustomerSaveButton']//span[text() = 'Save']")
	private WebElement savebutton;
	public WebElement getsavebutton() {
		return savebutton;
	}
	
	
	
//Overview window Webelements
	
	@FindBy (xpath= "//span[@id='ui-id-11']")
	private WebElement nameOverview;
	public WebElement getnameOverview() {
		return nameOverview;
	}
	
	@FindBy (xpath= "//h3[contains(text(), 'Account Overview')]//div")
	private WebElement addressOverview;
	public WebElement getaddressOverview() {
		return addressOverview;
	}
	
	
	
	@FindBy (xpath= "//button[@id='globalCustomerSaveButton']//span[contains(text(), 'Save')")
	private WebElement savebtn;
	public WebElement getsavebtn() {
		return savebtn;
	}
	
	@FindBy (xpath= "//div[contains(text(), 'Save Anyways')]")
	private WebElement saveanywaysbtn;
	public WebElement getsaveanyways() {
		return saveanywaysbtn;
	}

	
	
	
//Actions
	
	public String verifyHometitle() {
		
		String title = driver.getTitle();
		return title;	
	}
	
	
	
	//Alert handling methods if there is Duplicate customer entry
	public boolean isAlertPresent() {
		
		try 
		{ 
		    driver.switchTo().alert(); 
		    System.out.println(" Alert window Present; Duplicate account found");
		    return true;
		}  
		catch (org.openqa.selenium.NoAlertPresentException e) 
		{ 
		    System.out.println("No Alert window Present: No Duplicate account found");
		      
		}
		return false;
			
	}
	
	
	public void handleAlert(){
	    if(isAlertPresent()){
	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert.getText());
	        alert.accept();
	        driver.findElement(By.xpath("//div[contains(text(), 'Save Anyways')]")).click();
	    }
	}
	
	
}
