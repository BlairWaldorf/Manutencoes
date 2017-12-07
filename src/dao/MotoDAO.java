/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Motos;

/**
 *
 * @author Jefferson Mendes
 */
public class MotoDAO {
    private final Connection connection;
    String placa;
    Date manutencao;
    Float kmContratado;
    Float kmAnterior;
    Float kmAtual;
    Float rodagem;
    int qtd;
    String objetoManutencao;
    Float valorUnitario;
    Float valorComposto;
    String justificativa;
    
    public MotoDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Motos motos){ 
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, motos.getPlaca());
            stmt.setDate(2, motos.getManutencao());
            stmt.setFloat(3, motos.getKmContratado());
            stmt.setFloat(4, motos.getKmAnterior());
            stmt.setFloat(5, motos.getKmAtual());
            stmt.setFloat(6, motos.getRodagem());
            stmt.setInt(7, motos.getQtd());
            stmt.setString(8, motos.getObjetoManutencao());
            stmt.setFloat(9, motos.getValorUnitario());
            stmt.setFloat(10, motos.getValorComposto());
            stmt.setString(11, motos.getJustificativa());
            
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
}
