package dev.rafael.Encurtou.Links;

import java.time.LocalDateTime;

public class LinkResponse {

	//Aqui são os itens que serão apresentados no Body do postman

	private Long id;
	private String urlOriginal;
	private String urlEncurtada;
	private LocalDateTime urlCridaEm;

	public LinkResponse(Long id, String urlOriginal, String urlEncurtada, LocalDateTime urlCridaEm) {
		this.id = id;
		this.urlOriginal = urlOriginal;
		this.urlEncurtada = urlEncurtada;
		this.urlCridaEm = urlCridaEm;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrlOriginal() {
		return urlOriginal;
	}

	public void setUrlOriginal(String urlOriginal) {
		this.urlOriginal = urlOriginal;
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
}
