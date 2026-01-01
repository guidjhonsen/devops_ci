package com.paymentchain.billing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class BasicApplicationTests  {

    @Test
    void contextLoads() {
       String message = "Default Message Cambio Test Devops";
       assertNotNull(message);//assertNotNull(message);
    }
}
