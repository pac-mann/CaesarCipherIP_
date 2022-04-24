package com;

public class Decode {
    private String decodeText;
    private int decodeKey;

    public Decode(String decodeText, int decodeKey) {
        this.decodeText = decodeText;
        this.decodeKey = decodeKey;
    }
    public void setDecodetext(String decodeText) {
        this.decodeText = decodeText.toUpperCase();
    }
    public String getDecodeText() {
        return decodeText;
    }
    public void setDecodeKey(Integer decodeKey) {
        this.decodeKey = decodeKey;
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

