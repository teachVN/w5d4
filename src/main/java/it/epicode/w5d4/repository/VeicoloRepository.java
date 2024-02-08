package it.epicode.w5d4.repository;

import it.epicode.w5d4.bean.Veicolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeicoloRepository extends JpaRepository<Veicolo,Integer> {

    public List<Veicolo> findByNome(String nome);

    @Query("select v from Veicolo v where v.marca= :marca")
    public List<Veicolo> findMarca(String marca);
}
