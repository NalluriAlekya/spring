package org.NalluriAlekya.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotationBasedDI {

    @Autowired
    private MessegeBasedAnnotation messegeBasedAnnotation;

    public String display(){
        String message = messegeBasedAnnotation.show();
        return message + " from AnnotationBasedDI";
    }

}
