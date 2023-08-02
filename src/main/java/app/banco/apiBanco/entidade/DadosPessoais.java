package app.banco.apiBanco.entidade;

import app.banco.apiBanco.record.CadastroDadosRecord;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "dadospessoais")
public class DadosPessoais {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
   private String cpf;
   private String email;
   private String telefone;

   @Embedded
   private Endereco endereco;

   @Embedded
   private Senha senha;

   public DadosPessoais(CadastroDadosRecord dados) {
      this.id = dados.id();
      this.nome = dados.nome();
      this.cpf = dados.cpf();
      this.email = dados.email();
      this.telefone = dados.telefone();
      this.endereco = new Endereco(dados.endereco());
      this.senha = new Senha(dados.senha());

   }
}
