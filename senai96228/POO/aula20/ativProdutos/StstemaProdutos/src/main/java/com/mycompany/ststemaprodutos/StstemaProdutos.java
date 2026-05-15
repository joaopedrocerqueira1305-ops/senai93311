/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ststemaprodutos;

import com.mycompany.ststemaprodutos.telas.Login;

/**
 *
 * @author aluno.den
 */
public class StstemaProdutos {

    public static void main(String[] args) {
        // Cria uma instância da tela de Login
        Login telaLogin = new Login();
        
        // Centraliza a tela na abertura (opcional, mas recomendado)
        telaLogin.setLocationRelativeTo(null);
        
        // Torna a tela visível
        telaLogin.setVisible(true);
    }
}
