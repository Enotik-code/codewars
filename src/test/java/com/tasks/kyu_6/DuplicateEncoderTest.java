package com.tasks.kyu_6;

import com.tasks.kyu_6.DuplicateEncoder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEncoderTest {

    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
    }

    @Test
    public void test2(){
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}