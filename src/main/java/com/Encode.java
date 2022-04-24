package com;

import static java.lang.System.out;

public class Encode {

    private String plainText;
      private int encodeKey;

    public Encode(String plainText, int encodeKey) {
        this.plainText = plainText;
        this.encodeKey = encodeKey;
    }

    public int getEncodeKey() {
        return encodeKey;
    }

    public String getPlainText() {
        return plainText;
    }
}
/*(int encryptionKey){
        if (encryptionKey < 0  ){
           throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else if (encryptionKey > 25) {
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else {
     return encryptionKey;
       }
    }*/
 /*(String userInput){
         if (userInput == ""){
             throw new IllegalArgumentException("Please enter text you wish to encrypt");
         }else {
             return userInput;
        }
     }*/