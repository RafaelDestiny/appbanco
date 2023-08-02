package app.banco.apiBanco.record;

import app.banco.apiBanco.entidade.Endereco;
import app.banco.apiBanco.entidade.Senha;

public record CadastroDadosRecord(Long id,

                                  String nome,
                                  String cpf,
                                  String email,
                                  String telefone,
                                  RecordEndereco endereco,
                                  RecordSenha senha) {

}
