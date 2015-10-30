package de.nilspreusker.showcase.control;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class SomeServiceTest {

    private SomeService service;

    @Before
    public void before() {
        service = new SomeService();
    }

    @Test
    public void testSomeServiceMethod() throws Exception {
        assertTrue(service.someServiceMethod());
    }
}