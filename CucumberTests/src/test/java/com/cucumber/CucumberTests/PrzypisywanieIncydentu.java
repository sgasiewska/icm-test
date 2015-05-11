package com.cucumber.CucumberTests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrzypisywanieIncydentu {
	private WebDriver driver;
	 private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  
	@Given("^Bedac na liście incydentow$")
	public void bedac_na_liście_incydentow() throws Throwable {
		driver.get(baseUrl + "/incident/list");

	}

	@Given("^Majac incydent w statusie zgloszonym$")
	public void majac_incydent_w_statusie_zgloszonym() throws Throwable {
		assertEquals("Zgłoszony", driver.findElement(By.xpath("//table[@id='incidents']/tbody/tr/td[4]")).getText());

	}

	@When("^klikam przycisk Akcje$")
	public void klikam_przycisk_Akcje() throws Throwable {
		driver.findElement(By.xpath("//table[@id='incidents']/tbody/tr/td[5]/div/button")).click();

	}

	@When("^Wybieram opcje Dodaj audyt$")
	public void wybieram_opcje_Audyt() throws Throwable {
		driver.findElement(By.linkText("Dodaj audyt")).click();

	}

	@When("^W polu przypisz do wybieram pracownika$")
	public void w_polu_przypisz_do_wybieram_pracownika() throws Throwable {
		new Select(driver.findElement(By.id("assigneeId"))).selectByVisibleText("icm-employee");

	}

	@When("^Klikam przycisk Dodaj audyt$")
	public void klikam_przycisk_Dodaj_audyt() throws Throwable {
		driver.findElement(By.id("create")).click();
	}

	@Then("^Zgłoszenie zostaje przypisane do pracownika$")
	public void zgłoszenie_zostaje_przypisane_do_pracownika() throws Throwable {
		assertEquals("icm-employee", driver.findElement(By.xpath("//tr[8]/td/address/strong")).getText());

	}

	@Then("^Pojawia sie komunikat informujący o dodaniu audytu$")
	public void pojawia_sie_komunikat_informujący_o_dodaniu_audytu() throws Throwable {
		assertEquals("Nowy audyt o id 7 został pomyślnie utworzony!", driver.findElement(By.id("alert")).getText());

	}
}
