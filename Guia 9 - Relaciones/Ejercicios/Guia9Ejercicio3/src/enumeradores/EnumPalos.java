package enumeradores;

public enum EnumPalos {
    ESPADA("Espada", 1), BASTO("Basto", 2), COPA("Copa", 3), ORO("Oro", 4);
    String palos;
    Integer indice;

    private EnumPalos(String palos, Integer indice) {
        this.palos = palos;
        this.indice = indice;
    }

    public String getPalos() {
        return palos;
    }

    public void setPalos(String palos) {
        this.palos = palos;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return indice + ". " + palos;
    }

}
