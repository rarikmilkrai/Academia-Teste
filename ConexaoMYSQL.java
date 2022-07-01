/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastroClienteAdmin;

import com.sun.jdi.connect.spi.Connection;


public class ConexaoMYSQL {
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;
    
    public ConexaoMYSQL(){
        this.servidor = "localhost";
        this.banco = "Clientes";
        this.usuario = "root";
        this.senha = "root";
        
    }
    
    public boolean conectar(){
       try
       {
           this.conexao = DriveManager.getConnection("jdbc:mysql://"+this.servidor"/"+this.banco"/"this.usuario"/"this.senha);
           return true;  
       }
       catch(SQLException ex){
           throw new RuntimeException(ex);
       }
    }
    public Connection getConnection(){
        return conexao;
    }
}
