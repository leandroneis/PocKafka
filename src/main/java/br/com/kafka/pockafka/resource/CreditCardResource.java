package br.com.kafka.pockafka.resource;


import br.com.kafka.pockafka.domain.CreditCard;
import br.com.kafka.pockafka.domain.SystemSpecificValues;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("kafka")
public class CreditCardResource {

    private KafkaTemplate<String, Object> kafkaTemplate;

    private static final String TOPIC1 = "topic1";



    public static final String PUBLISHED_SUCCESSFULLY = "Published successfully";

    public CreditCardResource(KafkaTemplate<String, Object> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/creditCard/{id}")
    public String post1(@PathVariable("id") final String id) {
        kafkaTemplate.send(TOPIC1, id, CreditCard.builder()
                .sourceSystem("INGENIUM")
                .clientReferenceInformation("38730197626")
                .requestID("6208419607056952004005")
                .sendOn("2021-05-12")
                .messageReturnCode("00")
                .issuerAuthorizationCode("757806")
                .acquirerTransactionNumber("0724075404046")
                .systemSpecificValues(SystemSpecificValues.builder()
                        .nr_movcobrcartaocred("999")
                        .nr_tokencartaocred("7030000000000355974")
                        .dt_venctocobr("2021-05-12")
                        .nr_movcobrcartaocred("999")
                        .tp_opercobr("P")
                        .build()).build());
        return PUBLISHED_SUCCESSFULLY + TOPIC1;
    }
}
