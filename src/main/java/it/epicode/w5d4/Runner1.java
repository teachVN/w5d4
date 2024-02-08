package it.epicode.w5d4;

import it.epicode.w5d4.bean.Auto;
import it.epicode.w5d4.bean.Moto;
import it.epicode.w5d4.bean.Persona;
import it.epicode.w5d4.bean.Tipologia;
import it.epicode.w5d4.service.PersonaService;
import it.epicode.w5d4.service.VeicoloService;
import jdk.swing.interop.SwingInterOpUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Order(1)

public class Runner1 implements CommandLineRunner {
    @Autowired
    private PersonaService personaService;
    @Autowired
    private VeicoloService veicoloService;

    private Logger logger = LoggerFactory.getLogger("w5d4");

    @Override
    public void run(String... args) throws Exception {
        logger.info("Primo Runner");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(W5d4Application.class);

//        Moto m = ctx.getBean(Moto.class);
//        m.setNome("CBR");
//        m.setMarca("Honda");
//        m.setTipologia(Tipologia.SUPERSPORT);
//
//        veicoloService.salvaVeicolo(m);
//
//
//
//        Persona p = ctx.getBean(Persona.class);
//        p.setNome("Carlo");
//        p.setCognome("D'Amato");
//        p.setDataNascita(LocalDate.of(2000,3,5));
//        personaService.salvaPersona(p);
//
//        logger.info(p.toString());
//
//        m.setPersona(p);
//        veicoloService.salvaVeicolo(m);
//
//        logger.info(m.toString());

        veicoloService.cercaVeicoloPerNome("SH 300").stream().forEach(v->logger.info(v.toString()));

        veicoloService.cercaVeicoloPerMarca("Honda").forEach(v->logger.info(v.toString()));

//
//        Auto auto = ctx.getBean("smart", Auto.class);
//
//        logger.info(auto);
//
//        Auto auto2 = ctx.getBean("scenic", Auto.class);
//
//        logger.info(auto2.toString());




    }
}
