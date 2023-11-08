package Examen.FullStack.examen.model;
import jakarta.validation.constraints.NotNull;

public class ArtistDTO {

@NotNull
Integer id;
String Nom;
public Integer getId() {
	return id;
	    }
public void setId(Integer id) {
	this.id = id;
	}
public String getNom() {
	return Nom;
	}
public void setNombre(String nom) {
	Nom = nom;
	}
public ArtistDTO(Integer id, String nom) {
	super();
	this.id = id;
	Nom = nom;
	}
public ArtistDTO() {
	super();
	}
}
