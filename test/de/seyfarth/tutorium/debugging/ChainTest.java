package de.seyfarth.tutorium.debugging;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChainTest {

    @Test
    public void testSizeIsZero() {
        Chain chain = new Chain();
        assertEquals(0, chain.size());
    }

    @Test
    public void testSetEmptyChain() {
        Chain chain = new Chain();
        assertNull(chain.set(0, new Object()));
    }

    @Test
    public void testSetEndChain() {
        Chain chain = new Chain();
        chain.add(new Object());
        assertNull(chain.set(1, new Object()));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIndexMinusOne() {
        Chain chain = new Chain();
        chain.get(-1);
    }

    @Test
    public void testSetReplaceFirstElement() {
        Chain chain = new Chain();
        Object expected = new Object();
        chain.add(expected);
        Object replacement = new Object();
        assertSame(expected, chain.set(0, replacement));
        assertSame(replacement, chain.get(0));
    }

}
