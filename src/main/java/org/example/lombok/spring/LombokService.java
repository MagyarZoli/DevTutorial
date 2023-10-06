package org.example.lombok.spring;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.example.auxiliary.Work;
import org.example.lombok.pojo.Lombok;
import org.example.lombok.pojo.Lombok2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Slf4j
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
 @Service
public class LombokService {

    private final LombokRepository repository;

    @Getter(lazy = true)
    private final List<BigInteger> fibonacciNumbers = calculateFibonacciSequence();

    public List<Lombok2> findLomboks() {
        LOGGER.info("findLomboks()");
        val lomboks = repository.findAll();
        return recordListConverter(lomboks);
    }

    public List<Lombok2> findLomboksByName(String name) {
        LOGGER.info("findLomboksByName(" + name + ")");
        val lomboks = repository.findAllByName(name);
        return recordListConverter(lomboks);
    }

    public Lombok2 findLombokById(Long id) {
        LOGGER.info("findLombokById(" + id + ")");
        val lombok = repository.findById(id);
        return lombok.map(this::recordConverter).orElse(null);
    }

    public Lombok2 updateLombokStatus(Long id) {
        LOGGER.info("updateLombokStatus(" + id + ")");
        val lombok2ById = findLombokById(id);
        val lombok2 = lombok2ById.withName(lombok2ById.name());
        return updateLombok(lombok2);
    }

    public Lombok2 updateLombok(final Lombok2 pojo2) {
        LOGGER.info("updatePojo(pojo2)");
        val lombokImage = repository.findById(pojo2.id()).get();
        val lombok = new Lombok(lombokImage.getId(), lombokImage.getName(), lombokImage.getAge(), lombokImage.getGender());
        return recordConverter(lombok);
    }

    private List<Lombok2> recordListConverter(List<Lombok> lomboks) {
        return lomboks.stream()
                .map(l -> new Lombok2(l.getId(), l.getName(), l.getAge(), l.getGender()))
                .collect(Collectors.toList());
    }

    private Lombok2 recordConverter(Lombok lombok) {
        Lombok2 lombok2 = new Lombok2(
                lombok.getId(),
                lombok.getName(),
                lombok.getAge(),
                lombok.getGender());
        System.out.println(lombok2 + "\n"
                + lombok2.hashCode() + "\n"
                + lombok2.name());
        return lombok2;
    }

    private List<BigInteger> calculateFibonacciSequence() {
        LOGGER.info("calculateFibonacciSequence() - started");
        List<BigInteger> result = new LinkedList<>();
        result.add(BigInteger.ZERO);
        result.add(BigInteger.ONE);
        for (int i = 2; i < 10_000; i++) {
            result.add(result.get(i - 1).add(result.get(i - 2)));
        }
        LOGGER.info("calculateFibonacciSequence() - completed");
        return result;
    }
}