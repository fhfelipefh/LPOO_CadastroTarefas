/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import modelo.Curso;

/**
 *
 * @author vanessalagomachado
 */
public class CursoController {
    // método para adicionar um item na lista
    public List<Curso> addCurso(Curso c, List<Curso> listaCursos){
        listaCursos.add(c);
        return listaCursos;
    }
    
    
}
