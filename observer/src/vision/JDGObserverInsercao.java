/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vision;

import control.ControleVisao;
import domain.Grupo;
import domain.Usuario;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author guzuc
 */
public class JDGObserverInsercao extends javax.swing.JDialog {

    private final ControleVisao controladorVisao;
    private static JDGObserverInsercao uniqueInstance;

    private Grupo grupoParaoBanco = null;
    private ArrayList<Usuario> usuariosParaoBanco = new ArrayList();

    private ArrayList<Grupo> gruposDoBanco = null;
    private ArrayList<Usuario> usuariosDoBanco = null;

    private JDGObserverInsercao(java.awt.Frame parent, boolean modal, ControleVisao controlador) {
        super(parent, modal);
        initComponents();
        controladorVisao = controlador;
    }

    public static synchronized JDGObserverInsercao getInstance(java.awt.Frame parent, boolean modal, ControleVisao controlador) {
        if (uniqueInstance == null) {
            uniqueInstance = new JDGObserverInsercao(parent, modal, controlador);
        }
        uniqueInstance.setModal(modal);
        return uniqueInstance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUsuario = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGrupo = new javax.swing.JList<>();
        btnCancelar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        lstUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstUsuario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo"));

        lstGrupo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstGrupoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstGrupo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar ao Grupo");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        if (gruposDoBanco != null) {
            gruposDoBanco.clear();
        }
        if (usuariosDoBanco != null) {
            usuariosDoBanco.clear();
        }

        DefaultListModel modeloGrupo = new DefaultListModel<>(), modeloUsuario = new DefaultListModel<>();

        gruposDoBanco = controladorVisao.getControleDominio().grupoReadAll();

        if (gruposDoBanco != null) {

            for (int i = 0; i < gruposDoBanco.size(); i++) {
                modeloGrupo.addElement(gruposDoBanco.get(i));
            }
            lstGrupo.setModel(modeloGrupo);

            usuariosDoBanco = controladorVisao.getControleDominio().usuarioReadAll();

            if (usuariosDoBanco != null) {
                for (int i = 0; i < usuariosDoBanco.size(); i++) {
                    modeloUsuario.addElement(usuariosDoBanco.get(i));
                }
                lstUsuario.setModel(modeloUsuario);
            }

        }
    }//GEN-LAST:event_formComponentShown

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (grupoParaoBanco == null) {
            JOptionPane.showMessageDialog(this, "Selecione um grupo.");
        } else if (usuariosParaoBanco == null) {
            JOptionPane.showMessageDialog(this, "Selecione um usuário.");
        } else {

            for (Usuario usuario : usuariosParaoBanco) {
                grupoParaoBanco.attach(usuario);
            }

            controladorVisao.getControleDominio().grupoUpdate(grupoParaoBanco);
            JOptionPane.showMessageDialog(this, "Usuário(s) adicionados ao grupo.");
            usuariosParaoBanco.clear();
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void lstUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstUsuarioMouseClicked

        if (lstUsuario.getSelectedIndex() >= 0) {
            usuariosParaoBanco.clear();
            for (int i : lstUsuario.getSelectedIndices()) {
                usuariosParaoBanco.add(usuariosDoBanco.get(i));
            }
        }
    }//GEN-LAST:event_lstUsuarioMouseClicked

    private void lstGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstGrupoMouseClicked

        if (lstGrupo.getSelectedIndex() >= 0) {
            grupoParaoBanco = (Grupo) gruposDoBanco.get(lstGrupo.getSelectedIndex());
        }

    }//GEN-LAST:event_lstGrupoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstGrupo;
    private javax.swing.JList<String> lstUsuario;
    // End of variables declaration//GEN-END:variables
}
