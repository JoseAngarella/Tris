package it.jose.model;

public class Campo {

    private char[][] caselle = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

    public Campo() {
    }

    public char[][] getCaselle() {
        return caselle;
    }

    public void setCaselle(char[][] caselle) {
        this.caselle = caselle;
    }

    @Override
    public String toString() {
        return "Campo [caselle=" + caselle.toString() + "]";
    }

}
