package ru.job4j.testJob.first;

import java.lang.reflect.Proxy;

public class MethodInterception {
    public static <T>  MainPage createPage(Class<T> clazz) {
        return (MainPage) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                new Class[]{ clazz },
                new MainPageHandler()
        );
    }
}
