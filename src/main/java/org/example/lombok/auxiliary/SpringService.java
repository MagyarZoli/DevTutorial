package org.example.lombok.auxiliary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class SpringService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringService.class);

    private final SpringRepository repository;

    @Autowired
    public SpringService(SpringRepository repository) {
        this.repository = repository;
    }

    public List<Pojo2> findPojos() {
        LOGGER.info("findPojos()");
        final List<Pojo> pojos = repository.findAll();
        return recordListConverter(pojos);
    }

    public List<Pojo2> findPojosByName(String name) {
        LOGGER.info("findPojosByName(" + name + ")");
        final List<Pojo> pojos = repository.findAllByName(name);
        return recordListConverter(pojos);
    }

    public Pojo2 findPojoById(Long id) {
        LOGGER.info("findPojoById(" + id + ")");
        final Optional<Pojo> pojo = repository.findById(id);
        if (pojo.isPresent()) {
            return recordConverter(pojo.get());
        } else {
            return null;
        }
    }

    public Pojo2 updatePojoStatus(Long id) {
        LOGGER.info("updatePojoStatus(" + id + ")");
        final Pojo2 pojo2ById = findPojoById(id);
        final Pojo2 pojo2 = new Pojo2(id, pojo2ById.name(), pojo2ById.age(), pojo2ById.gender());
        return updatePojo(pojo2);
    }

    public Pojo2 updatePojo(final Pojo2 pojo2) {
        LOGGER.info("updatePojo(pojo2)");
        final Pojo pojoImage = repository.findById(pojo2.id()).get();
        final Pojo pojo = new Pojo(pojoImage.getId(), pojoImage.getName(), pojoImage.getAge());
        return recordConverter(pojo);
    }

    private List<Pojo2> recordListConverter(List<Pojo> pojos) {
        List<Pojo2> list = new LinkedList<>();
        for (Pojo p : pojos) {
            list.add(new Pojo2(p.getId(), p.getName(), p.getAge(), p.getGender()));
        }
        return list;
    }

    private Pojo2 recordConverter(Pojo pojo) {
        Pojo2 lombok2 = new Pojo2(
                pojo.getId(),
                pojo.getName(),
                pojo.getAge(),
                pojo.getGender());
        System.out.println(lombok2 + "\n"
                + lombok2.hashCode() + "\n"
                + lombok2.name());
        return lombok2;
    }

    public List<BigInteger> getFibonacciNumbers() {
        return calculateFibonacciSequence();
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

    private byte[] retrieveStockImage(String imageName)
            throws IOException {
        LOGGER.info("retrieveStockImage(" + imageName + ")");
        InputStream in = null;
        try {
            ClassPathResource classPathResource = new ClassPathResource(imageName);
            in = classPathResource.getInputStream();
            byte[] imageBytes = StreamUtils.copyToByteArray(in);
            LOGGER.info("byte[]");
            return imageBytes;
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}