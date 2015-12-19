package createDB;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.Assert.*;

/**
 * Created by konstantin on 05.12.2015.
 */
public class MainCreateTablesMySQLTest implements ConstantI {
private Statement statement;
private Connection connection;
    @Before
    public void setUp() throws Exception {
        // load the driver class to memory
        try {
            Class.forName(DB_DriverMYSQL);
        } catch (ClassNotFoundException e) {
            System.out.println ("Exception");
        }

        // open a connection to the DB
         this.connection = DriverManager.getConnection(DB_URL, USER_NAME_mySQL, PASSWORD_mySQL);

         this.statement = connection.createStatement();
    }

    @Test
    public void testCreateTables() throws Exception {

        assertTrue(statement.execute("SELECT * FROM coupondbtest.company;"));
        assertTrue(statement.execute("SELECT * FROM coupondbtest.customer;"));
        assertTrue(statement.execute("SELECT * FROM coupondbtest.coupon;"));
//        System.out.println(statement.execute("SELECT * FROM coupondbtest.coupn;"));

    }

    @After
    public void tearDown() throws Exception {
       connection.close();
    }
}