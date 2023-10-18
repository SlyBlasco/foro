/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.foro.entidades;


import java.util.Date;
import java.util.List;

/**
 *
 * @author luism
 */
public class Post {
    
    private String titulo;
    private Date fecha = new Date();
    private String descripcion;
    private int like;
    private int dislike;
    private Usuario user = new Usuario();
    private Categoria categoria = new Categoria();
    private List<Comentario> cometarios;
    
    
    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public List<Comentario> getCometarios() {
        return cometarios;
    }

    public void setCometarios(List<Comentario> cometarios) {
        this.cometarios = cometarios;
    }
    
    
}
