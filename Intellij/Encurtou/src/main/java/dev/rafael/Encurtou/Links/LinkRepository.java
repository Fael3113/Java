package dev.rafael.Encurtou.Links;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
	//Encontrar Urls Encurtadas
	Link findByUrlEncurtada(String urlEncurtada);
}
