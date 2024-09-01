package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }


  // Replace the following example tests with your own tests
  // of the prime factorization function.

  @Test
  public void testFactorize12() {

    assertEquals("223", Factorizer.factorize(12));
  }
  @Test
  public void testFactorize69() {

    assertEquals("323", Factorizer.factorize(69));
  }
  @Test
  public void testFactorize0() {

    assertEquals("null", Factorizer.factorize(0));
  }
  @Test
  public void testFactorizenegative() {

    assertEquals("null", Factorizer.factorize(-22));
  }

}
