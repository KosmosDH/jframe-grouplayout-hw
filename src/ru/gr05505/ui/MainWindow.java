package ru.gr05505.ui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private final JCheckBox check1;
    private final JCheckBox check2;
    private final JCheckBox check3;
    private final JCheckBox check4;
    private final JCheckBox check5;
    private final JCheckBox check6;
    private final ButtonGroup radios1;
    private final JRadioButton rButton1;
    private final JRadioButton rButton2;
    private final JRadioButton rButton3;
    private final ButtonGroup radios2;
    private final JRadioButton rButton4;
    private final JRadioButton rButton5;
    private final JRadioButton rButton6;
    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JButton buttonExit;
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JTextField textField4;
    private final JPanel northPanel;
    private final JPanel centerPanel;
    private final JPanel southPanel;


    public MainWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("окно");
        setMinimumSize(new Dimension(400, 300));

        northPanel = new JPanel();
        centerPanel = new JPanel();
        southPanel = new JPanel();

        northPanel.setBackground(Color.WHITE);
        centerPanel.setBackground(Color.WHITE);
        southPanel.setBackground(Color.WHITE);

        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        check1 = new JCheckBox();
        check2 = new JCheckBox();
        check3 = new JCheckBox();
        check4 = new JCheckBox();
        check5 = new JCheckBox();
        check6 = new JCheckBox();
        check1.setText("Опция 1");
        check2.setText("Опция 2");
        check3.setText("Опция 3");
        check4.setText("Опция 4");
        check5.setText("Опция 5");
        check6.setText("Опция 6");

        radios1 = new ButtonGroup();
        radios2 = new ButtonGroup();

        rButton1 = new JRadioButton();
        rButton2 = new JRadioButton();
        rButton3 = new JRadioButton();
        radios1.add(rButton1);
        radios1.add(rButton2);
        radios1.add(rButton3);
        rButton1.setText("Вариант 1");
        rButton1.setSelected(true);
        rButton2.setText("Вариант 2");
        rButton3.setText("Вариант 3");

        rButton4 = new JRadioButton();
        rButton5 = new JRadioButton();
        rButton6 = new JRadioButton();
        radios2.add(rButton4);
        radios2.add(rButton5);
        radios2.add(rButton6);
        rButton4.setText("Вариант 1");
        rButton4.setSelected(true);
        rButton5.setText("Вариант 2");
        rButton6.setText("Вариант 3");

        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        buttonExit = new JButton();
        button1.setText("Кнопка 1");
        button2.setText("Кнопка 2");
        button3.setText("Кнопка 3");
        buttonExit.setText("Выход");
        buttonExit.addActionListener(e -> {
            dispose();
        });

        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();

        GroupLayout northLayout = new GroupLayout(northPanel);
        northPanel.setLayout(northLayout);

        northLayout.setVerticalGroup(northLayout.createParallelGroup()
                .addComponent(button1, PS, PS, PS)
                .addComponent(button2, PS, PS, PS)
                .addComponent(button3, PS, PS, PS)
        );
        northLayout.setHorizontalGroup(northLayout.createSequentialGroup()
                .addComponent(button1, PS, PS, PS)
                .addGap(8)
                .addComponent(button2, PS, PS, Short.MAX_VALUE)
                .addGap(8)
                .addComponent(button3, PS, PS, PS)
        );

        GroupLayout centerLayout = new GroupLayout(centerPanel);
        centerPanel.setLayout(centerLayout);

        centerLayout.setVerticalGroup(centerLayout.createParallelGroup()
                .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(check1, PS, PS, PS)
                        .addComponent(check2, PS, PS, PS)
                        .addComponent(check3, PS, PS, PS)
                )
                .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(check4, PS, PS, PS)
                        .addComponent(check5, PS, PS, PS)
                        .addComponent(check6, PS, PS, PS)
                )
                .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(rButton1, PS, PS, PS)
                        .addComponent(rButton2, PS, PS, PS)
                        .addComponent(rButton3, PS, PS, PS)
                )

        );
        centerLayout.setHorizontalGroup(centerLayout.createSequentialGroup()
                .addGroup(centerLayout.createParallelGroup()
                        .addComponent(check1, PS, PS, PS)
                        .addComponent(check2, PS, PS, PS)
                        .addComponent(check3, PS, PS, PS)
                )
                        .addGap(30, 30, Short.MAX_VALUE)
                .addGroup(centerLayout.createParallelGroup()
                        .addComponent(check4, PS, PS, PS)
                        .addComponent(check5, PS, PS, PS)
                        .addComponent(check6, PS, PS, PS)
                )
                        .addGap(50, 50, Short.MAX_VALUE)
                .addGroup(centerLayout.createParallelGroup()
                        .addComponent(rButton1, PS, PS, PS)
                        .addComponent(rButton2, PS, PS, PS)
                        .addComponent(rButton3, PS, PS, PS)
                )

        );

        GroupLayout southLayout = new GroupLayout(southPanel);
        southPanel.setLayout(southLayout);

        southLayout.setVerticalGroup(southLayout.createParallelGroup()
                .addGroup(southLayout.createSequentialGroup()
                        .addComponent(rButton4, PS, PS, PS)
                        .addComponent(rButton5, PS, PS, PS)
                        .addComponent(rButton6, PS, PS, PS)
                )
                .addGroup(southLayout.createSequentialGroup()
                        .addComponent(textField1, PS, PS, PS)
                        .addComponent(textField2, PS, PS, PS)
                        .addComponent(textField3, PS, PS, PS)
                        .addComponent(textField4, PS, PS, PS)
                        .addGap(15)
                        .addComponent(buttonExit, PS, PS, PS)
                        .addGap(8)
                )
        );
        southLayout.setHorizontalGroup(southLayout.createSequentialGroup()
                .addGroup(southLayout.createParallelGroup()
                        .addComponent(rButton4, PS, PS, PS)
                        .addComponent(rButton5, PS, PS, PS)
                        .addComponent(rButton6, PS, PS, PS)
                )
                        .addGap(30)
                .addGroup(southLayout.createParallelGroup()
                        .addComponent(textField1, PS, PS, Short.MAX_VALUE)
                        .addComponent(textField2, PS, PS, Short.MAX_VALUE)
                        .addComponent(textField3, PS, PS, Short.MAX_VALUE)
                        .addComponent(textField4, PS, PS, Short.MAX_VALUE)

                        .addComponent(buttonExit, PS, PS, PS)
                )

        );
        pack();
        setLocationRelativeTo(null);
    }
    private static final int PS = GroupLayout.PREFERRED_SIZE;
    private static final int DS = GroupLayout.DEFAULT_SIZE;
}
