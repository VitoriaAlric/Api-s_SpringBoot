package br.com.cbf.campeonatobrasileiro.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cbf.campeonatobrasileiro.entity.time;
import br.com.cbf.campeonatobrasileiro.service.TimeService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/times")
public class TimeRestController {

	@Autowired
	private TimeService timeService;

	@GetMapping
	public ResponseEntity<List<time>> getTimes() {
		return ResponseEntity.ok().body(timeService.listarTimes());
	}

	@ApiOperation(value = "Obtém os dados de um time")
	@GetMapping(value = "{id}")
	public ResponseEntity<time> getTime(@PathVariable Integer id) {
		return ResponseEntity.ok().body(timeService.obterTime(id));
	}

	@PostMapping
	public ResponseEntity<Void> cadastrarTime(time time) {
		timeService.cadastrarTime(time);
		return ResponseEntity.ok().build();
	}
}
