package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Medicamento;
import br.com.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @PostMapping(Constant.API_MEDICAMENTO)
    public void save(@RequestBody Medicamento medicamento){
        medicamentoService.save(medicamento);
    }

    @GetMapping(Constant.API_MEDICAMENTO)
    public List<Medicamento> findAll(){
        return medicamentoService.findAll();
    }

    @PutMapping(Constant.API_MEDICAMENTO)
    public void update (@RequestBody Client client){
        medicamentoService.save(client);
    }

    @DeleteMapping(Constant.API_MEDICAMENTO + "/{id}")
    public void delete(@PathVariable("id") String id){
        medicamentoService.delete(id);
    }

    @GetMapping(Constant.API_MEDICAMENTO + "/{id}")
    public Optional<Medicamento> findById(@PathVariable("id") String id){
        return medicamentoService.findById(id);
    }
}
