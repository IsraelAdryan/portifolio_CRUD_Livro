package com.crud.portifolio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController       //Retorna dados em formato JSON
@AllArgsConstructor   //Gera construtores de forma automática
public class LivroController {

    LivroRepository livroRepository;

    @GetMapping("/livro")                //Determina a rota do controller referente a requisição desse método
    public List<Livro> getAllLivro() {   // Método que PEGA todos os livros da lista
        return livroRepository.findAll();
    }

    @GetMapping("/livro/{id}")
    public Livro getlivroById(@PathVariable Long id) {  //Método que PEGA todos os livros da lista baseado pelo ID
        return livroRepository.findById(id).get();
    }

    @PostMapping("/livro")                             //Simplifica o mapeamento da requisição HTTP POST (Inclusão de informações no Banco de Dados)
    public Livro save(@RequestBody Livro livro){       //Método para CADASTRAR livros
        return livroRepository.save(livro);
    }

    @DeleteMapping("/livro/{id}")                      //Especifica o ccaminho do que deve ser excluido quando executar o DELETE
    public void deleteLivro (@PathVariable Long id){   //Deleta um Livr baseado no ID do mesmo
        livroRepository.deleteById(id);
    }
}

