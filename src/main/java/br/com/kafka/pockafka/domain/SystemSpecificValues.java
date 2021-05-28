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
public class SystemSpecificValues {
    @JsonProperty(value = "nr_seqcobrcartaocred" )
    private String nr_seqcobrcartaocred;
    @JsonProperty(value = "nr_tokencartaocred")
    private String nr_tokencartaocred;
    @JsonProperty(value = "dt_venctocobr")
    private String dt_venctocobr;
    @JsonProperty(value = "nr_movcobrcartaocred")
    private String nr_movcobrcartaocred;
    @JsonProperty(value = "tp_opercobr")
    private String tp_opercobr;
}
