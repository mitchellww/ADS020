
import dao.ContatoDAO;
import entidades.Contato;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 17214290001
 */
public class TestaJPA {

    public static void main(String[] args) {

        ContatoDAO dao = new ContatoDAO();
        Contato contato = new Contato();
        Contato contato1 = new Contato();
        Contato contato2 = new Contato();
        Contato contato3 = new Contato();
        Contato contato4 = new Contato();
        Contato contato5 = new Contato();

        contato.setNome("Nathalia1");
        contato.setTelefone(111);

        contato1.setNome("Nathalia2");
        contato1.setTelefone(222);

        contato2.setNome("Nathalia3");
        contato2.setTelefone(333);

        contato3.setNome("Nathalia4");
        contato3.setTelefone(444);

        contato4.setNome("Nathalia5");
        contato4.setTelefone(555);

        contato5.setNome("Nathalia6");
        contato5.setTelefone(666);

        dao.persist(contato);
        dao.persist(contato1);
        dao.persist(contato2);
        dao.persist(contato3);
        dao.persist(contato4);
        dao.persist(contato5);

        contato4.setNome("Nathalias2");
        contato4.setTelefone(999);
        
        dao.merge(contato4);
        
        
        contato2 = dao.find(3);
                
        dao.remove(contato2);
        
        
                
        for (Contato c : dao.list()) {
            System.out.println(c);
        }

    }

}
