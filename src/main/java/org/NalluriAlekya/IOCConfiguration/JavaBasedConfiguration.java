package org.NalluriAlekya.IOCConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedConfiguration {

    // This class can be used to define beans or configurations
    // for the Java Basic application context.

    // You can add methods here to define beans or configurations
    // that will be picked up by the Spring container.

    // Example:
     @Bean
     public MyService myService() {
         return new MyService();
     }
}
