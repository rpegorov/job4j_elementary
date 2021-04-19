package ru.job4j.testJob.second;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class Listener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        Arrays.stream(iTestContext.getAllTestMethods())
                .map(e -> e.getRealClass().getDeclaredMethods())
                .flatMap(e -> Arrays.stream(e.clone()))
                .map(e -> e.getAnnotation(TestMethodInfo.class))
                .forEach(e -> System.out.println(getMessage(e)));
    }

    private String getMessage(TestMethodInfo obj) {
        return String.format("[%s] [%s] [%s]", obj.priority(), obj.author(), obj.lastModified());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
