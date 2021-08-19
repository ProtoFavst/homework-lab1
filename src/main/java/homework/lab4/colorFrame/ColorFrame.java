package homework.lab4.colorFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame{


    public ColorFrame(int counter[]) throws HeadlessException {

        setSize(500,500);
        JButton button = new JButton("click me to be red");


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(counter[0]++);
            }
        });

        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        int[] array = {10};
        new ColorFrame(array);

}}
