package DAO;

import DTO.NotaFiscalDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NotaFiscalDAO {
    
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<NotaFiscalDTO> lista = new ArrayList<>();

    public void geraNota(NotaFiscalDTO objNotaFiscalDTO) throws SQLException {
        String sql = "insert into notafiscal (nome_emp, endereço, datavenda, cnpj, cod_cliente, cod_produto, quant_prod) values (?,?,?,?,?,?,?)";
        
        conexao = new ConexaoBD().conectaBD();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objNotaFiscalDTO.getNome_emp());
            pstm.setString(2, objNotaFiscalDTO.getEndereco_emp());
            pstm.setString(3, objNotaFiscalDTO.getDataVenda());
            pstm.setString(4, objNotaFiscalDTO.getCnpj_emp());
            pstm.setString(5, objNotaFiscalDTO.getCod_cli());
            pstm.setString(6, objNotaFiscalDTO.getCod_prod());
            pstm.setString(7, objNotaFiscalDTO.getQuant_prod());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "NotaFiscalDAO" + erro);
        }
    }
    
    public ArrayList<NotaFiscalDTO> pesquisarProduto() throws SQLException{
       String sql = "select * from notafiscal";
        
        conexao = new ConexaoBD().conectaBD();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                NotaFiscalDTO objNotaFiscalDTO = new NotaFiscalDTO();
                objNotaFiscalDTO.setNumero_nota(rs.getInt("numero_nota"));
                objNotaFiscalDTO.setNome_emp(rs.getString("nome_emp"));
                objNotaFiscalDTO.setEndereco_emp(rs.getString("endereço"));
                objNotaFiscalDTO.setDataVenda(rs.getString("datavenda"));
                objNotaFiscalDTO.setCnpj_emp(rs.getString("CNPJ"));
                objNotaFiscalDTO.setCod_cli(rs.getString("cod_cliente"));
                objNotaFiscalDTO.setCod_prod(rs.getString("cod_produto"));
                objNotaFiscalDTO.setQuant_prod(rs.getString("quant_prod"));
                
                lista.add(objNotaFiscalDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "NotaFiscalDAO Pesquisar: " + erro);
        }
        return lista;    
   }
}
