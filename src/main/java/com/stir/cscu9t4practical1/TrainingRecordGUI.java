/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrainingRecordGUI extends JFrame implements ActionListener {

    // all records
    public TrainingRecord records = new TrainingRecord();


    private JTextArea outputConsole = new JTextArea(5, 50);

    // textFields
    private JTextField nameTextField = new JTextField(30);
    private JTextField dayTextField = new JTextField(2);
    private JTextField monthTextField = new JTextField(2);
    private JTextField yearTextField = new JTextField(4);
    private JTextField hoursTextField = new JTextField(2);
    private JTextField minsTextField = new JTextField(2);
    private JTextField secsTextField = new JTextField(2);
    private JTextField distTextField = new JTextField(4);

    //labels
    private JLabel labName = new JLabel(" Name:");
    private JLabel labDay = new JLabel(" Day:");
    private JLabel labMonth = new JLabel(" Month:");
    private JLabel labYear = new JLabel(" Year:");
    private JLabel labhours = new JLabel(" Hours:");
    private JLabel labMins = new JLabel(" Mins:");
    private JLabel labSeconds = new JLabel(" Secs:");
    private JLabel labDist = new JLabel(" Distance (km):");

    //Buttons
    private JButton addEntryButton = new JButton("Add");
    private JButton lookUpByDateButton = new JButton("Look Up");
    private JButton lookUpByNameButton = new JButton("Look Up By name");
    private JButton findAllByDateButton = new JButton("Find All By Date");
    private JButton removeEntryButton = new JButton("Remove");
    private JButton clearAllEntriesButton = new JButton("Clear All !");

    public static void main(String[] args) {
        TrainingRecordGUI gui = new TrainingRecordGUI();
    } // main

    // constructor
    public TrainingRecordGUI() {
        super("Training Records Assignment");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(labName);
        add(nameTextField);
        add(labDay);
        add(dayTextField);
        add(labMonth);
        add(monthTextField);
        add(labYear);
        add(yearTextField);
        add(labhours);
        add(hoursTextField);
        add(labMins);
        add(minsTextField);
        add(labSeconds);
        add(secsTextField);
        add(labDist);
        add(distTextField);
        add(addEntryButton);
        addEntryButton.addActionListener(this);
        add(lookUpByDateButton);
        lookUpByDateButton.addActionListener(this);
        add(findAllByDateButton);
        findAllByDateButton.addActionListener(this);
        add(lookUpByNameButton);
        lookUpByNameButton.addActionListener(this);
        add(removeEntryButton);
        removeEntryButton.addActionListener(this);
        add(clearAllEntriesButton);
        clearAllEntriesButton.addActionListener(this);
        add(outputConsole);
        outputConsole.setText("All fields are required to add an entry");
        outputConsole.setEditable(false);


        // disable the un allowed buttons for the first time
        lookUpByDateButton.setEnabled(false);
        lookUpByNameButton.setEnabled(false);
        findAllByDateButton.setEnabled(false);
        removeEntryButton.setEnabled(false);
        clearAllEntriesButton.setEnabled(false);

        setSize(720, 200);
        setVisible(true);
        blankDisplay();

    } // constructor

    // listen for and respond to GUI events 
    public void actionPerformed(ActionEvent event) {
        String message = "";
        if (event.getSource() == addEntryButton) {
            message = addEntry();

            // enable the un allowed buttons for the first time
            lookUpByDateButton.setEnabled(true);
            lookUpByNameButton.setEnabled(true);
            findAllByDateButton.setEnabled(true);
            removeEntryButton.setEnabled(true);
            clearAllEntriesButton.setEnabled(true);
        } else if (event.getSource() == lookUpByDateButton) {
            message = lookupEntryByDate();
        } else if (event.getSource() == findAllByDateButton) {
            message = findAllByDate();
        } else if (event.getSource() == removeEntryButton) {
            message = removeEntry();
        } else if (event.getSource() == lookUpByNameButton) {
            message = lookupEntryByName();
        } else if (event.getSource() == clearAllEntriesButton) {
            message = clearAllEntries();
        }
        outputConsole.append("\n" + message);
        blankDisplay();
    } // actionPerformed

    private String clearAllEntries() {
        records.clearAllEntries();
        return "All records was deleted .........";
    }

    public String findAllByDate() {
        int d, m, y;
        try {
            d = Integer.parseInt(dayTextField.getText());
            m = Integer.parseInt(monthTextField.getText());
            y = Integer.parseInt(yearTextField.getText());
        } catch (NumberFormatException exception) {
            return "Required fields missing !! (name, date)";
        }
        return records.lookupEntries(d, m, y);
    }//findAllByDate

    public String removeEntry() {
        String nameText;
        int monthText;
        int dayText;
        int yearText;
        try {
            nameText = nameTextField.getText();
            monthText = Integer.parseInt(monthTextField.getText());
            dayText = Integer.parseInt(dayTextField.getText());
            yearText = Integer.parseInt(yearTextField.getText());

        } catch (NumberFormatException exception) {
            return "Required fields missing !! (name, date)";
        }
        return records.deleteEntry(nameText, monthText, dayText, yearText);
    }//removeEntry


    public String addEntry() {

        String nameText;
        int monthText;
        int dayText;
        int yearText;
        float kmText;
        int hourText;
        int minuetText;
        int secondText;

        try {
            nameText = nameTextField.getText();
            monthText = Integer.parseInt(monthTextField.getText());
            dayText = Integer.parseInt(dayTextField.getText());
            yearText = Integer.parseInt(yearTextField.getText());
            kmText = java.lang.Float.parseFloat(distTextField.getText());
            hourText = Integer.parseInt(hoursTextField.getText());
            minuetText = Integer.parseInt(minsTextField.getText());
            secondText = Integer.parseInt(secsTextField.getText());
        } catch (NumberFormatException exception) {
            return "Required fields missing !! (All fields)";
        }

        Entry e = new Entry(nameText, dayText, monthText, yearText, hourText, minuetText, secondText, kmText);
        return records.addEntry(e);
    }//addEntry

    public String lookupEntryByDate() {
        int d, m, y;
        try {
            d = Integer.parseInt(dayTextField.getText());
            m = Integer.parseInt(monthTextField.getText());
            y = Integer.parseInt(yearTextField.getText());
            outputConsole.setText("looking up record ...");
        } catch (NumberFormatException exception) {
            return "Required fields missing !! (All fields)";
        }
        return records.searchByDate(d, m, y);
    }//lookupEntryByDate

    public String lookupEntryByName() {
        String name = null;
        try {
            if (!this.nameTextField.getText().equals(""))
                name = this.nameTextField.getText();
        } catch (Exception exception) {
            return "Required fields missing !! (All fields)";
        }
        outputConsole.setText("looking up record ...");
        return records.searchEntryByName(name);
    }//lookupEntryByName


    public void blankDisplay() {
        nameTextField.setText("");
        dayTextField.setText("");
        monthTextField.setText("");
        yearTextField.setText("");
        hoursTextField.setText("");
        minsTextField.setText("");
        secsTextField.setText("");
        distTextField.setText("");

    }// blankDisplay


    // Fills the input fields on the display for testing purposes only
    public void fillDisplay(Entry entry) {
        nameTextField.setText(entry.getName());
        dayTextField.setText(String.valueOf(entry.getDay()));
        monthTextField.setText(String.valueOf(entry.getMonth()));
        yearTextField.setText(String.valueOf(entry.getYear()));
        hoursTextField.setText(String.valueOf(entry.getHour()));
        minsTextField.setText(String.valueOf(entry.getMin()));
        secsTextField.setText(String.valueOf(entry.getSec()));
        distTextField.setText(String.valueOf(entry.getDistance()));
    }//fillDisplay

} // TrainingRecordGUI

