/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import domain.*;
import vision.*;

/**
 *
 * @author gudeck
 */
public class ControleVisao {

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        ControleVisao visaoCtrl = new ControleVisao();
        visaoCtrl.janelaPrincipal();
    }

    private ControleDominio dominioCtlr;
    private JFRPrincipal janelaPrincipal;

    public ControleVisao() {
        dominioCtlr = ControleDominio.getInstance();
    }

    public ControleDominio getControleDominio() {
        return dominioCtlr;
    }

    public void janelaPrincipal() {
        janelaPrincipal = new JFRPrincipal(this);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setResizable(false);
        janelaPrincipal.setSize(565, 327);
        janelaPrincipal.setVisible(true);
    }

    public void cadastros() {
        JDGCadastros cadastros = JDGCadastros.getInstance(janelaPrincipal, true, this);
        cadastros.setLocationRelativeTo(null);
        cadastros.setResizable(false);
        cadastros.setVisible(true);
    }

    public void observer() {
        JDGObserver observer = JDGObserver.getInstance(janelaPrincipal, true, this);
        observer.setLocationRelativeTo(null);
        observer.setResizable(false);
        observer.setVisible(true);
    }

//    public Cliente buscaCliente() {
//        JDGBuscaCliente buscaCliente = JDGBuscaCliente.getInstance(janelaPrincipal, true, this);
//        buscaCliente.setLocationRelativeTo(null);
//        buscaCliente.setResizable(false);
//        buscaCliente.setVisible(true);
//
//        return buscaCliente.getObjetoCliente();
//    }
    public void observerAttach() {
        JDGObserverInsercao observerInsercao = JDGObserverInsercao.getInstance(janelaPrincipal, true, this);
        observerInsercao.setLocationRelativeTo(null);
        observerInsercao.setResizable(false);
        observerInsercao.setVisible(true);
    }
}
