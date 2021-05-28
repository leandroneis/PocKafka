package br.com.kafka.pockafka.resource;


import br.com.kafka.pockafka.domain.dto.ProductFactoryDto;
import br.com.kafka.pockafka.domain.Status;
import br.com.kafka.pockafka.utils.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("kafka")
public class ProductFactoryDtoResource {


    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    private static final String TOPIC1 = "topic1";
    private static final String TOPIC2 = "topic2";
    private static final String TOPIC3 = "topic3";
    private static final String TOPIC4 = "topic4";
    private static final String TOPIC5 = "topic5";
    private static final String TOPIC6 = "topic6";

    public static final String PUBLISHED_SUCCESSFULLY = "Published successfully";

    @GetMapping("/publish1/{id}")
    public String post1(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC1, id, ProductFactoryDto.builder().id(id).message("Enviando Mensagem ao Consumer 1").status(Status.CREATE).fileName(RandomUtil.unique()).topicName(TOPIC1).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC1;
    }
    @GetMapping("/publish2/{id}")
    public String post2(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC2, id, ProductFactoryDto.builder().id(id).message("Enviando Mensagem ao Consumer 2").status(Status.CREATE).fileName(RandomUtil.unique()).topicName(TOPIC2).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC2;
    }
    @GetMapping("/publish3/{id}")
    public String post3(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC3, id, ProductFactoryDto.builder().id(id).message("Enviando Mensagem ao Consumer 3").status(Status.CREATE).fileName(RandomUtil.unique()).topicName(TOPIC3).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC3;
    }
    @GetMapping("/publish4/{id}")
    public String post4(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC4, id, ProductFactoryDto.builder().id(id).message("Enviando Mensagem ao Consumer 4").status(Status.CREATE).fileName(RandomUtil.unique()).topicName(TOPIC4).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC4;
    }
    @GetMapping("/publish5/{id}")
    public String post5(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC5, id, ProductFactoryDto.builder().id(id).message("Enviando Mensagem ao Consumer 5").status(Status.CREATE).fileName(RandomUtil.unique()).topicName(TOPIC5).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC4;
    }
    @GetMapping("/publish6/{id}")
    public String post6(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC6, id, ProductFactoryDto.builder().id(id).message("Enviando Mensagem ao Consumer 6").status(Status.CREATE).fileName(RandomUtil.unique()).topicName(TOPIC6).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC4;
    }
}
