package br.com.cbf.campeonatobrasileiro.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cbf.campeonatobrasileiro.entity.time;

@Repository
public interface TimeRepository extends JpaRepository<time, Integer> {

}
