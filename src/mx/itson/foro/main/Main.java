/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.foro.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.foro.entidades.Categoria;
import mx.itson.foro.entidades.Comentario;
import mx.itson.foro.entidades.Post;
import mx.itson.foro.entidades.Usuario;
import mx.itson.foro.enums.Rol;

/**
 *
 * @author luism
 */
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        
        usuario.setNombre("LuisBlasco");
        usuario.setCorreoElectronico("luisblasco@gmail.com");
        usuario.setContrasena("contrasena12345");
        usuario.setRol(Rol.USUARIO);
        
        Usuario usuario2 = new Usuario();
        usuario2.setNombre("PedroSanchez");
        usuario2.setCorreoElectronico("PedroSanchez@gmail.com");
        usuario2.setContrasena("contrasena12345");
        usuario2.setRol(Rol.USUARIO);
        
        Categoria categoria = new Categoria();
        categoria.setNombre("Viajes");
        
        Comentario respuesta1 = new Comentario();
        respuesta1.setDescripcion("Te recomiendo que te hospedes en el hotel Marinaterra");
        respuesta1.setFecha(new Date());
        respuesta1.setUser(usuario2);
        respuesta1.setLike(1);
        respuesta1.setDislike(0);
        
        List<Comentario> com = new ArrayList<>();
        com.add(respuesta1);
        
        Post publicacion = new Post();
        publicacion.setTitulo("Cual es mejor hotel en San Carlos?");
        publicacion.setFecha(new Date());
        publicacion.setUser(usuario);
        publicacion.setCategoria(categoria);
        publicacion.setDescripcion("Quiero ir de vacaciones a San Carlos, Sonora pero no se cual es el mejor hotel. Recomendaciones?");
        publicacion.setLike(5);
        publicacion.setDislike(1);
        publicacion.setCometarios(com);
        
        
        System.out.println("TITULO: "+publicacion.getTitulo());
        System.out.println("FECHA DE PUBLICACION: "+publicacion.getFecha());
        System.out.println("USUARIO: "+publicacion.getUser().getNombre());
        System.out.println("ROL: "+publicacion.getUser().getRol());
        System.out.println("CATEGORIA: "+publicacion.getCategoria().getNombre());
        System.out.println("DESCRIPCION: "+publicacion.getDescripcion());
        System.out.println("LIKES: "+publicacion.getLike());
        System.out.println("DISLIKES: "+publicacion.getDislike());
        
        System.out.println("-------------------------");
        System.out.println("COMENTARIOS:");
        System.out.println("-------------------------");
        
        for (Comentario comentario : com) {
            System.out.println("Descripcion: " + comentario.getDescripcion());
            System.out.println("Fecha: " + comentario.getFecha());
            System.out.println("Usuario: " + comentario.getUser().getNombre());
            System.out.println("Likes: " + comentario.getLike());
            System.out.println("Dislikes: " + comentario.getDislike());
        }
    }
}
