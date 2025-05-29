//GS 29/05/2025
//PEDRO RUVIERI CAVARIANI - 551380
//PAULO HENRIQUE DA SILVA LIMA - 552444
package br.com.fiap.ra_552444.globalsolution.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.ra_552444.globalsolution.model.EventoExtremo;

@Repository
public interface EventoExtremoRepository extends JpaRepository<EventoExtremo, Long> {
}
