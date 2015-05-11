package com.cucumber.CucumberTests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsuwanieUzytkownika {
	private WebDriver driver;
	 private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	 
	  
	  
	@Given("^Wybierajac opcje uzytkownicy z menu gornego$")
	public void Wybierajac_opcje_uzytkownicy_z_menu_gornego() throws Throwable {
		System.out.println("test");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Użytkownicy")).click();

	}

	@When("^Wybieram akcje Delete przy uzytkowniku$")
	public void Wybieram_akcje_Delete_przy_uzytkowniku() throws Throwable {
		assertEquals("ROLE_USER", driver.findElement(By.xpath("//table[@id='accounts']/tbody/tr[5]/td[4]")).getText());
		driver.findElement(By.xpath("//table[@id='accounts']/tbody/tr[5]/td[6]/div/button")).click();
		driver.findElement(By.cssSelector("#action-menu-5 > li > a")).click();


	}

	@Then("^uzytkownik powinien zniknac z listy pacownikow$")
	public void uzytkownik_powinien_zniknac_z_listy_pacownikow() throws Throwable {

	}

	@Then("^powinien pojawia sie komunikat potwierdzajacy usuniecie uzytkownika$")
	public void powinien_pojawia_sie_komunikat_potwierdzajacy_usuniecie_uzytkownika() throws Throwable {
		assertEquals("Account deleted!", driver.findElement(By.id("alert")).getText());
		}

}
