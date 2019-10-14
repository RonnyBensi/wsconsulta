package rbensi.com.br.api;
 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@CrossOrigin
@RestController
@RequestMapping(value = "/")
@Api(value = "/", description = "Teste")

public class webserviceapi {


	
	@GetMapping(value = "consulta-1")
	public String criacao() {
		String teste = "Validado Teste";
		return teste;
	}
	 @GetMapping(value = "consulta-2")
		public String criacao2() {
			String teste2 = "Validado Teste 2";
			return teste2;
	}
 
@GetMapping(value = "consulta-3")
	public String criacao3() {
		String teste3 = "Validado Teste 3";
		return teste3;
}




}
