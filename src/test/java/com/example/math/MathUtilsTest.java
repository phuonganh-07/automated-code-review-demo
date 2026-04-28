package com.example.math;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtilsTest {
  private static final Logger logger = LoggerFactory.getLogger(MathUtilsTest.class);

  @BeforeAll
  static void initAll() {
    logger.info("=== Start running MathUtilsTest ===");
  }

  @AfterAll
  static void tearDownAll() {
    logger.info("=== Finished ===");
  }

  @Test
  @DisplayName("Test max: a > b")
  void testMaxALessThanB() {
    assertEquals(5, MathUtils.max(5, 3));
  }

  @Test
  @DisplayName("Test max: a = b")
  void testMaxAEqualB() {
    assertEquals(10, MathUtils.max(10, 10));
  }

  @Test
  @DisplayName("Test max: a < b")
  void testMaxAGreaterThanB() {
    assertEquals(8, MathUtils.max(2, 8));
  }

  @Test
  @DisplayName("Test max: Boundary Value Analysis")
  void testMaxBVA() {
    assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, Integer.MIN_VALUE));
    assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, 100));
  }

  @Test
  @DisplayName("Test divide: b > 0")
  void testDivideBPositive() {
    assertEquals(5, MathUtils.divide(10, 2));
  }

  @Test
  @DisplayName("Test divide: b < 0")
  void testDivideBNegative() {
    assertEquals(-5, MathUtils.divide(10, -2));
  }

  @Test
  @DisplayName("Test divide: b = 0 (Exception handling)")
  void testDivideByZero() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      MathUtils.divide(10, 0);
    });
    assertEquals("Divider must not be zero", exception.getMessage());
  }
}