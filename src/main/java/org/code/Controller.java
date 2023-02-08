package org.code;

import org.code.methods.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Controller implements ActionListener {
    AtBash atBash = new AtBash();
    Caeser caeser = new Caeser();
    Rot13 rot13 = new Rot13();
    Vigenere vigenere = new Vigenere();
    Histogram histogram = new Histogram();


    public void actionPerformed(ActionEvent event)
    {
        String text = View.textArea1.getText();
        String method = Objects.requireNonNull(View.comboBox.getSelectedItem()).toString();
        String key_string = View.textField.getText();
        int key_int = 0;
        String text_after_converting = "";


        switch (method) {
            case "Caesar cipher (encryption)" -> {
                if (!key_string.equals("Key")) {
                    key_int = Integer.parseInt(key_string);
                    text_after_converting = caeser.caesar(text, key_int, false);
                } else {
                    text_after_converting = "Enter the encryption key!";
                }
            }
            case "Caesar cipher (decryption)" -> {
                if (!key_string.equals("Key")) {
                    key_int = Integer.parseInt(key_string);
                    text_after_converting = caeser.caesar(text, key_int, true);
                } else {
                    text_after_converting = "Enter the encryption key!";
                }
            }
            case "Vigenère Cipher" -> {
                if (!key_string.equals("Key")) {
                    text_after_converting = vigenere.vigenere(text, key_string, false);
                } else {
                    text_after_converting = "Enter the encryption key!";
                }
            }
            case "Rot13(encryption)" -> text_after_converting = rot13.rot13(text, false);
            case "Rot13(decryption)" -> text_after_converting = rot13.rot13(text, true);
            case "Cipher Atbash (encryption)" -> text_after_converting = atBash.atbash(text);
            case "Cipher Atbash (decryption)" -> text_after_converting = atBash.atbash(text);
            case "Semantic text analysis" -> text_after_converting = histogram.histogram(text);
        }

        View.textField.setText("Key");
        View.textArea2.setText(text_after_converting);
    }
}