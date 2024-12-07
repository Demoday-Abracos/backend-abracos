package com.abracos.imigrantes.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "consulta")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_consulta;

    @Column
    private LocalDate data_consulta;

    @Column
    private String  motivo_consulta;

    @Column
    private String  preferencias_consulta;

    @Column
    private int idade_consulta;

    @Column
    private LocalTime horario_consulta;

    public Long getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(Long id_consulta) {
        this.id_consulta = id_consulta;
    }

    public LocalDate getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(LocalDate data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public String getPreferencias_consulta() {
        return preferencias_consulta;
    }

    public void setPreferencias_consulta(String preferencias_consulta) {
        this.preferencias_consulta = preferencias_consulta;
    }

    public int getIdade_consulta() {
        return idade_consulta;
    }

    public void setIdade_consulta(int idade_consulta) {
        this.idade_consulta = idade_consulta;
    }

    public LocalTime getHorario_consulta() {
        return horario_consulta;
    }

    public void setHorario_consulta(LocalTime horario_consulta) {
        this.horario_consulta = horario_consulta;
    }
}
