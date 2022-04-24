

package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {
    @Test
    void zeroIsAValidEncryptionKey(){
        var encode = new Encode(" ", 0);
        assertEquals(0, encode.encodeKey(0));
    }
    @Test
    void twentyFiveIsAValidEncryptionKey(){
        var encode = new Encode(" ", 25);
        assertEquals(25, encode.encodeKey(25));
    }
    @Test
    void negativeOneIsIllegalArgumentException(){
        var encode = new Encode(" ", -1);
        assertThrows(IllegalArgumentException.class, () ->{
            encode.encodeKey(-1 );
        });
    }
    @Test
    void twentySixIsIllegalArgumentException(){
        var encode = new Encode(" ", 26);
        assertThrows(IllegalArgumentException.class, () ->{
            encode.encodeKey(26 );
        });
    }
}



/*@Test
    void letterAIsValid(){
        var plainText = new Encode();
        assertEquals("B", encode.plainText("B"));
    }
    @Test
    void nullIsIllegalArgumentException(){
        var encode = new Encode("");
        assertThrows(IllegalArgumentException.class, () ->{
            encode.plainText("" );
        });
    }

    @Test
    void zeroIsAValidEncryptionKey(){
        var encode = new Encode();
        assertEquals(0, encode.encodeKey(0));
    }
    @Test
    void twentyFiveIsAValidEncryptionKey(){
        var encode = new Encode();
        assertEquals(25, encode.encodeKey(25));
    }
    @Test
    void negativeOneIsIllegalArgumentException(){
        var encode = new Encode();
        assertThrows(IllegalArgumentException.class, () ->{
           encode.encodeKey(-1 );
        });
    }
    @Test
    void twentySixIsIllegalArgumentException(){
        var encode = new Encode();
        assertThrows(IllegalArgumentException.class, () ->{
            encode.encodeKey(26 );
        });
    }*/
