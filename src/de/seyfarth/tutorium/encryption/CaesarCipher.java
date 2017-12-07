package de.seyfarth.tutorium.encryption;

public class CaesarCipher extends Cipher {

    @Override
    public String encrypt(Key key, String message) {
        CaesarKey caesarKey = (CaesarKey) key;
        int delta = caesarKey.getDelta();
        StringBuilder encrypted = new StringBuilder(message.length());
        for (int index = 0; index < message.length(); index++) {
            encrypted.append(encryptChar(delta, message.charAt(index)));
        }
        return encrypted.toString();
    }

    @Override
    public String decrypt(Key key, String crypto) {
        return encrypt(((CaesarKey)key).getInvertedKey(), crypto);
    }

    @Override
    public CaesarKey getKey(String keyRepresentant) {
        return new CaesarKey(Integer.valueOf(keyRepresentant));
    }

    private char encryptChar(int delta, char letter) {
        if (letter >= '0' && letter <= '9') {
            return (char) ((letter - '0' + delta) % 10 + '0');
        } else if (letter >= 'A' && letter <= 'Z') {
            return (char) ((letter - 'A' + delta) % 26 + 'A');
        } else if (letter >= 'a' && letter <= 'z') {
            return (char) ((letter - 'a' + delta) % 26 + 'a');
        } else {
            return letter;
        }
    }
}
