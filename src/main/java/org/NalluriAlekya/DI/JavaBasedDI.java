package org.NalluriAlekya.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedDI {

   @Bean
    public Message getMessage() {
        return new Message();
    }

    public String showMessage() {
        Message message = getMessage();
        return message.getMessage() + " from JavaBasedDI";
    }
}
