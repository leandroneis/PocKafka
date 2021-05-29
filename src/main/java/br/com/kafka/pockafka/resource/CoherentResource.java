package br.com.kafka.pockafka.resource;


import br.com.kafka.pockafka.domain.ErrorCode;
import br.com.kafka.pockafka.domain.dto.CoherentDto;
import br.com.kafka.pockafka.domain.Status;
import br.com.kafka.pockafka.utils.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("kafka")
public class CoherentResource {

    private KafkaTemplate<String, Object> kafkaTemplate;

    private static final String TOPIC2 = "topic2";
    private static final String TOPIC3 = "topic3";
    private static final String TOPIC4 = "topic4";
    private static final String TOPIC5 = "topic5";
    private static final String TOPIC6 = "topic6";
    /*

        @Id
     "transactionId": {hash},
    "sourceSystem": "INGENIUM",
    "fileSystem": "",
    "message": null,
    "data": null,
    "errorCode": null,
    "status": "Success"
     */
    public static final String PUBLISHED_SUCCESSFULLY = "Published successfully";

    public CoherentResource(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/productFactory2/{id}")
    public String post2(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC2, id,
                CoherentDto.builder()
                        .transactionId(RandomUtil.unique())
                        .sourceSystem("INGENIUM")
                        .fileSystem("FileSystem....")
                        .message("Testando " + TOPIC2)
                        .data("2021-12-28")
                        .errorCode(ErrorCode.INVALID_INPUT_DATA.toString())
                        .status(Status.SUCCESS.toString()
                        ).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC2;
    }

    @GetMapping("/productFactory3/{id}")
    public String post3(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC3, id,
                CoherentDto.builder()
                        .transactionId(RandomUtil.unique())
                        .sourceSystem("INGENIUM")
                        .fileSystem("FileSystem....")
                        .message("Testando " + TOPIC3)
                        .data("2021-12-28")
                        .errorCode(ErrorCode.INVALID_INPUT_DATA.toString())
                        .status(Status.SUCCESS.toString()
                        ).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC3;
    }

    @GetMapping("/productFactory4/{id}")
    public String post4(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC4, id,
                CoherentDto.builder()
                        .transactionId(RandomUtil.unique())
                        .sourceSystem("INGENIUM")
                        .fileSystem("FileSystem....")
                        .message("Testando " + TOPIC4)
                        .data("2021-12-28")
                        .errorCode(ErrorCode.INVALID_INPUT_DATA.toString())
                        .status(Status.SUCCESS.toString()
                        ).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC4;
    }

    @GetMapping("/productFactory5/{id}")
    public String post5(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC5, id,
                CoherentDto.builder()
                        .transactionId(RandomUtil.unique())
                        .sourceSystem("INGENIUM")
                        .fileSystem("FileSystem....")
                        .message("Testando " + TOPIC5)
                        .data("2021-12-28")
                        .errorCode(ErrorCode.INVALID_INPUT_DATA.toString())
                        .status(Status.SUCCESS.toString()
                        ).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC5;
    }

    @GetMapping("/productFactory6/{id}")
    public String post6(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC6, id,
                CoherentDto.builder()
                        .transactionId(RandomUtil.unique())
                        .sourceSystem("INGENIUM")
                        .fileSystem("FileSystem....")
                        .message("Testando " + TOPIC6)
                        .data("2021-12-28")
                        .errorCode(ErrorCode.INVALID_INPUT_DATA.toString())
                        .status(Status.SUCCESS.toString()
                        ).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC6;
    }
}
