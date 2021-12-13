


package com.Vtiger;

import java.io.IOException;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vtiger.generic.Baseclass;
import com.vtiger.generic.JavaUtility;

public class ListenerImplementation implements  ITestListener {

	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	public void onTestFailure(ITestResult result) {


		test.log(Status.FAIL,"this method"+result.getMethod().getMethodName());
		test.log(Status.FAIL,result.getThrowable());

		try {
	
			String path=Baseclass.getscreenshot(result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	public void onStart(ITestContext context) {
		JavaUtility jv = new JavaUtility();
		String date = jv .getCurrentDate();

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("../IsmailPractice/src/test/resources/reports213.html");

		reporter.config().setDocumentTitle("IsmailPractice");
		reporter.config().setReportName("Vtiger");
		reporter.config().setTheme(Theme.DARK);

		reports=new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("AppURL",  "http://localhost:8888/index.php?module=Accounts&action=index");
		reports.setSystemInfo("Env",  "Test QA");
		reports.setSystemInfo("Build ", "2.1");
		reports.setSystemInfo("Reporter name ", "Ismail");
	}
	public void onTestStart(ITestResult result) {
		test=reports.createTest(result.getMethod().getMethodName());

	}
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"This method"+result.getMethod().getMethodName()+ "is Passed");
	}
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,"This method "+result.getMethod().getMethodName()+"is skipped");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onFinish(ITestContext context) {
		reports.flush();

	}	

}
