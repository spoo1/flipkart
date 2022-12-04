package com.genric;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class base 
{
	public static WebDriver driver;
	public static File f=new File();
	public static commonutils cu=new commonutils();
	public static ExtentReports report;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
@BeforeTest
public void configureBT() throws IOException {
	report=new ExtentReports();
	spark=new ExtentSparkReporter("test-output/Extent.html");
	report.attachReporter(spark);
if(f.getDataFromProperties("browser").equals("chrome"))
{
	driver=new ChromeDriver();
}
if(f.getDataFromProperties("browser").equals("Firefox"))
{
	driver=new FirefoxDriver();
}
}
@BeforeMethod
public void cofigureBM()
{
	driver.findElement(By.xpath("//a[.='Log in']")).click();
	driver.findElement(By.id("edit-name--2")).sendKeys("Pat");
	driver.findElement(By.xpath("(//input[@class='form-text required'])[2]")).sendKeys("Pat");
	driver.findElement(By.xpath("//input[@class='button_type_3 color_light bg_scheme_color  r_corners tr_delay_hover box_s_none form-submit form-submit']")).click();
}
@AfterMethod
public void configureAM()
{
	driver.findElement(By.xpath("//button[@class='bg_tr color_dark tr_all_hover text_cs_hover close f_size_large']")).click();
}
@AfterTest
public void configureAT()
{
driver.close();	
report.flush();
}
}

