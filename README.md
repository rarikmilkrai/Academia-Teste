# Academia-Teste
classes=
package CadastroClienteAdmin;

import java.util.Scanner;

public class Academia {
    Pessoa pessoa = new Pessoa();
    
    Scanner leitura =  new Scanner(System.in);
    
    String nome;
    String dataNascimento;
    String telefone;
    String email;
    String senha;
}
===================================================================================================

package CadastroClienteAdmin;

public class Admin {
    private String nome;
    private String senha;

    public Admin(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        String admin = null;
        nome = admin;
        return null;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
==============================================================================================================================

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
===========================================================================================

 */
package CadastroClienteAdmin;


public class Pessoa {
    private String nome;
    private String username;
    private String dataNascimento;
    private String telefone;
    private String email;
    private String senha;

    public Pessoa(String nome, String username, String dataNascimento, String telefone, String email, String senha) {
        this.nome = nome;
        this.username = username;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
