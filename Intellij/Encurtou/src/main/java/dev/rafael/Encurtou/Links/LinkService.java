package dev.rafael.Encurtou.Links;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LinkService {

	private LinkRepository linkRepository;

	public LinkService(LinkRepository linkRepository) {
		this.linkRepository = linkRepository;
	}

	//Gera url aleatória:
	public String gerarUrlAleatoria(){
		return RandomStringUtils.randomAlphanumeric(5,10);
	}

	public Link encurtarUrl(String urlOriginal){
		Link link = new Link();
		link.setUrlOriginal(urlOriginal);
		link.setUrlEncurtada(gerarUrlAleatoria());
		link.setUrlCridaEm(LocalDateTime.now());

		return linkRepository.save(link);
	}

	//Descobrir qual é a fonte da url encurtada
	public Link obterUrlOriginal(String urlEncurtada){
		try{
			return linkRepository.findByUrlEncurtada(urlEncurtada);
		}catch (Exception erro){
			throw new RuntimeException("Url não existe no banco de dados", erro);
		}

	}
}
