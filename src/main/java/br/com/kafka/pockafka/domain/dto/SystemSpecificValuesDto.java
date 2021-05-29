package br.com.kafka.pockafka.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SystemSpecificValuesDto {
    private String nr_seqcobrcartaocred;
    private String nr_tokencartaocred;
    private String dt_venctocobr;
    private String nr_movcobrcartaocred;
    private String tp_opercobr;
}