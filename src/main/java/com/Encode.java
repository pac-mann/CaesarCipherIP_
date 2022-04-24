package com;

public class Encode {
      String plainText (String userInput){
         if (userInput == ""){
             throw new IllegalArgumentException("Please enter text you wish to encrypt");
         }else {
             return userInput;
         }
     }
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
