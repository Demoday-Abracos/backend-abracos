package com.abracos.imigrantes.model;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_imigrante")
public class Imigrantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_imigrante")
    private Integer pk_id_imigrante;

    @Column(name = "nome_imigrante")
    private String nome_imigrante;

    @Column(name = "email_imigrante")
    private String email_imigrante;

    @Column(name = "senha_imigrante")
    private String senha_imigrante;

    @Column(name = "telefone_imigarante")
    private String telefone_imigrante;

    public Integer getPk_id_imigrante() {
        return pk_id_imigrante;
    }

    public void setPk_id_imigrante(Integer pk_id_imigrante) {
        this.pk_id_imigrante = pk_id_imigrante;
    }


    public String getEmail_imigrante() {
        return email_imigrante;
    }

    public void setEmail_imigrante(String email_imigrante) {
        this.email_imigrante = email_imigrante;
    }

    public String getSenha_imigrante() {
        return senha_imigrante;
    }

    public void setSenha_imigrante(String senha_imigrante) {
        this.senha_imigrante = senha_imigrante;
    }

    public String getTelefone_imigrante() {
        return telefone_imigrante;
    }

    public void setTelefone_imigrante(String telefone_imigrante) {
        this.telefone_imigrante = telefone_imigrante;
    }

    public String getNome_imigrante() {
        return nome_imigrante;
    }

    public void setNome_imigrante(String nome_imigrante) {
        this.nome_imigrante = nome_imigrante;
    }
}
