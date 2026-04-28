package com.example.math;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for mathematical operations.
 */
public class MathUtils {

  private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

  /**
   * Returns the maximum of two integers.
   */
  public static int max(int a, int b) {
    if (a >= b) {
      return a;
    }
    return b;
  }

  /**
   * Divides two integers.
   */
  public static int divide(int a, int b) {
    if (b == 0) {
      logger.error("Attempted to divide {} by zero", a);
      throw new IllegalArgumentException("Divider must not be zero");
    }
    return a / b;
  }
}