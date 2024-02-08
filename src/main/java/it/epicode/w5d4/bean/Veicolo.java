package it.epicode.w5d4.bean;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Veicolo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String marca;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @Override
    public String toString() {
        return "Veicolo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
