package com.abracos.imigrantes.model;


import jakarta.persistence.*;

@Entity
@Table(name = "login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_login")
    private Long idlogin;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;



    public Long getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(Long idlogin) {
        this.idlogin = idlogin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
