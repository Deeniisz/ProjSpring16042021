package br.com.Service;

import br.com.model.Medicamento;
import br.com.Repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public void save(Medicamento medicamento){
        medicamentoRepository.save(medicamento);
    }

    public List<Medicamento> findAll (){
        return medicamentoRepository.findAll();
    }

    public Optional<Medicamento> findById(String id){
        return medicamentoRepository.findById(id);
    }

    public void delete(String id){
        medicamentoRepository.deleteById(id);
    }
}
