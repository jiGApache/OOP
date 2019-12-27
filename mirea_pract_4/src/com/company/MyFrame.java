package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private Match match = new Match(0, 0, "N/A", "DRAW");
    private JPanel[] panels = new JPanel[6];
    private JButton[] buttons = new JButton[2];
    private JLabel scoreBoard = new JLabel(match.getMilanGoals() + ":" + match.getMadridGoals());
    private JLabel lastScorer = new JLabel("last scorer: " + match.getLastScorer());
    private JLabel winner = new JLabel("winner: " + match.getWinner());

    public MyFrame(){
        //Формирование главного окна
        setSize(700,500);
        setLayout(new BorderLayout());
        for (int i = 0; i<panels.length; i++){
            panels[i] = new JPanel();
        }

        //Конструкция надписей
        Font fontSB = new Font("Times new roman", Font.BOLD, 50);
        Font font = new Font("Times new roman", Font.BOLD, 18);
        scoreBoard.setFont(fontSB);
        lastScorer.setFont(font);
        winner.setFont(font);

        //Отвечает за нижнюю часть с кнопками
        panels[0].setPreferredSize(new Dimension(500, 150));
        panels[0].setLayout(new GridLayout(1,2));
        panels[0].add(panels[1]);
        panels[0].add(panels[2]);

        //Отвечает за кнопку "AC Milan"
        buttons[0] = new JButton("AC Milan");
        buttons[0].setPreferredSize(new Dimension(200, 100));
        buttons[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                match.setMilanGoals(1);
                updateMatch();
            }
        });
        panels[1].setBackground(new Color(177, 177, 255));
        panels[1].add(buttons[0]);

        //Отвечает за кнопку "Real Madrid"
        buttons[1] = new JButton("Real Madrid");
        buttons[1].setPreferredSize(new Dimension(200, 100));
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                match.setMadridGoals(1);
                updateMatch();
            }
        });
        panels[2].setBackground(new Color(177, 177, 255));
        panels[2].add(buttons[1]);

        //Добавление надписей
        panels[3].add(scoreBoard);
        panels[4].add(lastScorer);
        panels[5].add(winner);

        panels[4].setPreferredSize(new Dimension(200, 350));
        panels[5].setPreferredSize(new Dimension(200, 350));

        //Для визуального различия
        panels[3].setBackground(new Color(177, 177, 255));
        panels[4].setBackground(new Color(177, 177, 255));
        panels[5].setBackground(new Color(177, 177, 255));

        //Добавление всех пенелей с элементами
        add(panels[0], BorderLayout.SOUTH);
        add(panels[3], BorderLayout.CENTER);
        add(panels[4], BorderLayout.WEST);
        add(panels[5], BorderLayout.EAST);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void updateMatch(){
        scoreBoard.setText(match.getMilanGoals() + ":" + match.getMadridGoals());
        lastScorer.setText("last scorer: " + match.getLastScorer());
        if (match.getMilanGoals() > match.getMadridGoals()){
            match.setWinner("AC Milan");
            winner.setText("winner: " + match.getWinner());
        } else if(match.getMilanGoals() < match.getMadridGoals()) {
            match.setWinner("Real Madrid");
            winner.setText("winner: " + match.getWinner());
        }
        else if (match.getMilanGoals() == match.getMadridGoals()) {
            match.setWinner("DRAW");
            winner.setText("winner: " + match.getWinner());
        }
    }
}
