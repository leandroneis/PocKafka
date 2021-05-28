package br.com.kafka.pockafka.model;

public class Dados {

    private String id;
    private String mensagem;
    private Status status;

    public Dados(String id, String mensagem, Status status) {
        this.id = id;
        this.mensagem = mensagem;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
