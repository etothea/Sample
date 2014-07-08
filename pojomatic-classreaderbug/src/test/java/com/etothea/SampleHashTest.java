package com.etothea;

import org.junit.Assert;
import org.junit.Test;

public class SampleHashTest {

  @Test
  public void voidTestHashcodeCall() {

    Sample sample = new Sample();
    Assert.assertNotNull(sample.hashCode());

  }


}
