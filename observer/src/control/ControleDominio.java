/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.*;
import domain.*;
import java.util.ArrayList;

/**
 *
 * @author gudeck
 */
public class ControleDominio {

    private static final ControleDominio uniqueInstance = new ControleDominio();
    private final GenericDAO genericDao;

    private ArrayList<Grupo> grupos;

    private ControleDominio() {
        dao.ConexaoHibernate.getSessionFactory();
        genericDao = new GenericDAO();
        grupos = new ArrayList<>();
    }

    public static ControleDominio getInstance() {
        return uniqueInstance;
    }

    public void grupoCreate(String nome) {

        Grupo novoGrupo = new Grupo(nome);
        grupos.add(novoGrupo);
        genericDao.create(novoGrupo);

    }

    public Grupo grupoRead(Grupo grupo) {

        if (grupos.contains(grupo)) {
            return grupos.get(grupos.indexOf(grupo));
        }

        return (Grupo) genericDao.readAll(Grupo.class).get(grupos.indexOf(grupo));

    }

    public ArrayList<Grupo> grupoReadAll() {

        if (genericDao.readAll(Grupo.class).isEmpty()) {
            return null;
        }
        return (ArrayList) genericDao.readAll(Grupo.class);
    }

    public void grupoUpdate(Grupo grupo) {
        genericDao.update(grupo);
    }

    public void usuarioCreate(String nome) {

        Usuario novoUsuario = new Usuario(nome);
        genericDao.create(novoUsuario);

    }

    public Usuario usuarioRead(Usuario usuario) {

        return (Usuario) genericDao.readAll(Grupo.class).get(grupos.indexOf(usuario));

    }

    public ArrayList<Usuario> usuarioReadAll() {
        if (genericDao.readAll(Usuario.class).isEmpty()) {
            return null;
        }

        return (ArrayList) genericDao.readAll(Usuario.class);
    }

    public void mensagemCreate(Mensagem novaMensagem) {

        genericDao.create(novaMensagem);

    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void usuarioUpdate(Usuario usuario) {
        genericDao.update(usuario);
    }

}
