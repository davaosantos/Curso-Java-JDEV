package cursojava.classesAuxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tem o contrato da interface de permitirAcesso e chamar o autenticar*/
public class FuncaoAutenticacao {
    public boolean autenticarCursoJava(PermitirAcesso acesso){
        return acesso.autenticar();
    }
}
