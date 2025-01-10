package dev.rafael.Encurtou.Links;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
public class LinkController {

	private final LinkService linkService;

	public LinkController(LinkService linkService){
		this.linkService = linkService;
	}

	@PostMapping("/encurtou")
	public ResponseEntity<LinkResponse> gerarUrlEncurtada(@RequestBody Map<String, String> request) {
		String urlOriginal = request.get("urlOriginal");
		Link link = linkService.encurtarUrl(urlOriginal);

		String gerarUrldeRedirecionamentoDoUsuario = "http://localhost:8080/" + link.getUrlEncurtada();

		LinkResponse response = new LinkResponse(
				link.getId(),
				link.getUrlOriginal(),
				gerarUrldeRedirecionamentoDoUsuario,
				link.getUrlCridaEm()
		);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/{urlEncurtada}")
	public void redirecionarLink(@PathVariable String urlEncurtada, HttpServletResponse response) throws IOException {
		try {
			Link link = linkService.obterUrlOriginal(urlEncurtada);

			if (link != null && link.getUrlOriginal() != null) {
				response.sendRedirect(link.getUrlOriginal());
			} else {
				response.sendError(HttpServletResponse.SC_NOT_FOUND, "URL encurtada não encontrada.");
			}
		} catch (Exception e) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Erro ao processar a solicitação.");
			// Log para ajudar no diagnóstico
			e.printStackTrace();
		}
	}
}



