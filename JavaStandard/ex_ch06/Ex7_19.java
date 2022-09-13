package ex_ch06;

import java.awt.*;
import java.awt.event.*;

public class Ex7_19 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred");
            }
        });
    }

}
