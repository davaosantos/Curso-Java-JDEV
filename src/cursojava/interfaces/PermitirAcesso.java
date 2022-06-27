package cursojava.interfaces;

/*Essa interface sera o contrato de autenticação*/
public interface PermitirAcesso {

    public boolean autenticar(String login, String senha);

    public boolean autenticar();

}
