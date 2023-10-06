package org.example.lombok.auxiliary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping(path = {"/lombok"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class SpringController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringController.class);

    private SpringService service;

    @Autowired
    public SpringController(SpringService service) {
        this.service = service;
    }

    @GetMapping("/Pojo/list")
    public ResponseEntity<List<Pojo2>> listPojo() {
        LOGGER.info("listPojo()");
        List<Pojo2> pojo2s = service.findPojos();
        if (pojo2s.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        LOGGER.info("success!");
        return ResponseEntity.ok().body(pojo2s);
    }

    @GetMapping("/Pojo/fibonacci")
    public ResponseEntity<List<BigInteger>> fibonacci() {
        LOGGER.info("fibonacci()");
        List<BigInteger> fibonacciNumber = service.getFibonacciNumbers();
        if (fibonacciNumber.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        LOGGER.info("success!");
        return ResponseEntity.ok().body(fibonacciNumber);
    }
}