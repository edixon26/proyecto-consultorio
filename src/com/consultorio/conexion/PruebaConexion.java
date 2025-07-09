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

public class PruebaConexion {
    public static void main(String[] args) {
        Connection con = ConexionDB.getConnection();
        
        if (con != null) {
            System.out.println("Conexión realizada correctamente.");
        } else {
            System.out.println("Error al conectar.");
        }
    }
}

