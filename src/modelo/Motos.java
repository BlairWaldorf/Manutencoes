/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Jefferson Mendes
 */
public class Motos {

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the manutencao
     */
    public Date getManutencao() {
        return manutencao;
    }

    /**
     * @param manutencao the manutencao to set
     */
    public void setManutencao(Date manutencao) {
        this.manutencao = manutencao;
    }

    /**
     * @return the kmContratado
     */
    public Float getKmContratado() {
        return kmContratado;
    }

    /**
     * @param kmContratado the kmContratado to set
     */
    public void setKmContratado(Float kmContratado) {
        this.kmContratado = kmContratado;
    }

    /**
     * @return the kmAnterior
     */
    public Float getKmAnterior() {
        return kmAnterior;
    }

    /**
     * @param kmAnterior the kmAnterior to set
     */
    public void setKmAnterior(Float kmAnterior) {
        this.kmAnterior = kmAnterior;
    }

    /**
     * @return the kmAtual
     */
    public Float getKmAtual() {
        return kmAtual;
    }

    /**
     * @param kmAtual the kmAtual to set
     */
    public void setKmAtual(Float kmAtual) {
        this.kmAtual = kmAtual;
    }

    /**
     * @return the rodagem
     */
    public Float getRodagem() {
        return rodagem;
    }

    /**
     * @param rodagem the rodagem to set
     */
    public void setRodagem(Float rodagem) {
        this.rodagem = rodagem;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the objetoManutencao
     */
    public String getObjetoManutencao() {
        return objetoManutencao;
    }

    /**
     * @param objetoManutencao the objetoManutencao to set
     */
    public void setObjetoManutencao(String objetoManutencao) {
        this.objetoManutencao = objetoManutencao;
    }

    /**
     * @return the valorUnitario
     */
    public Float getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    /**
     * @return the valorComposto
     */
    public Float getValorComposto() {
        return valorComposto;
    }

    /**
     * @param valorComposto the valorComposto to set
     */
    public void setValorComposto(Float valorComposto) {
        this.valorComposto = valorComposto;
    }

    /**
     * @return the justificativa
     */
    public String getJustificativa() {
        return justificativa;
    }

    /**
     * @param justificativa the justificativa to set
     */
    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }
    private String placa;
    private Date manutencao;
    private Float kmContratado;
    private Float kmAnterior;
    private Float kmAtual;
    private Float rodagem;
    private int qtd;
    private String objetoManutencao;
    private Float valorUnitario;
    private Float valorComposto;
    private String justificativa;
    

}
