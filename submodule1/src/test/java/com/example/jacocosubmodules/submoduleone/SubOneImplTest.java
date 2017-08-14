package com.example.jacocosubmodules.submoduleone;

import com.example.jacocosubmodules.submodule.Submodule;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubOneImplTest {

    @Before
    public void before() throws Exception { }

    @After
    public void after() throws Exception { }

    @Test
    public void testFoo() throws Exception {
        Submodule submodule = new SubOneImpl();
        String test = submodule.foo();
        assertEquals("SubOneImpl", test);
    }
} 
