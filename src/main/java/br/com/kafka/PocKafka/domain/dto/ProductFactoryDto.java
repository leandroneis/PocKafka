package br.com.kafka.pockafka.domain.dto;

import br.com.kafka.pockafka.domain.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ProductFactoryDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String message;
    private Status status;
    private String fileName;
    private String topicName;
}