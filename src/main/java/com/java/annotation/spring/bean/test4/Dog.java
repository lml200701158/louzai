package com.java.annotation.spring.bean.test4;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
//@Service
public class Dog implements Animal {
    private String dogName = "旺财";
}
