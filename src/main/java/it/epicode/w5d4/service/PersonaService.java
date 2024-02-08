package it.epicode.w5d4.service;

import it.epicode.w5d4.bean.Persona;
import it.epicode.w5d4.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public void salvaPersona(Persona persona){
        personaRepository.save(persona);
    }

    public void aggiornaPersona(Persona persona){
        Persona p = personaRepository.findById(persona.getId()).get();
        p.setNome(persona.getNome());
        p.setCognome(persona.getCognome());
        p.setDataNascita(persona.getDataNascita());

        personaRepository.save(p);

    }

    public Persona cercaPersonaPerId(int id){
        return personaRepository.findById(id).get();
    }

    public void cancellaPersona(int id){
        personaRepository.deleteById(id);
    }
}
