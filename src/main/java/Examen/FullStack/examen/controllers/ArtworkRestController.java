package Examen.FullStack.examen.controllers;

import java.net.URI;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import Examen.FullStack.examen.model.ArtworkDTO;
import Examen.FullStack.examen.Service.ArtworkService;

@RestController
@RequestMapping("/Obras")
public class ArtworkRestController {
	@Autowired
	ArtworkService ArtworkService;

	public ArtworkRestController (ArtworkService servicio) {
		this.ArtworkService=servicio;
	    }
	@GetMapping
	public ResponseEntity<ArrayList<?>> VerObras(){
		ArrayList<ArtworkDTO> array = ArtworkService.VerObras();
		return ResponseEntity.ok(array);
	    }
	@PostMapping
	public ResponseEntity<ArtworkDTO> CrearObra(@RequestBody @Validated ArtworkDTO obra){
		ArtworkService.CrearObra(obra);
		URI a = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obra.getId()).toUri(); 
		return ResponseEntity.created(a).build();
	    }
	}
