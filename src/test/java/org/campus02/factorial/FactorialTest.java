package org.campus02.factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    Factorial f;

    @BeforeEach
    void setUp() {
        f = new Factorial();
    }

    @Test
    void recursiv() {
//        assertEquals(1, f.fact(1));
        assertEquals(120, f.fact(5));
    }
}
