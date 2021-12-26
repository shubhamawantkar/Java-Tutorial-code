package com.Part1.Annotations;


// Marker Annotation -  annotation with empty value
// Single value Annotation - contains one value
// Multi value Annotation

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
// Meta Annotation
@interface SmartPhone{
        String os()default "Symbian";
        int version()default 1;
}

@SmartPhone(os="android",version = 6)
class NokiaASeries{
    String model;
    int size;


    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }



}
public class AnnotationDemo1 {
    public static void main(String[] args) {
        NokiaASeries obj = new NokiaASeries("Fire",5);

        Class c = obj.getClass();
        Annotation  an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) an;
        System.out.println(s.os()+" "+s.version());
    }
}
