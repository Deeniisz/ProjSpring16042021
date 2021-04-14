package br.com.Repository;

import br.com.model.Medicamento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends MongoRepository<Medicamento, String> {
}
