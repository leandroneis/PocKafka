package br.com.kafka.pockafka.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@Entity
public class ProductFactory {

    @Id
    private String id;
    private String message;
    private Status status;
    private String fileName;
    private String topicName;
}

