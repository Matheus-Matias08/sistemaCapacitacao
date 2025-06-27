package entidades;

import java.util.SplittableRandom;

public class Curso {
    private double valor;
    private int vagas;
    private int id;
    private String foto;
    private String formarealizacao;
    private String ofertante;
    private String site;
    private String situacao;
    public Curso(){}

    public Curso(double valor, int vagas, int id, String foto, String formarealizacao, String ofertante, String site, String situacao) {
        this.valor = valor;
        this.vagas = vagas;
        this.id = id;
        this.foto = foto;
        this.formarealizacao = formarealizacao;
        this.ofertante = ofertante;
        this.site = site;
        this.situacao = situacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFormarealizacao() {
        return formarealizacao;
    }

    public void setFormarealizacao(String formarealizacao) {
        this.formarealizacao = formarealizacao;
    }

    public String getOfertante() {
        return ofertante;
    }

    public void setOfertante(String ofertante) {
        this.ofertante = ofertante;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "valor=" + valor +
                ", vagas=" + vagas +
                ", id=" + id +
                ", foto='" + foto + '\'' +
                ", formarealizacao='" + formarealizacao + '\'' +
                ", ofertante='" + ofertante + '\'' +
                ", site='" + site + '\'' +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}
