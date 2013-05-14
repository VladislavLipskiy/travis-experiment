package com.stanfy.travis.sample.test;

import com.stanfy.travis.sample.MainActivity;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

  public MainActivityTest() {
    super(MainActivity.class);
  }
  
  public void testOk() {
    assertNotNull(getActivity());
    assertTrue(getActivity() instanceof MainActivity);
  }
  
}
