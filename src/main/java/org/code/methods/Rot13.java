package org.code.methods;

public class Rot13 {
    Caeser caeser = new Caeser();

    public String rot13(String text, boolean isTextEncrypted) {
        String newText = "";
        if (!isTextEncrypted) {
            newText = caeser.caesar(text, 13, false);
        }
        if (isTextEncrypted) {
            newText = caeser.caesar(text, 13, true);
        }
        return newText;
    }
}
