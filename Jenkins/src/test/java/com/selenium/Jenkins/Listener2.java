package com.selenium.Jenkins;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result){
		// TODO Auto-generated method stub
		System.out.println("Test Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result){
		// TODO Auto-generated method stub
		System.out.println("Test Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result){
		// TODO Auto-generated method stub
		System.out.println("Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result){
		// TODO Auto-generated method stub
		System.out.println("Test Skipped");
		
	}

	@Override
	public void onStart(ITestContext context){
		// TODO Auto-generated method stub
		System.out.println("Program Started");
		
	}

	@Override
	public void onFinish(ITestContext context){
		// TODO Auto-generated method stub
		System.out.println("Program Completed");
	
	}
}
