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
public class SystemSpecificValues {
    @JsonProperty(value = "nr_seqcobrcartaocred")
    private String sequenceNumberCreditCard;
    @JsonProperty(value = "nr_tokencartaocred")
    private String tokenNumberCreditCard;
    @JsonProperty(value = "dt_venctocobr")
    private String billingDueDate;
    @JsonProperty(value = "nr_movcobrcartaocred")
    private String numberMovementChargeCreditCard;
    @JsonProperty(value = "tp_opercobr")
    private String operationType;
}
