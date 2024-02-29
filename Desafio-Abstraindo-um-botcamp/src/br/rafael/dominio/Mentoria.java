package br.rafael.dominio;


public class Mentoria  extends Conteudo{

    @Override
    public Double calcular_Xp() {
        return xp_padrao + 10d;
    }

    @Override
    public String toString() {
        return "titulo: " + getTitulo() + " ,descricao: " + getDescricao() + " ,data: " + getData()+ "//" ;
    }
    
}
