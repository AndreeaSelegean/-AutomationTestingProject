package com.evozon.suits;


import com.evozon.test.DummyTest;
import com.evozon.test.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class,
        DummyTest.class
})
public class TestSuits {
}
