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
public class TestCRUD {

    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        // INSERTAR
        Usuario nuevo = new Usuario(0, "Edixon", "edixon@example.com");
        dao.insertarUsuario(nuevo);

        // CONSULTAR
        List<Usuario> usuarios = dao.consultarUsuarios();
        for (Usuario u : usuarios) {
            System.out.println(u.getId() + " | " + u.getNombre() + " | " + u.getCorreo());
        }

        // ACTUALIZAR (por ejemplo id=1)
        Usuario actualizar = new Usuario(1, "Edixon Tunjo", "tunjo@example.com");
        dao.actualizarUsuario(actualizar);

        // ELIMINAR (por ejemplo id=1)
        dao.eliminarUsuario(1);
    }
}


