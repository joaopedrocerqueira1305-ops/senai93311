package com.mycompany.cadastroproduto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import cadastroProduto.view.Login;

/**
 *
 * @author Emilia
 */
public class CadastroProduto {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Login telaLogin = new Login();
            telaLogin.setLocationRelativeTo(null);
            telaLogin.setVisible(true);
        });
    }
}