
package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class CadastroMB {

    public String salvar() {
        
        return "lista.xhtml";
}
    public CadastroMB() {
        
       
                
    }

}
