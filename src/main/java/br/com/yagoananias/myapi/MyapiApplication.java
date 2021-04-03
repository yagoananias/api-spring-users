package br.com.yagoananias.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.yagoananias.myapi.domain.Usuario;
import br.com.yagoananias.myapi.repositories.IUsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Yago Lima", "yago", "123");
		Usuario u2 = new Usuario(null, "Andressa Lima", "dressa", "123");
		Usuario u3 = new Usuario(null, "Bernardo Lima", "Bebe", "123");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2, u3));
		
	}

}
