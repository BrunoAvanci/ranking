package ranking.com.example.ranking.dao;

import ranking.com.example.ranking.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{
}
