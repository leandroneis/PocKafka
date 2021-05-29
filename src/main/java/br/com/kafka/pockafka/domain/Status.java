package br.com.kafka.pockafka.domain;

public enum Status {
    SUCCESS("Success"),ERROR("Error");

    private final String description;

    Status(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
