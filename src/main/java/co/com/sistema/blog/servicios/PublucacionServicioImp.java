package co.com.sistema.blog.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sistema.blog.dto.PublicacionDTO;
import co.com.sistema.blog.entidades.Publicacion;
import co.com.sistema.blog.repositorio.PublicacionRepositorioItf;

@Service
public class PublucacionServicioImp implements PublicacionServicioItf {
	
	@Autowired
	private PublicacionRepositorioItf publicacionRepositorio;

	@Override
	public PublicacionDTO crearPublicacion(PublicacionDTO publicacionDTO) {
		// converitmos un DTO a Entidad
		Publicacion publicacion = new Publicacion();
		publicacion.setTitulo(publicacionDTO.getTitulo());
		publicacion.setDescripcion(publicacionDTO.getDescripcion());
		publicacion.setContenido(publicacionDTO.getContenido());
		
		Publicacion nuevaPublicacion = publicacionRepositorio.save(publicacion);
		// Convertimos entidad a DTO
		
		PublicacionDTO publicacionRespuesta = new PublicacionDTO();
		publicacionRespuesta.setId(nuevaPublicacion.getId());
		publicacionRespuesta.setTitulo(nuevaPublicacion.getTitulo());
		publicacionRespuesta.setDescripcion(nuevaPublicacion.getDescripcion());
		publicacionRespuesta.setContenido(nuevaPublicacion.getContenido());
		
		return publicacionRespuesta;
	}
	

}
