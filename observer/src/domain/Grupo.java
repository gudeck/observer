/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author guzuc
 */
@Entity
public class Grupo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idGrupo;
    String nome;

    @OneToOne(targetEntity = Mensagem.class)
    private Mensagem ultimaMensagem;

    @ManyToMany(targetEntity = Usuario.class, fetch = FetchType.EAGER)
    private List<Usuario> listaUsuarios;
//    ArrayList<Mensagem> listaMensagens;

    public Grupo() {
    }

    public Grupo(String nome) {
        this.nome = nome;
        this.listaUsuarios = new ArrayList<>();
        this.ultimaMensagem = null;
//        this.listaMensagens = new ArrayList<>();
    }

    public void attach(Usuario usuario) {
        if (listaUsuarios.contains(usuario)) {
            return;
        }
        listaUsuarios.add(usuario);
    }

    public void detach(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }

    public void setState(Mensagem ultimaMensagem) {
        this.ultimaMensagem = ultimaMensagem;
        notifyObservers();
    }

    private void notifyObservers() {
        listaUsuarios.forEach((usuario) -> {
            usuario.update(this.nome);
        });
    }

    public Mensagem getState() {
        return ultimaMensagem;
    }

    @Override
    public String toString() {
        return nome;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Mensagem getUltimaMensagem() {
        return ultimaMensagem;
    }

    public void setUltimaMensagem(Mensagem ultimaMensagem) {
        this.ultimaMensagem = ultimaMensagem;
    }

}
