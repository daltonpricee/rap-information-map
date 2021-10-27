package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Locale;

public class CustomPopUp {
    private JLabel picLabel;
    private JDialog dialog;
    public JOptionPane optionPane;
    private ArrayList pointsList;
    private int mouseY;
    private int mouseX;
    private Connection myConn;
    private Statement myStmt2;
    private ResultSet myRs;
    private JFrame frame2;
    private JPanel mainPanel2;
    private JLabel topLabel;
    private JLabel topArtistsLabel;
    private JPanel artistsPanel;
    private JLabel listLabel;
    private String stateName;
    private String query;

    private JButton returnToMapButton;
    private String stateInfo;
    private String topartist1;
    private String info1;
    private String info2;
    private String topartist2;
    private String topartist3;
    private int art1ML;
    private int art2ML;
    private int art3ML;
    private String picURL;

    private ArrayList<State> stateList = new ArrayList<>();


    private JFrame frame3;
    public JPanel mainPanel;
    private JLabel artistsLabel;
    private JButton readMoreInfoButton;

    public CustomPopUp() throws SQLException {
        myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rap_map",
                "student", "student");
        frame3 = new JFrame();
        frame3.setSize(450, 300);
        frame3.add(mainPanel);


        //Action listeners for buttons
        readMoreInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExpandedStateInfoPage();
            }
        });

        /**
         * Action listener for the return to map button.
         * If selected, just close the pop up and go back to map page.
         */
        returnToMapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public JPanel showStateInfo(int mouseX, int mouseY) throws SQLException {
        //crates the array liust nneeded
        System.out.println(mouseX + ", " + mouseY);
        create();
        for (State s : stateList) {
            if (s.getMaxLeft() >= mouseX && s.getMaxRight() >= mouseX && s.getMaxLow() >= mouseY && s.getMaxHigh() <= mouseY) {
                stateName = s.getStateName();
                topartist1 = s.getArtist1();
                topartist2 = s.getArtist2();
                topartist3 = s.getArtist3();

            }
        }
        //Changes the label text to the correct info
        topLabel.setText(stateName.replace("", " ").trim().toUpperCase(Locale.ROOT) + "    I N F O");
        listLabel.setText("<html> 1: " + topartist1 + "<br> 2: " + topartist2 + "<br> 3: " + topartist3 + "</html>");

        //This displays the popup window the the correct info
        UIManager.put("OptionPane.minimumSize", new Dimension(450, 270));
        optionPane = new JOptionPane(mainPanel,
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                null,
                new Object[]{}, null);

        dialog = optionPane.createDialog("Selected State Overview");
        dialog.setVisible(true);
        return mainPanel;
    }

    public ArrayList<State> create() throws SQLException {

        query = "SELECT * FROM state_info ";
        myStmt2 = myConn.createStatement();

        myRs = myStmt2.executeQuery(query);
        while (myRs.next()) {

            String stateName = myRs.getString("state_name");
            String artist1 = myRs.getString("top_artist1");
            String artist2 = myRs.getString("top_artist2");
            String artist3 = myRs.getString("top_artist3");
            String info1 = myRs.getString("info_statement1");
            String info2 = myRs.getString("info_statement2");
            int maxLeft = myRs.getInt("xMaxLeft");
            int maxRight = myRs.getInt("xMaxRight");
            int maxLow = myRs.getInt("yLow");
            int maxHigh = myRs.getInt("yHigh");
            State tempState = new State(stateName, artist1, artist2, artist3, info1, info2,
                    maxLeft, maxRight, maxLow, maxHigh);
            stateList.add(tempState);
        }
        return stateList;
    }

        /**
         public void setLabels(String stateName, String artist1, String artist2, String artist3) {
         topLabel.setText(stateName + " INFO");
         //then set text label to the info
         listLabel.setText("<html>1: "
         + topartist1
         + "<br/>2: "
         + topartist2
         + "<br/>3: "
         + topartist3
         + "</html>");
         }
         */
    }


