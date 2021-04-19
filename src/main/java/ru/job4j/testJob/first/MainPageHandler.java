package ru.job4j.testJob.first;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Optional;

public class MainPageHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        return Optional
                .ofNullable(method.getAnnotation(Selector.class))
                .map(Selector::xpath)
                .orElseThrow(() -> new UnsupportedOperationException("Unsupported method: " + method.getName()));

    }
}
