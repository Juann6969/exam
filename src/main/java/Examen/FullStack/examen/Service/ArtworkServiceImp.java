package Examen.FullStack.examen.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Examen.FullStack.examen.model.ArtistDTO;
import Examen.FullStack.examen.model.ArtworkDTO;
import Examen.FullStack.examen.exception.ArtworkException;

@Service
public class ArtworkServiceImp implements ArtworkService{
	ArrayList<ArtworkDTO> obras = new ArrayList<ArtworkDTO>();
    ArtworkDTO artista1 = new ArtworkDTO(1, "tit1", "descripcion del tit1 y artista1", 1);
    ArtworkDTO artista2 = new ArtworkDTO(2, "tit2", "descripción del tit2 y artista2", 2);
    ArtworkDTO artista3 = new ArtworkDTO(3, "tit3", "descripción del tit3 y artista3", 1);
    ArtworkDTO artista4 = new ArtworkDTO(4, "tit4", "descripcion del tit4 y artista4", 3);
    public ArtworkServiceImp(){
        obras.add(artista1);
        obras.add(artista2);
        obras.add(artista3);
        obras.add(artista4);
    }
    @Autowired
    ArtistService AS;
    @Override
    public ArrayList<ArtworkDTO> VerObras() {
        // TODO Auto-generated method stub
        return obras;
    }

    @Override
    public void CrearObra(ArtworkDTO artw) {
        ArtistDTO artist;
            artist = AS.getArtistabyid(artw.getArtistid());
        if(artw.getArtistid() == artist.getId()) {
            obras.add(artw);
        }
        else {
            throw new ArtworkException("El artista que ha pintado el cuadro no cumple los requisitos");


    }

}
}
