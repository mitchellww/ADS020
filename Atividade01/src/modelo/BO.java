
package modelo;


public interface BO<T> {
    
    void validar(T entidade) throws NegocioException;
    
    /*listar*/ 
    
    void incluir(T entidade) throws NegocioException;
    
    void alterar(T entidade) throws NegocioException;
    
    void excluir(T entidade) throws NegocioException;
    
   /* consultar */
    
}
