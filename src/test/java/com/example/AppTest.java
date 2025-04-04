package com.example;

import com.example.service.SimpleService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testSimpleService() {
        SimpleService service = new SimpleService();
        assertEquals("Hello from Simple Service!", service.getMessage());
    }
}