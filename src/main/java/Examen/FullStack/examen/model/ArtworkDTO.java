package Examen.FullStack.examen.model;

import Examen.FullStack.examen.validators.DescripcionArtworkValidator;

public class ArtworkDTO {

Integer id;
String titulo;
@DescripcionArtworkValidator
String descripcion;
Integer artistid;
public Integer getId() {
	return id;
    }
public void setId(Integer id) {
    this.id = id;
    }
public String getTit() {
    return titulo;
    }
public void setTitle(String titulo) {
    this.titulo = titulo;
    }
public String getDescripcion() {
    return descripcion;
    }
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
    }
public Integer getArtistid() {
    return artistid;
    }
public void setArtistid(Integer artistid) {
    this.artistid = artistid;
    }
public ArtworkDTO(Integer id, String titulo, String descripcion, Integer artistid) {
	super();
    this.id = id;
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.artistid = artistid;
    }
public ArtworkDTO() {
	super();
    }
}

