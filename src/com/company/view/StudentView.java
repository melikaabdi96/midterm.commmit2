package com.company.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class StudentView {
    private JFrame studentJframe;
    private JMenuBar studentjMenuBar;

    private JMenu myProfile;

    private JMenu setting;
    private JMenuItem changeUserPass;

    private JMenu weeklySchedule;

    private JMenu classes;
    private JMenuItem myClasses;
    private JMenuItem addClass;
    private JMenuItem deleteClass;

    private JMenu food;
    private JMenuItem foodreservation;
    private JMenuItem balance;

    private JMenu classNotes;

    private JMenu exit;


    private  JPanel studentPanel;
    private JTabbedPane professorTabbedPane;
    private JList<File> studentList;
    private JList<File> classList;
    private JList<File> noteList;

    public StudentView(){
        this.studentJframe = new JFrame();
        studentJframe.setTitle("Student");
        studentJframe.setSize(1000, 1000);
        studentJframe.setLocation(10, 10);
        studentJframe.setLayout(null);
        studentJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.studentjMenuBar = new JMenuBar();
        studentjMenuBar.setPreferredSize(new Dimension(1000, 50));
        studentJframe.setJMenuBar(studentjMenuBar);
        studentjMenuBar.setOpaque(true);
        studentjMenuBar.setBackground(Color.PINK);

        this.myProfile = new JMenu("my profile");
        studentjMenuBar.add(myProfile);

        this.setting = new JMenu("setting");
        studentjMenuBar.add(setting);
        this.changeUserPass = new JMenuItem("change username and password");
        changeUserPass.setBackground(Color.PINK);
        setting.add(changeUserPass);

        this.food = new JMenu("food");
        studentjMenuBar.add(food);
        this.foodreservation = new JMenuItem("food reservation");
        this.balance = new JMenuItem("balance");
        foodreservation.setBackground(Color.pink);
        balance.setBackground(Color.pink);
        food.add(foodreservation);
        food.add(balance);


        this.weeklySchedule = new JMenu("weekly schedule");
        studentjMenuBar.add(weeklySchedule);

        this.classes = new JMenu("classes");
        studentjMenuBar.add(classes);
        this.addClass = new JMenuItem("add class");
        this.myClasses = new JMenuItem("my classes");
        this.deleteClass = new JMenuItem("delete class");
        addClass.setBackground(Color.pink);
        myClasses.setBackground(Color.pink);
        deleteClass.setBackground(Color.pink);
        classes.add(addClass);
        classes.add(deleteClass);
        classes.add(myClasses);

        this.classNotes = new JMenu("class notes");
        studentjMenuBar.add(classNotes);


        this.exit = new JMenu("Exit");
        studentjMenuBar.add(exit);


        this.studentPanel = new JPanel();
        studentPanel.setLayout(new BorderLayout());
        studentPanel.setBounds(0, 0, 1000, 900);
        //adminPanel.setBackground(Color.GRAY);
        studentJframe.add(studentPanel);

        //studentJframe.pack();
        studentJframe.setVisible(true);
    }

}

