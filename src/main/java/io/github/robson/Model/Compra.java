package io.github.robson.Model;

import io.github.robson.Enum.OrdemStatus;

public class Compra {

    /**
     *  variable
     */
    private String nome;
    private Double preco;
    private Integer ordemStatus;

    /**
     * @param nome
     * @param preco
     * @param ordemStatus
     */
    public Compra(String nome, double preco, OrdemStatus ordemStatus) {
        this.nome = nome;
        this.preco = preco;
        setOrdemStatus(ordemStatus);
    }

    /**
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * @return ordemStatus
     */
    public OrdemStatus getOrdemStatus() {
        return OrdemStatus.valueOf(ordemStatus);
    }

    /**
     * @param ordemStatus
     */
    public void setOrdemStatus(OrdemStatus ordemStatus) {
        if(ordemStatus != null) {
            this.ordemStatus = ordemStatus.getCode();
        }
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Compra{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                // Salva o ordemStatus no banco no formato Integer
                ", ordemStatus=" + ordemStatus +
                //  Mostra a String do ordemStatus para View
                ", ordemStatus=" + getOrdemStatus() +
                '}';
    }
}
