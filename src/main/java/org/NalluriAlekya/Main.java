package org.NalluriAlekya;

import org.NalluriAlekya.DI.*;
import org.NalluriAlekya.IOCConfiguration.AnnotationBasedConfiguration;
import org.NalluriAlekya.IOCConfiguration.JavaBasedConfiguration;
import org.NalluriAlekya.IOCConfiguration.XMLBasedConfiguration;
import org.NalluriAlekya.IOCConfiguration.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        XMLBasedConfiguration obj= (XMLBasedConfiguration) context.getBean("xmlConfiguration");
        System.out.println(obj.handleRequest());
        ApplicationContext context1 =new AnnotationConfigApplicationContext(JavaBasedConfiguration.class);
        MyService myService1 = (MyService) context1.getBean("myService");
        System.out.println(myService1.performService());
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AnnotationBasedConfiguration.class);
        AnnotationBasedConfiguration annotationController = (AnnotationBasedConfiguration) context2.getBean("annotationBasedConfiguration");
        System.out.println(annotationController.handleRequest1());
        ApplicationContext contextDI = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ConstructorBasedDI constructorBasedDI = (ConstructorBasedDI) contextDI.getBean("constructorBasedDI");
         System.out.println(constructorBasedDI.getMessage());
         ApplicationContext contextSetter = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SetterBasedDI contextSetterDI = (SetterBasedDI) contextSetter.getBean("setterBasedDI");
        System.out.println(contextSetterDI.showMessage());
        ApplicationContext contextAnnotation = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationBasedDI annotationBasedDI = (AnnotationBasedDI) contextAnnotation.getBean("annotationBasedDI");
        System.out.println(annotationBasedDI.display());
        ApplicationContext contextJavaDI = new AnnotationConfigApplicationContext(JavaBasedDI.class);
        JavaBasedDI javaBasedDI = (JavaBasedDI) contextJavaDI.getBean("javaBasedDI");
        System.out.println(javaBasedDI.showMessage());



    }
}