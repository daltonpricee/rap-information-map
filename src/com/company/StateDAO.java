package com.company;
import java.sql.*;
import java.util.*;

//MusicDAO class.
public class StateDAO {
    private Connection myConn;
    private Statement statement;

    //MusicDAO constructor
    public StateDAO() throws Exception {
        //Establish DB connection
        myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicdb", "student", "student");
    }



/**
        public State getState(int xLeft, int xRight, int yLow, int yHigh) throws SQLException {
        String query = "SELECT * FROM state_info"
                + "WHERE mouseX >= xLeft"
                + "WHERE mouseX <= xRight"
                + "WHERE mouseY >= yLow"
                + "WHERE mouseY >= yHigh";


        ResultSet rs = null;
        State tempState = null;

            rs = statement.executeQuery(query);
            if (rs.next()) {
                tempState = new State();
                tempState.setStateName(rs.getString("state_name"));
                tempState.setArtist1(rs.getString("top_artist1"));
                tempState.setArtist2(rs.getString("top_artist2"));
                tempState.setArtist3(rs.getString("top_artist3"));
                tempState.setInfo1((rs.getString("info_statement1")));
                tempState.setInfo2((rs.getString("info_statement2")));
            }

        return tempState;
    }
 */


    /**
     *Close the connection
     */
    private static void close(Connection myConn, Statement myStmt, ResultSet myRs)
            throws SQLException {

        if (myRs != null) {
            myRs.close();
        }
        if (myStmt != null) {

        }
        if (myConn != null) {
            myConn.close();
        }
    }

    private void close(Statement myStmt, ResultSet myRs) throws SQLException {
        close(null, myStmt, myRs);
    }

}
