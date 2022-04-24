package com;

public class Decode {
    private String plainText;
    private int decodeKey;

    public Decode(String plainText, int decodeKey) {
        this.plainText = plainText;
        this.decodeKey = decodeKey;
    }

    public String getPlainText() {
        return plainText;
    }

    public int getDecodeKey() {
        return decodeKey;
    }
}
    /*private String codedText = "";
    int decodeKey (int decryptionKey){
        if (decryptionKey < 0  ){
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else if (decryptionKey > 25) {
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else {
            return decryptionKey;
        }
    }
*/

