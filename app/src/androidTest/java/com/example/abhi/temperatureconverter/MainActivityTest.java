package com.example.abhi.temperatureconverter;

import android.support.test.filters.SmallTest;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

public class MainActivityTest extends ActivityInstrumentationTestCase2 {
    public MainActivityTest(Class activityClass) {
        super(MainActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();

    }

    @SmallTest
    public void testEditText() {
        EditText et = getActivity().findViewById(R.id.editText1);
        assertNotNull(et);
    }


    @SmallTest
    public void testButton() {
        EditText bt = getActivity().findViewById(R.id.button);
        assertNotNull(bt);
    }

    @SmallTest
    public void testradioButton1() {
        EditText rt1 = getActivity().findViewById(R.id.celsiusButton);
        assertNotNull(rt1);
    }

    @SmallTest
    public void testradioButton12() {
        EditText rt2 = getActivity().findViewById(R.id.fahrenheitButton);
        assertNotNull(rt2);
    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
