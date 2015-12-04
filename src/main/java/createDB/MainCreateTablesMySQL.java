package createDB;

import java.sql.*;

/**
 * Created by sheverdinK on 23.11.2015.
 */
class MainCreateTablesMySQL implements ConstantI {


    public static void main (String[] args) throws SQLException {

        // load the driver class to memory
        try {
           Driver driver = (Driver) Class.forName(DB_DriverMYSQL).newInstance();
            DriverManager.registerDriver(driver);
        } catch (ClassNotFoundException e) {
            System.out.println ("ClassNotFound");
        } catch (InstantiationException e) {
            System.out.println ("Instantiation");
        } catch (IllegalAccessException e) {
            System.out.println ("IllegalAccess");
        }

        // open a connection to the DB
        Connection connection = DriverManager.getConnection(DB_URL, USER_NAME_mySQL, PASSWORD_mySQL);

        Statement statement = connection.createStatement();

//        creating -- COUPON -- table
        statement.executeUpdate (
                "CREATE TABLE `coupondbtest`.`coupon` (         "+
                    "`id` INT UNSIGNED NOT NULL COMMENT '',     "+
                    "`start_date` DATETIME NOT NULL COMMENT '', "+
                    "`end_date` DATETIME NOT NULL COMMENT '',   "+
                    "`amount` INT NOT NULL COMMENT '',          "+
                    "`type` VARCHAR(45) NOT NULL COMMENT '',    "+
                    "`message` VARCHAR(255) NOT NULL COMMENT '',"+
                    "`price` DOUBLE NOT NULL COMMENT '',        "+
                    "`image` VARCHAR(255) NOT NULL COMMENT '',  "+
                        "PRIMARY KEY (`id`)  COMMENT '',    "+
                        "UNIQUE INDEX `id_UNIQUE` (`id` ASC)  COMMENT '')");

//        creating -- COMPANY -- table
        statement.executeUpdate (
                "CREATE TABLE `coupondbtest`.`company` (         "+
                     "`id` INT UNSIGNED NOT NULL COMMENT '',     "+
                     "`name` VARCHAR(45) NOT NULL COMMENT '',    "+
                     "`password` VARCHAR(10) NOT NULL COMMENT '',"+
                     "`email` VARCHAR(255) NOT NULL COMMENT '',  "+
                        "PRIMARY KEY (`id`)  COMMENT '',         "+
                        "UNIQUE INDEX `id_UNIQUE` (`id` ASC)  COMMENT '')");

//        creating -- CUSTOMER -- table
        statement.executeUpdate (
                "CREATE TABLE `coupondbtest`.`customer` (       "+
                    "`id` INT UNSIGNED NOT NULL COMMENT '',     "+
                    "`name` VARCHAR(45) NOT NULL COMMENT '',    "+
                    "`password` VARCHAR(10) NOT NULL COMMENT '',"+
                    "`email` VARCHAR(255) NOT NULL COMMENT '',  "+
                        "PRIMARY KEY (`id`)  COMMENT '',        "+
                        "UNIQUE INDEX `id_UNIQUE` (`id` ASC)  COMMENT '')");


        // close the connection
        connection.close();
    }
}

