package com.genric;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;

public class eventlist implements ITestListener
{
WebDriver driver;
public void testfail(ITestResult result) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File("screenshots/"+System.currentTimeMillis()+".png");
	String path = dst.getAbsolutePath();
	FileUtils.copyFile(src, dst);
	base.test.fail(result.getThrowable(), MediaEntityBuilder.createScreenCaptureFromPath(path).build());
}
}
