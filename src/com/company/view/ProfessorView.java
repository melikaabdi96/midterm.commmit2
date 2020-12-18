package com.company.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ProfessorView {
    private JFrame professorJframe;
    private JMenuBar professorjMenuBar;

    private JMenu myProfile;

    private JMenu setting;
    private JMenuItem changeUserPass;

    private JMenu students;
    private JMenuItem scoring;
    private JMenuItem studentsProfiles;


    private JMenu classes;
    private JMenuItem viewClasses;
    private JMenuItem addClass;
    private JMenuItem deleteClass;

    private JMenu classNotes;
    private JMenuItem viewNotes;
    private JMenuItem addNote;
    private JMenuItem deleteNote;


    private JMenu exit;


    private  JPanel professorPanel;
    private JTabbedPane professorTabbedPane;
    private JList<File> studentList;
    private JList<File> classList;
    private JList<File> noteList;

    public ProfessorView(){
        this.professorJframe = new JFrame();
        professorJframe.setTitle("Professor");
        professorJframe.setSize(1000, 1000);
        professorJframe.setLocation(10, 10);
        professorJframe.setLayout(null);
        professorJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.professorjMenuBar = new JMenuBar();
        professorjMenuBar.setPreferredSize(new Dimension(1000, 50));
        professorJframe.setJMenuBar(professorjMenuBar);
        professorjMenuBar.setOpaque(true);
        professorjMenuBar.setBackground(Color.CYAN);

        this.myProfile = new JMenu("my profile");
        professorjMenuBar.add(myProfile);

        this.setting = new JMenu("setting");
        professorjMenuBar.add(setting);
        this.changeUserPass = new JMenuItem("change username and password");
        changeUserPass.setBackground(Color.CYAN);
        setting.add(changeUserPass);


        this.students = new JMenu("students");
        professorjMenuBar.add(students);
        this.scoring = new JMenuItem("scoring");
        this.studentsProfiles = new JMenuItem("my students");
        scoring.setBackground(Color.cyan);
        studentsProfiles.setBackground(Color.cyan);
        students.add(scoring);
        students.add(studentsProfiles);

        this.classes = new JMenu("classes");
        professorjMenuBar.add(classes);
        this.addClass = new JMenuItem("add class");
        this.viewClasses = new JMenuItem("view classes");
        this.deleteClass = new JMenuItem("delete class");
        addClass.setBackground(Color.cyan);
        viewClasses.setBackground(Color.cyan);
        deleteClass.setBackground(Color.CYAN);
        classes.add(addClass);
        classes.add(deleteClass);
        classes.add(viewClasses);

        this.classNotes = new JMenu("class notes");
        professorjMenuBar.add(classNotes);
        this.addNote = new JMenuItem("add note");
        this.viewNotes = new JMenuItem("view notes");
        this.deleteNote = new JMenuItem("delet note");
        addNote.setBackground(Color.CYAN);
        viewNotes.setBackground(Color.CYAN);
        deleteNote.setBackground(Color.CYAN);
        classNotes.add(addNote);
        classNotes.add(deleteNote);
        classNotes.add(viewNotes);

        this.exit = new JMenu("Exit");
        professorjMenuBar.add(exit);


        this.professorPanel = new JPanel();
        professorPanel.setLayout(new BorderLayout());
        professorPanel.setBounds(0, 0, 1000, 900);
        //adminPanel.setBackground(Color.GRAY);
        professorJframe.add(professorPanel);

        professorJframe.pack();
        professorJframe.setVisible(true);
    }

}
