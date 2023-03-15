package com.xzw.project.provider;

import java.util.concurrent.CompletableFuture;

/**
 * @author maroon
 * @date 2023/3/14 15:47
 */
public interface DemoService {

    String sayHello(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }

}

