package app.banco.apiBanco.controllers;


import app.banco.apiBanco.DadosPessoaisRepository;
import app.banco.apiBanco.entidade.DadosPessoais;
import app.banco.apiBanco.record.CadastroDadosRecord;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/dadospessoais")
public class DadosPessoaisController {

   @Autowired
   private DadosPessoaisRepository dadosPessoaisRepository;

   @PostMapping
   @Transactional
    public void cadastrar(@RequestBody CadastroDadosRecord dados){
        dadosPessoaisRepository.save(new DadosPessoais(dados));

    }
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){

       dadosPessoaisRepository.deleteById(id);



    }


}
