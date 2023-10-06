package org.example.lombok.spring;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.example.lombok.pojo.Lombok2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.math.BigInteger;
import java.util.List;
@Slf4j
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
 @RestController
 @RequestMapping(path = {"/lombok"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class LombokController {

    private LombokService service;

    @GetMapping("/Lombok/list")
    public ResponseEntity<List<Lombok2>> listLombok() {
        LOGGER.info("listLombok()");
        List<Lombok2> lombok2s = service.findLomboks();
        if (lombok2s.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        LOGGER.info("success!");
        return ResponseEntity.ok().body(lombok2s);
    }

    @GetMapping("/Lombok/fibonacci")
    public ResponseEntity<List<BigInteger>> fibonacci() {
        LOGGER.info("fibonacci()");
        List<BigInteger> fibonacciNumber = service.getFibonacciNumbers();
        if (fibonacciNumber.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        LOGGER.info("success!");
        return ResponseEntity.ok().body(fibonacciNumber);
    }

    @SneakyThrows
    private byte[] retrieveStockImage(String imageName) {
        LOGGER.info("retrieveStockImage(" + imageName + ")");
        ClassPathResource classPathResource = new ClassPathResource(imageName);
        @Cleanup InputStream in = classPathResource.getInputStream();
        byte[] imageBytes = StreamUtils.copyToByteArray(in);
        LOGGER.info("byte[]");
        return imageBytes;
    }
}