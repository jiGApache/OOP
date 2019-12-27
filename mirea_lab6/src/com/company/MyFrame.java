package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame {
        private class NormalMouse implements MouseListener{
                private String welcome;
                NormalMouse(String welcome){
                        this.welcome = welcome;
                }
                @Override
                public void mouseClicked(MouseEvent e) {}
                @Override
                public void mousePressed(MouseEvent e) {}
                @Override
                public void mouseReleased(MouseEvent e) {}
                @Override
                public void mouseEntered(MouseEvent e) {
                        JOptionPane.showMessageDialog(null, welcome);
                }
                @Override
                public void mouseExited(MouseEvent e) {}
        }

        private JLabel[] labels = new JLabel[5];
        private JPanel[] panels = new JPanel[5];
        private NormalMouse[] listenners = new NormalMouse[]{
                new NormalMouse("Center"),
                new NormalMouse("West"),
                new NormalMouse("East"),
                new NormalMouse("North"),
                new NormalMouse("South")
        };
        public MyFrame(){
                setTitle("Окошечко");
                setSize(600, 500);
                setLayout(new BorderLayout(3,3));
                for (int i = 0; i < panels.length; i++)
                {
                        panels[i] = new JPanel();
                        panels[i].setBackground(new Color(177, 177,255));
                        panels[i].addMouseListener(listenners[i]);

                        labels[i] = new JLabel();
                        Font fnt = new Font("Times new roman", Font.BOLD, 14);
                        labels[i].setFont(fnt);
                        panels[i].add(labels[i]);
                }

                labels[0].setText("Center");
                add(panels[0], BorderLayout.CENTER);

                panels[1].setPreferredSize(new Dimension(150, 300));
                labels[1].setText("West");
                add(panels[1], BorderLayout.WEST);

                panels[2].setPreferredSize(new Dimension(150, 300));
                labels[2].setText("East");
                add(panels[2], BorderLayout.EAST);

                panels[3].setPreferredSize(new Dimension(600, 100));
                labels[3].setText("North");
                add(panels[3], BorderLayout.NORTH);

                panels[4].setPreferredSize(new Dimension(600, 100));
                labels[4].setText("South");
                add(panels[4], BorderLayout.SOUTH);

                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
