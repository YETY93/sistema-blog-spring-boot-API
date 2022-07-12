package co.com.sistema.blog.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.sistema.blog.entidades.Publicacion;

public interface publicacionRepositorioIn extends JpaRepository<Publicacion, Long> {

}
