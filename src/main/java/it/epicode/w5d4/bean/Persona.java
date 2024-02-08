package it.epicode.w5d4.bean;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Entity
@Component
@Data
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;

//    @Autowired
//    @Qualifier("smart")
    @OneToMany(mappedBy = "persona", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Veicolo> veicolo;

//    @Autowired //inizione di un veicolo di tipo moto attraverso il costruttore
//    public Persona(@Qualifier("moto") Veicolo veicolo){
//        this.veicolo=veicolo;
//        this.nome="Gaia";
//        this.cognome="Castello";
//        this.dataNascita=LocalDate.of(2020,2,2);
//    }
}
