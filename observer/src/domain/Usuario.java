/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author guzuc
 */
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nome;
    private String ultimaNotificacao;

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    void update(String nome) {
        ultimaNotificacao = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void setUltimaNotificacao(String ultimaNotificacao) {
        this.ultimaNotificacao = ultimaNotificacao;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

}
