package de.seyfarth.tutorium.debugging;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChainPartTest {
    
    public ChainPartTest() {
    }
    
    @Test
    public void testNullContent() {
        ChainPart<Object> chainPart = new ChainPart<>(null);
        assertNull(chainPart.getContent());
    }

    @Test
    public void testSetNextKeepNull() {
        ChainPart<Object> chainPart = new ChainPart<>(new Object());
        assertNull(chainPart.getNext());
        chainPart.setNext(null);
        assertNull(chainPart.getNext());
    }

    @Test
    public void testSetNext() {
        ChainPart<Object> chainPart = new ChainPart<>(new Object());
        assertNull(chainPart.getNext());
        ChainPart<Object> expected = new ChainPart<>(new Object());
        chainPart.setNext(expected);
        assertSame(expected, chainPart.getNext());
    }

    @Test
    public void testSetNextToNull() {
        ChainPart<Object> chainPart = new ChainPart<>(new Object());
        chainPart.setNext(new ChainPart<>(new Object()));
        assertNotNull(chainPart.getNext());
        chainPart.setNext(null);
        assertNull(chainPart.getNext());
    }
    
    @Test
    public void testSetNextSame() {
        ChainPart<Object> chainPart = new ChainPart<>(new Object());
        chainPart.setNext(chainPart);
        assertSame(chainPart, chainPart.getNext());
    }
    
}
