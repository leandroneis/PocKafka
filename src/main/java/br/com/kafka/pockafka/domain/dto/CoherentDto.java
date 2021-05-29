package br.com.kafka.pockafka.domain.dto;

import br.com.kafka.pockafka.domain.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class CoherentDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String transactionId;
    private String sourceSystem;
    private String fileSystem;
    private String message;
    private String data;
    private String errorCode;
    private String status;
}