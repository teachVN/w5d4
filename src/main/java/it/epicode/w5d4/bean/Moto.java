package it.epicode.w5d4.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("moto")
@Entity
public class Moto extends Veicolo{
    @Enumerated(EnumType.STRING)
    private Tipologia tipologia;

    @Override
    public String toString() {
        return "Moto{" + super.toString() +
                "tipologia='" + tipologia + '\'' +
                '}';
    }
}
