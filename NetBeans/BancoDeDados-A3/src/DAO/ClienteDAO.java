package DAO;

import DTO.ClienteDTO;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> lista = new ArrayList<>();
    
    public void cadastrarCliente(ClienteDTO objClienteDTO) throws SQLException {
        String sql = "insert into cliente (nome, cpf, email, endereço, dado_pagamento) values (?,?,?,?,?)";
        
        conexao = new ConexaoBD().conectaBD();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getNome_cliente());
            pstm.setString(2, objClienteDTO.getCpf_cliente());
            pstm.setString(3, objClienteDTO.getEmail_cliente());
            pstm.setString(4, objClienteDTO.getEndereco_cliente());
            pstm.setString(5, objClienteDTO.getPagamento_cliente());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO" + erro);
        }
    
    }
    
    public ArrayList<ClienteDTO> pesquisarCliente() throws SQLException{
        String sql = "select * from cliente";
        
        conexao = new ConexaoBD().conectaBD();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                ClienteDTO objClienteDTO = new ClienteDTO();
                objClienteDTO.setCod_cliente(rs.getInt("cod_cliente"));
                objClienteDTO.setNome_cliente(rs.getString("nome"));
                objClienteDTO.setCpf_cliente(rs.getString("cpf"));
                objClienteDTO.setEmail_cliente(rs.getString("email"));
                objClienteDTO.setEndereco_cliente(rs.getString("endereço"));
                objClienteDTO.setPagamento_cliente(rs.getString("dado_pagamento"));
                
                lista.add(objClienteDTO);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar: " + erro);
        }
        return lista;
    }
    
}
