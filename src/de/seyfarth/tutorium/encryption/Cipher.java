package de.seyfarth.tutorium.encryption;

public abstract class Cipher {
    public abstract String encrypt (Key key, String message);
    public abstract String decrypt (Key key, String crypto);
    public abstract Key getKey(String keyRepresentant);
}
