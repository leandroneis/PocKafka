package br.com.kafka.pockafka.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_factory",schema = "pf_integration")
public class Coherent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String transactionId;
    private String sourceSystem;
    private String fileSystem;
    private String message;
    private String data;
    @Enumerated(EnumType.STRING)
    private ErrorCode errorCode;
    @Enumerated(EnumType.STRING)
    private Status status;
}

