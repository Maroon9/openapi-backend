package com.xzw.openapiinterface;

import com.xzw.openapiclientsdk.client.OpenApiClient;
import com.xzw.openapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class OpenapiInterfaceApplicationTests {

    @Resource
    private OpenApiClient openApiClient;

    @Test
    void contextLoads() {
        String name = openApiClient.getNameByGet("xzw");
        User user = new User();
        user.setUsername("xz");
        String usernameByPost = openApiClient.getUsernameByPost(user);
        System.out.println(name);
        System.out.println(usernameByPost);
    }

}
