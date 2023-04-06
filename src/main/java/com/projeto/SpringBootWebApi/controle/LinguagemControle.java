package com.projeto.SpringBootWebApi.controle;

import com.projeto.SpringBootWebApi.modelo.Linguagem;
import com.projeto.SpringBootWebApi.repositorio.LinguagemRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemControle {

    //  private List<Linguagem> linguagens = List.of(
    //       new Linguagem("java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
    //       new Linguagem("PHP", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png", 2));
     //       new Linguagem("C#", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/csharp/csharp_256x256.png", 3));
    @Autowired
    private LinguagemRepositorio repositorio;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {

        List<Linguagem> linguagens = repositorio.findAll();

        return linguagens;

    }

    @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {

        Linguagem linguagemSalva = repositorio.save(linguagem);

        return linguagemSalva;

    }

}
