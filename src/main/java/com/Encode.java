package com;

public class Encode {
    private String plainText = "";
     int encodeKey (int encryptionKey){
        if (encryptionKey < 0  ){
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else if (encryptionKey > 25) {
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else {
            return encryptionKey;
        }
    }
}
