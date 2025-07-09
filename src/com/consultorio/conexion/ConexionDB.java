/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.consultorio.conexion;

/**
 *
 * @author tunjo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    public static Connection getConnection() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/proyecto",
                "root",
                ""
            );
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conexion;
    }
}
