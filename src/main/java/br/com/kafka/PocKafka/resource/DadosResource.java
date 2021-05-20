package br.com.kafka.PocKafka.resource;

import br.com.kafka.PocKafka.model.Dados;
import br.com.kafka.PocKafka.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class DadosResource {

    @Autowired
    private KafkaTemplate<String, Dados> kafkaTemplate;

    private static final String TOPIC = "topico";

    @GetMapping("/publish/{id}")
    public String post(@PathVariable("id") final String id) {

        kafkaTemplate.send(TOPIC, new Dados(id,"Teste Envio para o 37", Status.CREATE ));

        return "Published successfully";
    }
}
