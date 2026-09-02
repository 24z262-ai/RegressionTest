package org.example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMainMethod() {

        // Redirect standard output to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call the main method
        Main.main(new String[]{});

        // Check the output
        assertEquals("Hello and welcome!", outContent.toString().trim());

        // Reset standard output
        System.setOut(originalOut);
    }
}