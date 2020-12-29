package br.com.cbf.campeonatobrasileiro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cbf.campeonatobrasileiro.entity.time;
import br.com.cbf.campeonatobrasileiro.repository.TimeRepository;

@Service
public class TimeService {

	@Autowired
	private TimeRepository repository;

	public void cadastrarTime(time time) {
		repository.save(time);
	}

	public List<time> listarTimes() {
		return repository.findAll();
	}

	public time obterTime(Integer id) {
		return repository.findById(id).get();
	}
}
