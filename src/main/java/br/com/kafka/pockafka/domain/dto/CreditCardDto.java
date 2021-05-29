package br.com.kafka.pockafka.domain.dto;

import java.io.Serializable;

public class CreditCardDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sourceSystem;
    private String clientReferenceInformation;
    private String requestID;
    private String sendOn;
    private String messageReturnCode;
    private String issuerAuthorizationCode;
    private String acquirerTransactionNumber;
    private SystemSpecificValuesDto systemSpecificValuesDto;
}




