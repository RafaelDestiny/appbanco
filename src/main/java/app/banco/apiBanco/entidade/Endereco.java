package app.banco.apiBanco.entidade;

import app.banco.apiBanco.record.CadastroDadosRecord;
import app.banco.apiBanco.record.RecordEndereco;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Endereco {

    String logradouro;
    String numero;
    String bairro;
    String cep;
    String complemento;

    public Endereco(RecordEndereco dados) {
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.complemento = dados.complemento();    }


}
