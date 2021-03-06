/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.syspedidos.interfaces;

import java.util.List;
import java.util.Map;
import pe.edu.upeu.syspedidos.dto.Usuario;

/**
 *
 * @author alum.fial1
 */
public interface UsuarioDAO {
    int create(Usuario c);
    int update(Usuario c);
    int delete(int key);
    Usuario read(int key);
    List<Map<String, Object>> readAll();
    List<Map<String, Object>> validarUsuario(String user, String clave);
}
