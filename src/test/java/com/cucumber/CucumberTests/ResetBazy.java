package com.cucumber.CucumberTests;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResetBazy {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Given("^Wchodzac na strone http://localhost:(\\d+)/setup$")
	public void wchodzac_na_strone_http_localhost_setup(int arg1) throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://localhost:9998/setup");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^Klikajac przycisk Inicjalizuj$")
	public void klikajac_przycisk_Inicjalizuj() throws Throwable {
		driver.findElement(By.linkText("Inicjalizuj")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("^Baza danych programu zostanie zresetowana$")
	public void baza_danych_programu_zostanie_zresetowana() throws Throwable {

	}

}
