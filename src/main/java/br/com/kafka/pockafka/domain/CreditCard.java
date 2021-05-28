package br.com.kafka.pockafka.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class CreditCard {
    @JsonProperty(value = "sourceSystem")
    private String sourceSystem;

    @JsonProperty(value = "clientReferenceInformation")
    private String clientReferenceInformation;
    @JsonProperty(value = "requestID")
    private String requestID;
    @JsonProperty(value = "sendOn")
    private String sendOn;
    @JsonProperty(value = "messageReturnCode")
    private String messageReturnCode;
    @JsonProperty(value = "issuerAuthorizationCode")
    private String issuerAuthorizationCode;
    @JsonProperty(value = "acquirerTransactionNumber")
    private String acquirerTransactionNumber;

    private SystemSpecificValues systemSpecificValues;

}
