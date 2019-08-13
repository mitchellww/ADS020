
package modelo;

import java.util.List;
import modelo.persistencia.DadosException;


public interface BO<T> {
    
    void validar(T entidade) throws NegocioException;
    
    List<T> listar() throws DadosException;
    
    void incluir(T entidade) throws NegocioException;
    
    void alterar(T entidade) throws NegocioException;
    
    void excluir(T entidade) throws NegocioException;
    
   T consultar() throws DadosException;
    
}
