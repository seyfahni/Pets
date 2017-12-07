package de.seyfarth.tutorium.encryption;

public class CaesarKey extends Key {
    
    private final int delta;

    public CaesarKey(int delta) {
        this.delta = delta;
    }
    
    @Override
    String getContent() {
        return String.valueOf(delta);
    }
    
    int getDelta() {
        return delta;
    }
    
    CaesarKey getInvertedKey() {
        return new CaesarKey(-delta);
    }
}
