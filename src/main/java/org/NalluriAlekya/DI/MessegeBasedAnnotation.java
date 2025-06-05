package org.NalluriAlekya.DI;

import org.springframework.stereotype.Component;

@Component
public class MessegeBasedAnnotation {
    public String show(){
        return "Hello, this is a message from the MessegeBasedAnnotation class!";
    }
}
