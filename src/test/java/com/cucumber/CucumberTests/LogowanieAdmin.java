package com.cucumber.CucumberTests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogowanieAdmin {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private String user;
	private String password;
	private StringBuffer verificationErrors = new StringBuffer();

	@Given("^Majac strone logowania$")
	public void Majac_stron_logowania() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://localhost:9998/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Zaloguj się")).click();
	}

	@When("^Loguje sie do systemu poprzez login \"(.*?)\" i haslo \"(.*?)\"$")
	public void Loguje_sie_do_systemu_poprzez_login_i_haslo_przypisane_do_konta_administratora(String arg1, String arg2)
			throws Throwable {
		this.user=arg1;
		this.password=arg2;
		driver.findElement(By.id("inputEmail")).clear();
		driver.findElement(By.id("inputEmail")).sendKeys(this.user);
		driver.findElement(By.id("inputPassword")).clear();
		driver.findElement(By.id("inputPassword")).sendKeys(this.password);
		driver.findElement(By.id("signin")).click();

	}

	@Then("^Powinienem zostac zalogowany jako administrator$")
	public void Powinienem_zostac_zalogowany_jako_administrator()
			throws Throwable {
		assertEquals("Użytkownicy",
				driver.findElement(By.linkText("Użytkownicy")).getText());
		assertEquals("Dashboard", driver.findElement(By.linkText("Dashboard"))
				.getText());

	}
}
