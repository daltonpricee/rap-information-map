package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MapFrame {
    private JPanel mainFrame;
    private JFrame frame;
    private JPanel picPanel;
    private JLabel picLabel;
    private JPanel welcomePanel;
    private JLabel welcomeLabel;
    private JLabel imgLabel;
    private JLabel h2Label;
    private JPanel h2Panel;
    private JLabel mapPanel;
    private Statement myStmt;
    private ResultSet myRs;
    private Connection myConn;
    private CustomPopUp c = new CustomPopUp();
    private JDialog dialog;
    public JOptionPane optionPane;
    private Points p;

    private int mouseX;
    private int mouseY;

    /**
     * Constructor for MapFrame
     *
     * @throws IOException
     */
    public MapFrame() throws IOException, SQLException {

        myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rap_map",
                "student", "student");
        frame = new JFrame("The Rap Map!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(860, 735);
        frame.setResizable(false);

        //image for logo
        ImageIcon imageIcon = new ImageIcon(
                new ImageIcon("C:\\Users\\Dalton Price\\Desktop\\song links\\logo2.png").getImage().getScaledInstance(
                        250, 80, Image.SCALE_DEFAULT));
        imgLabel.setIcon(imageIcon);

        //the link of the map photo
        String i = "C:\\Users\\Dalton Price\\Desktop\\song links\\pic5.png";

        //creating map image and assigning it to label
        ImageIcon imgThisImg = new ImageIcon(i);
        picLabel.setIcon(imgThisImg);
        frame.add(mainFrame);
        frame.setVisible(true);

        /**
         * MouseListener for picLabel, when map icon is clicked, display information.
         */
        picLabel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                int mouseX = picLabel.getMousePosition().x;
                int mouseY = picLabel.getMousePosition().y;
                try {
                    c.showStateInfo(mouseX, mouseY);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }


            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });
    }

    /**
     * Gets the point obj from the user click.
     *
     * @return Point obj.
     */
    public Point getMousePoint(Point point) {
        if (point != null) {
            return point;

        }
        return null;
    }



}






