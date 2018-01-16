package de.seyfarth.tutorium.debugging;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChainTest {

    @Test
    public void testSizeIsZero() {
        Chain<Object> chain = new Chain<>();
        assertEquals(0, chain.size());
    }

    @Test
    public void testSetEmptyChain() {
        Chain<Object> chain = new Chain<>();
        assertNull(chain.set(0, new Object()));
    }

    @Test
    public void testSetEndChain() {
        Chain<Object> chain = new Chain<>();
        chain.add(new Object());
        assertNull(chain.set(1, new Object()));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIndexMinusOne() {
        Chain<Object> chain = new Chain<>();
        chain.get(-1);
    }

    @Test
    public void testSetReplaceFirstElement() {
        Chain<Object> chain = new Chain<>();
        Object expected = new Object();
        chain.add(expected);
        Object replacement = new Object();
        assertSame(expected, chain.set(0, replacement));
        assertSame(replacement, chain.get(0));
    }

}
