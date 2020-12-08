package com.ww.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.ww.common.Common;
import com.ww.objectrepo.Object_Repo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;






public class Step_Def {

	WebDriver driver;
	Object_Repo ob;
	
	
	
	
	@Given("^I sign in to pestroutes domain$")
	public void i_sign_in_to_pestroutes_domain() throws Throwable {
	   
		driver=Common.getbrowser("chrome",driver); 
		
		driver.get(Common.getGetURL());
	    ob = PageFactory.initElements(driver,Object_Repo.class);
	    ob.getusername().sendKeys(Common.getusername());
	    ob.getpassword().sendKeys(Common.getpassword());
	    ob.getLoginbtn().click();
	}
	
	

	@When("^I create customer with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_create_customer_with_and(String firstname, String lastname, String address, String zipcode) throws InterruptedException {
		
		
		Thread.sleep(2000);
		Assert.assertEquals(ob.verifyHometitle(), "Route Calendar");
		ob.getnewcustomer().click();
		
		
		
		Thread.sleep(2000);
		ob.getfirstnamebox().sendKeys(firstname);
		ob.getlastnamebox().sendKeys(lastname);
		ob.getzipbox().sendKeys(zipcode);
		Thread.sleep(1000);
		ob.getaddressbox().sendKeys(address);
		ob.getsavebutton().click();
		
		Thread.sleep(2000);	   
	}
	
	

	@Then("^I validate if \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\" match in overview tab$")
	public void i_validate_if_and_in_overview_tab(String firstname, String lastname ,String address) throws InterruptedException {
		
		
		
		ob.handleAlert();
		//driver.findElement(By.xpath("//div[contains(text(), 'Save Anyways')]")).click();
		
		
		Thread.sleep(2000);
		String customername = firstname + " " + lastname;
		
		//Name and address of customer
		System.out.println("Customer name is: " + customername + " and "  +"Customer Address is: " + address);
		
		//Name and address of customer seen/visible in the Account Overview window
		System.out.println("Name visible in Account Overview window: " + ob.getnameOverview().getText() + " &&&& Address visible in Account Overview window: " + ob.getaddressOverview().getText());
		
		Assert.assertTrue(ob.getnameOverview().getText().contains(customername));
		Assert.assertTrue(ob.getaddressOverview().getText().contains(address));
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
	}    	
	}
