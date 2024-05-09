package it.jose.model;

public class Partita {
    private Campo c;
    private char giocareTurno;
    private char vincitore=' ';

    public Partita(Campo c, char giocareTurno) {
        this.c = c;
        this.giocareTurno = giocareTurno;
    }

    public Campo getC() {
        return c;
    }

    public void setC(Campo c) {
        this.c = c;
    }

    public char getGiocareTurno() {
        return giocareTurno;
    }

    public void setGiocareTurno(char giocareTurno) {
        this.giocareTurno = giocareTurno;
    }

    public char getVincitore() {
        return vincitore;
    }

    public void setVincitore(char vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "Partita [c=" + c + ", giocareTurno=" + giocareTurno + ", vincitore=" + vincitore + "]";
    }

    
    
}
