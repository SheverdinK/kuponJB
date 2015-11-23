package createDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by sheverdinK on 23.11.2015.
 */
class MainCreateTablesMySQL implements ConstantI {


    public static void main (String[] args) throws SQLException {

        // load the driver class to memory
        try {
            Class.forName(DB_DriverMYSQL);
        } catch (ClassNotFoundException e) {
            System.out.println ("Exception");
        }

        // open a connection to the DB
        Connection connection = DriverManager.getConnection(DB_URL, USER_NAME_mySQL, PASSWORD_mySQL);

        Statement statement = connection.createStatement();

        statement.executeUpdate (
                "CREATE TABLE `kuponprojectdb`.`COUPON`( "+
                        "`ID` DOUBLE UNSIGNED NULL COMMENT'',  "+
                        "`TITLE_NAME` VARCHAR(30) NULL COMMENT'', "+
                        "`MESSAGE` VARCHAR(250) NULL COMMENT'', "+
                        "`TYPE` VARCHAR(20) NULL COMMENT'', "+
                        "`PASSWORD` VARCHAR(30) NULL COMMENT'', "+
                        "`EMAIL` VARCHAR(100) NULL COMMENT'', "+
                        "`IMG_URL` VARCHAR(250) NULL COMMENT'', "+
                        "`PRICE` DOUBLE NULL COMMENT '', "+
                        "`AMOUNT` INTEGER NULL COMMENT'', "+
                        "`START_DATE` DATE NULL COMMENT'', "+
                        "`END_DATE`   DATE NULL COMMENT '', "+
                        "PRIMARY KEY (`ID`)  COMMENT'', "+
                        "UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) COMMENT'') "+
                        "ENGINE = InnoDB "+
                        "DEFAULT CHARACTER SET = utf8 "+
                        "COLLATE = utf8_general_ci;");

        statement.executeUpdate (
                "CREATE TABLE `kuponprojectdb`.`CUSTOMER`( "+
                        "`ID` DOUBLE UNSIGNED NULL COMMENT '', "+
                        "`CUST_NAME` VARCHAR(30) NULL COMMENT '', "+
                        "`PASSWORD` VARCHAR(30) NULL COMMENT '', "+
                        "PRIMARY KEY (`ID`)  COMMENT '', "+
                        "UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) COMMENT '') "+
                        "ENGINE = InnoDB "+
                        "DEFAULT CHARACTER SET = utf8 "+
                        "COLLATE = utf8_general_ci;");

        statement.executeUpdate (
                "CREATE TABLE `kuponprojectdb`.`COMPANY` ( "+
                        "`ID` DOUBLE UNSIGNED NULL COMMENT '', "+
                        "`COMP_NAME` VARCHAR(30) NULL COMMENT '', "+
                        "`PASSWORD` VARCHAR(30) NULL COMMENT '', "+
                        "`EMAIL` VARCHAR(100) NULL COMMENT '', "+
                        "PRIMARY KEY (`ID`)  COMMENT '', "+
                        "UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) COMMENT '') "+
                        "ENGINE = InnoDB "+
                        "DEFAULT CHARACTER SET = utf8 "+
                        "COLLATE = utf8_general_ci;");

        // close the connection
        connection.close();
    }
}

