package app.banco.apiBanco.entidade;

import app.banco.apiBanco.record.RecordSenha;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Senha {
    private String usuario;
    private String autenticacao;

    public Senha(RecordSenha dados) {
        this.usuario = dados.usuario();
        this.autenticacao = dados.autenticacao();
    }
}
