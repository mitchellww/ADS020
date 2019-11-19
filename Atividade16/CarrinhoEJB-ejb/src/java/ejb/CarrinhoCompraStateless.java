/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author 17214290001
 */
@Stateless
@Local(CarrinhoCompraLocal.class)
public class CarrinhoCompraStateless implements CarrinhoCompraLocal{

    private List<String> lista = new ArrayList<>();
    
    @Override
    public void adicionarItem(String s) throws EJBException {
        
        System.out.println("Item + s +  adicionado ao carrinho");
    }

    @Override
    public List<String> listarItens() throws EJBException {
        
       System.out.println("Listando itens do carrinho");
        
       return lista;
    }

    
    
}
