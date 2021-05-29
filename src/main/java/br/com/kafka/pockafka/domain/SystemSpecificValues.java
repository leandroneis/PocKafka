package br.com.kafka.pockafka.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SystemSpecificValues {

    private String nr_seqcobrcartaocred;
    private String nr_tokencartaocred;
    private String dt_venctocobr;
    private String nr_movcobrcartaocred;
    private String tp_opercobr;
}
