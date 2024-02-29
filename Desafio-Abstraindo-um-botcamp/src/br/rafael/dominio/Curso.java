package br.rafael.dominio;

public class Curso extends Conteudo{
    
    @Override
    public Double calcular_Xp() {
        return xp_padrao * getCargaHoraria(); 
    }


    @Override
    public String toString() {
        return "titulo: " + getTitulo() + " ,descricao: " + getDescricao() + " ,cargaHoraria: " + getCargaHoraria() + "//";
    }


    
    
}
