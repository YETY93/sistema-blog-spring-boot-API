package co.com.sistema.blog.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.sistema.blog.dto.PublicacionDTO;
import co.com.sistema.blog.servicios.PublicacionServicioItf;

@RestController
@RequestMapping("/api/rest/publicaciones")
public class PublicacionControlador {
	
	@Autowired
	private PublicacionServicioItf publicacionServicio;
	
	@PostMapping("/crear")
	public ResponseEntity<PublicacionDTO> guardarPublicacion(@RequestBody PublicacionDTO publicacionDTO){
		
		return new ResponseEntity<>(publicacionServicio.crearPublicacion(publicacionDTO), HttpStatus.CREATED);
		
	}
}
