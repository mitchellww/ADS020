/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import ejb.AlunoFacade;
import entity.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;


import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author 17214290001
 */
@Named(value="alunoMB")
@RequestScoped
public class AlunoMB {
    
    @EJB
    private AlunoFacade ejb;

    private Aluno aluno = new Aluno();

    public AlunoMB() {
    }

    public List<Aluno> listar() {
        

        return ejb.findAll();

    }

    public String incluir() {

        return "cadastro";
    }

    public String salvar(){

        
        if(aluno.getId() > 0){
            ejb.edit(aluno);
        }else ejb.create(aluno);
        
        return "lista";
    }

    public String alterar(){

      

        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String id = params.get("id");
        aluno.setId(Integer.valueOf(id));

        aluno = ejb.find(id);

        return "cadastro";

    }
    
    public String excluir(){
        
        
        
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String id = params.get("id");
        aluno.setId(Integer.valueOf(id));
        
        ejb.find(id);
        ejb.remove(aluno);
        
        return "lista?faces-redirect=true";
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
