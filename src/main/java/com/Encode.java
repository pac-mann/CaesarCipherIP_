package com;

public class Encode {
    private String encodeText;
      private int encodeKey;

    public Encode(String encodeText, int encodeKey) {
        this.encodeText = encodeText;
        this.encodeKey = encodeKey;
    }
    public void setEncodetext(String encodeText) {
        this.encodeText = encodeText.toUpperCase();
    }
    public String getEncodeText() {
        return encodeText;
    }
    public void setEncodeKey(Integer encodeKey) {
        this.encodeKey = encodeKey;
    }
    public int getEncodeKey() {
        return encodeKey;
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