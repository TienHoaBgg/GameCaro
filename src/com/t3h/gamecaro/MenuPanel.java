package com.t3h.gamecaro;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuPanel extends JPanel implements Constants {
    private JButton btn_PlayWithCom;
    private JButton btn_PlayWithHuman;
    private JButton btn_MaxScore;
    private JButton btn_Directive;
    private JButton btn_Exit;

    public MenuPanel() {
        this.setSize(W_F, H_F);
        this.setBackground(Color.GRAY);
        this.add(initBtn_PlayWithCom());
        this.add(initBtn_PlayWithHuman());
        this.add(initBtn_MaxScore());
        this.add(initBtn_Directive());
        this.add(initBtn_Exit());

    }

    public void btn_PlayVsComAction(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Click nút Chơi Với Máy");
    }

    public void btn_PlayWithHumanAction(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Click nút Chơi Với Bạn");
    }

    public void btn_MaxScoreAction(ActionEvent e) {
            JOptionPane.showMessageDialog(this, "Click nút Điểm Cao");

    }

    public void btn_DirectiveAction(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Click nút Hướng Dẫn");
    }

    public void btn_ExitAction(ActionEvent e) {
       System.exit(0);
    }

    public void btn_SoundAction(ActionEvent e) {
        //   JOptionPane.showMessageDialog(this, "Click nút Sound");
    }


    public JButton initBtn_PlayWithCom() {
        btn_PlayWithCom = new JButton();
        btn_PlayWithCom.setBounds(10 + SIZE_BTN, 10, SIZE_BTN, SIZE_BTN);
        btn_PlayWithCom.setIcon(getIcon("back1.png"));
        btn_PlayWithCom.setRolloverIcon(getIcon("back2.png"));
        btn_PlayWithCom.setFocusPainted(false);
        btn_PlayWithCom.setBorderPainted(false);
        btn_PlayWithCom.setContentAreaFilled(false);
        btn_PlayWithCom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_PlayVsComAction(e);
            }
        });
        return btn_PlayWithCom;
    }

    public JButton initBtn_PlayWithHuman() {
        btn_PlayWithHuman = new JButton();
        btn_PlayWithHuman.setBounds(10 + 2 * SIZE_BTN, 10, SIZE_BTN, SIZE_BTN);
        btn_PlayWithHuman.setIcon(getIcon("next1.png"));
        btn_PlayWithHuman.setRolloverIcon(getIcon("next2.png"));
        btn_PlayWithHuman.setFocusPainted(false);
        btn_PlayWithHuman.setBorderPainted(false);
        btn_PlayWithHuman.setContentAreaFilled(false);
        btn_PlayWithHuman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_PlayWithHumanAction(e);
            }
        });
        return btn_PlayWithHuman;
    }

    public JButton initBtn_MaxScore() {
        btn_MaxScore = new JButton();
        btn_MaxScore.setBounds(10 + 3 * SIZE_BTN, 10, SIZE_BTN, SIZE_BTN);
        btn_MaxScore.setIcon(getIcon("restart1.png"));
        btn_MaxScore.setRolloverIcon(getIcon("restart2.png"));
        btn_MaxScore.setFocusPainted(false);
        btn_MaxScore.setBorderPainted(false);
        btn_MaxScore.setContentAreaFilled(false);
        btn_MaxScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_MaxScoreAction(e);
            }
        });
        return btn_MaxScore;
    }

    public JButton initBtn_Directive() {
        btn_Directive = new JButton();
        btn_Directive.setBounds(10 + 5 * SIZE_BTN, 10, SIZE_BTN, SIZE_BTN);
        btn_Directive.setIcon(getIcon("change1.png"));
        btn_Directive.setRolloverIcon(getIcon("change2.png"));
        btn_Directive.setFocusPainted(false);
        btn_Directive.setBorderPainted(false);
        btn_Directive.setContentAreaFilled(false);
        btn_Directive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_DirectiveAction(e);
            }
        });
        return btn_Directive;
    }

    public JButton initBtn_Exit() {
        btn_Exit = new JButton();
        btn_Exit.setBounds(10 + 19 * SIZE_BTN, 10, SIZE_BTN, SIZE_BTN);
        btn_Exit.setIcon(getIcon("search1.png"));
        btn_Exit.setRolloverIcon(getIcon("search2.png"));
        btn_Exit.setFocusPainted(false);
        btn_Exit.setBorderPainted(false);
        btn_Exit.setContentAreaFilled(false);
        btn_Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_ExitAction(e);
            }
        });
        return btn_Exit;
    }



    public ImageIcon getIcon(String name) {
        try {
            Image icon = ImageIO.read(getClass().getResource("/ImageMenu/" + name));
            return new ImageIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
