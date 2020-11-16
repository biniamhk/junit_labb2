package se.labb2_junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestTextProcessor {
    @BeforeAll
    public static void beforeAlltest() {
        System.out.println("this runs before all tests once");
    }

    @AfterAll
    public static void afterAlltest() {
        System.out.println("this runs after all tests completed");
    }

    @RepeatedTest(4)
    @Order(3)
    public void testLowerToUpper() {
        //we can also use with out creating an object bc methods are static and are in the same package
        TextProcessor textProcessor = new TextProcessor();
        assertNotNull(textProcessor.lowerToUpper("biniam"), "return uppercase string");

    }

    @Test
    @Order(1)
    @DisplayName("testing upperToLower change")
    public void testUpperToLower() {
        assertEquals("java20", TextProcessor.upperToLower("JAVA20"));

    }

    @Test
    @Order(2)
    public void testCharAtPos() {
        assertFalse(TextProcessor.charAtGivenPos("javastockholm", 3) == 'j');

    }
}
