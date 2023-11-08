package Examen.FullStack.examen.Service;

import java.util.ArrayList;
import Examen.FullStack.examen.model.ArtistDTO;

public class ArtistServiceImp {

public class ArtistaServiceImp implements ArtistService  {
	    ArrayList<ArtistDTO> artist = new ArrayList<>();

	    ArtistDTO artista1=new ArtistDTO(1, "Picasso");
	    ArtistDTO artista2=new ArtistDTO(2, "Velazquez");
	    ArtistDTO artista3=new ArtistDTO(3, "Sergi Llull");
	    ArtistDTO artista4=new ArtistDTO(4, "Higuaín");

	    public ArtistaServiceImp(){
	        artist.add(artista1);
	        artist.add(artista2);
	        artist.add(artista3);
	        artist.add(artista4);
	    }
	    @Override
	    public ArtistDTO getArtistabyid(Integer id) {
	        for (ArtistDTO artist : artist ) {
	            return artist;
	        }
	        return null;
	    }

	}
}
