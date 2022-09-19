package testRunner;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features= {"feature files"},monochrome=true,glue= {"stepDefination"})
@RunWith(Cucumber.class)
public class Runner {


}
