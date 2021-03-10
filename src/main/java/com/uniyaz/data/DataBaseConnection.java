package com.uniyaz.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    static final String driverName = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/universal?useUnicode=true&characterEncoding=UTF-8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Turkey";
    static final String userName = "root";
    static final String password = "58851232";
    static Connection connection = null;

    public static Connection getConnection() throws SQLException , ClassNotFoundException{
        Class.forName(driverName);
        connection = DriverManager.getConnection(url , userName , password);
        return  connection;
    }
}
