package com.sebastian.mascotas;

/**
 * Created by Sebastian on 2016-11-13.
 */
public class Cmascota {
        private String Nombre;
        private int Foto;
        private String Likes;

    public Cmascota(String nombre, int foto, String likes) {
        Nombre = nombre;
        Foto = foto;
        Likes = likes;
    }

    public String getLikes() {
        return Likes;
    }

    public void setLikes(String likes) {
        Likes = likes;
    }

    public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public int getFoto() {
            return Foto;
        }

        public void setFoto(int foto) {
            Foto = foto;
        }

}
