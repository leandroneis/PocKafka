package br.com.kafka.pockafka.domain;


public enum ErrorCode {
    UNAUTHORIZED("Unauthorized"),
    INTERNAL_SERVER_ERROR("Fail"),
    INGENIUM_LOG_NOT_FOUND("Ingenium Log Not Found"),
    INVALID_INPUT_DATA("Invalid Input Data");

    private final String description;

    ErrorCode(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}