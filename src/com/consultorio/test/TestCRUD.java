/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.consultorio.test;

/**
 *
 * @author tunjo
 */


import com.consultorio.dao.UsuarioDAO;
import com.consultorio.modelo.Usuario;
import java.util.List;
import java.util.Scanner;

public class TestCRUD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO();

        
        System.out.println("=== AGREGAR USUARIO ===");
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese correo: ");
        String correo = sc.nextLine();

        Usuario nuevo = new Usuario(0, nombre, correo);
        dao.insertarUsuario(nuevo);

        
        System.out.println("\n=== LISTA DE USUARIOS ===");
        List<Usuario> usuarios = dao.consultarUsuarios();
        for (Usuario u : usuarios) {
            System.out.println(u.getId() + " | " + u.getNombre() + " | " + u.getCorreo());
        }

       
        System.out.println("\n=== ELIMINAR USUARIO ===");
        System.out.print("Ingrese el ID del usuario a eliminar: ");
        int idEliminar = sc.nextInt();
        dao.eliminarUsuario(idEliminar);

        
        System.out.println("\n=== LISTA DE USUARIOS DESPUÉS DE ELIMINAR ===");
        usuarios = dao.consultarUsuarios();
        for (Usuario u : usuarios) {
            System.out.println(u.getId() + " | " + u.getNombre() + " | " + u.getCorreo());
        }

        sc.close();
    }
}
