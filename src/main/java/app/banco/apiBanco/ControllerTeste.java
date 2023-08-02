package app.banco.apiBanco;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class ControllerTeste {




    @GetMapping
    public String mensagem(){

        return "Olá mundo";
    }

}
