package br.com.cbf.campeonatobrasileiro.rest;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cbf.campeonatobrasileiro.dto.TimeDTO;
import br.com.cbf.campeonatobrasileiro.service.TimeService;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping(value = "/times")
public class TimeRestController {
    @Autowired
    private TimeService timeService;
    @GetMapping
    public ResponseEntity<List<TimeDTO>> getTimes() {
        return ResponseEntity.ok().body(timeService.listarTimes());
    }
    @ApiOperation(value = "Obtém os dados de um time")
    @GetMapping(value = "{id}")
    public ResponseEntity<TimeDTO> getTime(@PathVariable Integer id) {
        return ResponseEntity.ok().body(timeService.obterTime(id));
    }
    @PostMapping
    public ResponseEntity<TimeDTO> cadastrarTime(@Validated @RequestBody TimeDTO time) throws Exception {
        return ResponseEntity.ok().body(timeService.cadastrarTime(time));
    }
}