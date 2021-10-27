package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MapFrameTest {

    @BeforeEach
    void setUp() {
    }

    /**
     * Test a null point.
     * @throws IOException
     */
    @Test
    void getNullMousePoint() throws IOException, SQLException {
        MapFrame m = new MapFrame();
        Point mousePos = null;
        Point p = m.getMousePoint(null);
        Assert.assertEquals(null, p);

    }

    /**
     * Test a valid Mouse point.
     * @throws IOException
     */
    @Test
    void getValidMousePoint() throws IOException, SQLException {
        MapFrame m = new MapFrame();
        Point mousePos = new Point(1,1);
        Point p = m.getMousePoint(mousePos);
        Assert.assertEquals(mousePos, p);
    }
}