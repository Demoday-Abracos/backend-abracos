package com.abracos.imigrantes.model;


import jakarta.persistence.*;

@Entity
@Table(name = "empregar")
public class Empregar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int pk_id_emprega;

    @Column
    private String nome_emprega;

    @Column
    private String email_emprega;

    @Column
    private String telefone;

    @Column
    private String mensagem;

    public int getPk_id_emprega() {
        return pk_id_emprega;
    }

    public void setPk_id_emprega(int pk_id_emprega) {
        this.pk_id_emprega = pk_id_emprega;
    }

    public String getNome_emprega() {
        return nome_emprega;
    }

    public void setNome_emprega(String nome_emprega) {
        this.nome_emprega = nome_emprega;
    }

    public String getEmail_emprega() {
        return email_emprega;
    }

    public void setEmail_emprega(String email_emprega) {
        this.email_emprega = email_emprega;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
