package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 적용 대상 : METHOD
@Target({ElementType.METHOD})

// 유지 정책 : RUNTIME
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {

    // value 속성 : 선의 종류
    String value();

    // number 속성 : 출력 횟수
    int number() default 15;

}
