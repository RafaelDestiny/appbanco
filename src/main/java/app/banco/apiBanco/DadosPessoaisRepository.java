package app.banco.apiBanco;

import app.banco.apiBanco.entidade.DadosPessoais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosPessoaisRepository extends JpaRepository<DadosPessoais, Long> {
}
