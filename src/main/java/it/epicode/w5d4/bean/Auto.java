package it.epicode.w5d4.bean;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component("auto")
//@Primary //serve per scegliere quale implementazione iniettare in una classe che referenzia un oggetto di tipo superclasse
@Data
@Entity
public class Auto extends Veicolo{
    private int numeroPorte;

    @Override
    public String toString() {
        return "Auto{" + super.toString() +
                "numeroPorte=" + numeroPorte +
                '}';
    }
}
