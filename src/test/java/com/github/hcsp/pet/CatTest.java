package com.github.hcsp.pet;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void catCanSayItsName() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos, true));
        Cat cat = new Cat();
        cat.name = "ABCDEF";
        cat.sayName();
        assertTrue(new String(baos.toByteArray()).toLowerCase().contains("abcdef"));
    }
}