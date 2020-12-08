package com.ww.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ww.common.Common;
import com.ww.objectrepo.Object_Repo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



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
	
	

	@When("I create customer with {string}, {string}, {string} and {string}")
	public void i_create_customer_with_and(String firstname, String lastname, String address, String zipcode) throws InterruptedException {
		
		
		Thread.sleep(2000);
		Assert.assertEquals(ob.verifyHometitle(), "Route Calendar");
		ob.getnewcustomer().click();
		
		Thread.sleep(2000);
		ob.getfirstnamebox().sendKeys(firstname);
		ob.getlastnamebox().sendKeys(lastname);
		ob.getaddressbox().sendKeys(address);
		ob.getzipbox().sendKeys(zipcode);
		ob.getsavebutton().click();
		
		Thread.sleep(2000);
		   
	}
	
	
	


	@Then("I validate if {string} , {string} and {string} match in overview tab")
	public void i_validate_if_and_in_overview_tab(String firstname, String lastname ,String address) throws InterruptedException {
		
		
		
		ob.handleAlert();
		driver.findElement(By.xpath("//div[contains(text(), 'Save Anyways')]")).click();
		
		
		Thread.sleep(3000);
		String customername = firstname + " " + lastname;
		Assert.assertTrue(ob.nameOverview().getText().contains(customername));
		Assert.assertTrue(ob.addressOverview().getText().contains(address));
		
		    
	}
	
	
	
	
	
	
//	@Then("^User cloes the browser$")
//	public void user_cloes_the_browser() throws Throwable {
//	    
//	    driver.quit();
//		
//	}


}
