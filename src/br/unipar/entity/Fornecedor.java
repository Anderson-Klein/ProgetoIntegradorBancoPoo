package br.unipar.entity;

public class Fornecedor extends Pessoa{

    private String cpf;
    private String cnpj;
    private String email;
    private String formaPamento;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormaPamento() {
        return formaPamento;
    }

    public void setFormaPamento(String formaPamento) {
        this.formaPamento = formaPamento;
    }
}
