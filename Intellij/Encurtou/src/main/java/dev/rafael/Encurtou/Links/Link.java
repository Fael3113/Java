package dev.rafael.Encurtou.Links;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Links_encurtados")
public class Link {

	//Funcionando de forma local (sites encurtados não funcionam)

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)

	private Long id;
	private String urlOriginal;
	private String urlEncurtada;
	private LocalDateTime urlCridaEm;

	public Link(LocalDateTime urlCridaEm, String urlEncurtada, String urlOriginal, Long id) {
		this.urlCridaEm = urlCridaEm;
		this.urlEncurtada = urlEncurtada;
		this.urlOriginal = urlOriginal;
		this.id = id;
	}

	public Link() {

	}

	public String getUrlEncurtada() {
		return urlEncurtada;
	}

	public void setUrlEncurtada(String urlEncurtada) {
		this.urlEncurtada = urlEncurtada;
	}

	public LocalDateTime getUrlCridaEm() {
		return urlCridaEm;
	}

	public void setUrlCridaEm(LocalDateTime urlCridaEm) {
		this.urlCridaEm = urlCridaEm;
	}

	public String getUrlOriginal() {
		return urlOriginal;
	}

	public void setUrlOriginal(String urlOriginal) {
		this.urlOriginal = urlOriginal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
