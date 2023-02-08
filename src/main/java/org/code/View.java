package org.code;

import javax.swing.*;
import java.awt.*;

public class View {
    static String[] items = {
            "Caesar cipher (encryption)",
            "Caesar cipher (decryption)",
            "Rot13(encryption)",
            "Rot13(decryption)",
            "Cipher Atbash (encryption)",
            "Cipher Atbash (decryption)",
            "Vigenère Cipher"
    };
    static JComboBox comboBox = new JComboBox(items);
    static JTextField textField = new JTextField("Key");
    static JButton convertTextButton = new JButton("Convert text");
    static JTextArea textArea1 = new JTextArea(21, 23);
    static JTextArea textArea2 = new JTextArea(21, 23);

    public View() {
        JFrame frame = new JFrame();
        int frameWidth = 800, frameHeight = 600;
        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        BorderLayout bl1 = new BorderLayout();
        frame.setLayout(bl1);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        Color top_color = new Color(33, 33, 33);
        Color bottom_color = new Color(65, 65, 65);

        p1.setBackground(top_color);
        p2.setBackground(bottom_color);
        p1.setPreferredSize(new Dimension(frameWidth, 110));
        p2.setPreferredSize(new Dimension(frameWidth, frameHeight - 100));
        frame.add(p1, BorderLayout.PAGE_START);
        frame.add(p2, BorderLayout.PAGE_END);

        p1.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(frameWidth, 30));
        panel.setBackground(top_color);
        p1.add(panel);

        Font font_menu = new Font("Verdana", Font.PLAIN, 13);
        Font font_for_text_area = new Font("Verdana", Font.ITALIC, 14);

        comboBox.setFocusable(false);
        comboBox.setPreferredSize(new Dimension(200, 30));
        comboBox.setFont(font_menu);
        p1.add(comboBox);

        textField.setPreferredSize(new Dimension(50, 30));
        textField.setFont(font_for_text_area);
        p1.add(textField);

        convertTextButton.setPreferredSize(new Dimension(100, 30));
        convertTextButton.setFocusPainted(false);
        convertTextButton.setFont(font_menu);
        p1.add(convertTextButton);

        JPanel p2_1 = new JPanel();
        JPanel p2_2 = new JPanel();
        JPanel p2_3 = new JPanel();
        JPanel p2_4 = new JPanel();
        JPanel p2_5 = new JPanel();
        p2_1.setPreferredSize(new Dimension(frameWidth, 60));
        p2_2.setPreferredSize(new Dimension(frameWidth, 20));
        p2_3.setPreferredSize(new Dimension(20, frameHeight - 100));
        p2_4.setPreferredSize(new Dimension(20, frameHeight - 100));

        p2_1.setBackground(bottom_color);
        p2_2.setBackground(bottom_color);
        p2_3.setBackground(bottom_color);
        p2_4.setBackground(bottom_color);
        p2_5.setBackground(bottom_color);

        p2.setLayout(new BorderLayout());
        p2.add(p2_1, BorderLayout.NORTH);
        p2.add(p2_2, BorderLayout.SOUTH);
        p2.add(p2_3, BorderLayout.WEST);
        p2.add(p2_4, BorderLayout.EAST);
        p2.add(p2_5, BorderLayout.CENTER);

        JPanel p2_5_1 = new JPanel();
        JPanel p2_5_3 = new JPanel();
        p2_5_1.setBackground(bottom_color);
        p2_5_3.setBackground(bottom_color);
        p2_5_1.setPreferredSize(new Dimension(frameWidth / 2 - 20, frameHeight - 150));
        p2_5_3.setPreferredSize(new Dimension(frameWidth / 2 - 20, frameHeight - 150));

        JPanel p = new JPanel();
        p.setBackground(bottom_color);

        p2_5.add(p);
        p.setLayout(new FlowLayout());
        p.add(p2_5_1);
        p.add(p2_5_3);

        JPanel empty_p511 = new JPanel();
        JPanel empty_p513 = new JPanel();
        p2_5_1.add(empty_p511);
        p2_5_3.add(empty_p513);
        empty_p511.setLayout(new FlowLayout());
        empty_p513.setLayout(new FlowLayout());

        textArea1.setFont(font_for_text_area);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        textArea1.setText("Input");
        empty_p511.add(new JScrollPane(textArea1));

        textArea2.setFont(font_for_text_area);
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);
        textArea2.setEditable(false);
        textArea2.setText("Output");
        empty_p513.add(new JScrollPane(textArea2));

        frame.setVisible(true);


        convertTextButton.addActionListener(new Controller());
    }

}