package app.banco.apiBanco.controllers;


import app.banco.apiBanco.DadosPessoaisRepository;
import app.banco.apiBanco.entidade.DadosPessoais;
import app.banco.apiBanco.record.CadastroDadosRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/dadospessoais")
public class DadosPessoaisController {

    @Autowired
    DadosPessoaisRepository repository;



    @PostMapping
    public void cadastrar(@RequestBody CadastroDadosRecord dados){
        repository.save(new DadosPessoais(dados));

    }


}
