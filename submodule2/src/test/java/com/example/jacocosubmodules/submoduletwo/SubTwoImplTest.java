package com.example.jacocosubmodules.submoduletwo;

import com.example.jacocosubmodules.submodule.Submodule;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubTwoImplTest {

    @Before
    public void before() throws Exception { }

    @After
    public void after() throws Exception { }

    @Test
    public void testFoo() throws Exception {
        Submodule submodule = new SubTwoImpl();
        String test = submodule.foo();
        assertEquals("SubTwoImpl", test);
    }
}
