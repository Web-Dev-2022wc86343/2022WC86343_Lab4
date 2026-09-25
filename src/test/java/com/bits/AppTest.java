package com.bits;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testStatus() {
        App app = new App();
        assertEquals("SUCCESS", app.getStatus());
    }
}
