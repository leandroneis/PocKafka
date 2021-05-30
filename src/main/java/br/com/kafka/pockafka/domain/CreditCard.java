package br.com.kafka.pockafka.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {
    @JsonProperty(value = "cc_source_system")
    private String sourceSystem;
    @JsonProperty(value = "cc_client_reference_information")
    private String clientReferenceInformation;
    @JsonProperty(value = "cc_request_id")
    private String requestID;
    @JsonProperty(value = "cc_send_on")
    private String sendOn;
    @JsonProperty(value = "cc_message_return_code")
    private String messageReturnCode;
    @JsonProperty(value = "cc_issuer_authorization_code")
    private String issuerAuthorizationCode;
    @JsonProperty(value = "cc_acquirer_transaction_number")
    private String acquirerTransactionNumber;
    @JsonProperty(value = "systemSpecificValues")
    private SystemSpecificValues systemSpecificValues;

}
