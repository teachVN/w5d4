package it.epicode.w5d4.service;

import it.epicode.w5d4.bean.Veicolo;
import it.epicode.w5d4.repository.VeicoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeicoloService {
    @Autowired
    private VeicoloRepository veicoloRepository;

    public void salvaVeicolo(Veicolo veicolo){
        veicoloRepository.save(veicolo);
    }

    public void aggiornaVeicolo(Veicolo veicolo){
        Veicolo v = veicoloRepository.findById(veicolo.getId()).get();
        v.setNome(veicolo.getNome());
        v.setMarca(veicolo.getMarca());
        v.setPersona(veicolo.getPersona());
        veicoloRepository.save(v);
    }

    public Veicolo cercaVeicoloPerId(int id){
        return veicoloRepository.findById(id).get();
    }

    public void cancellaVeicolo(int id){
        veicoloRepository.deleteById(id);
    }

    public List<Veicolo> cercaVeicoloPerNome(String nome){
        return veicoloRepository.findByNome(nome);
    }

    public List<Veicolo> cercaVeicoloPerMarca(String marca){
        return veicoloRepository.findMarca(marca);
    }

}
