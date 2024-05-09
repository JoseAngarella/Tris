package it.jose.model;

public class CampoService {

    public static boolean controllaSeTris(Campo c, char letteraGiocatore) {
        boolean risultato = false;
        // controllo orizzontali e verticali
        for (int i = 0; i < 3; i++) {
            // orizzontali
            if (c.getCaselle()[i][0] == letteraGiocatore && c.getCaselle()[i][1] == letteraGiocatore
                    && c.getCaselle()[i][2] == letteraGiocatore) {
                risultato = true;
                break;
                // verticali
            } else if (c.getCaselle()[0][i] == letteraGiocatore && c.getCaselle()[1][i] == letteraGiocatore
                    && c.getCaselle()[2][i] == letteraGiocatore) {
                risultato = true;
                break;
            }
        }
        // controllo diagonali
        if (c.getCaselle()[0][0] == letteraGiocatore && c.getCaselle()[1][1] == letteraGiocatore
                && c.getCaselle()[2][2] == letteraGiocatore) {
            risultato = true;
        }
        if (c.getCaselle()[0][2] == letteraGiocatore && c.getCaselle()[1][1] == letteraGiocatore
                && c.getCaselle()[2][0] == letteraGiocatore) {
            risultato = true;
        }

        return risultato;
    }

    public static boolean casellaLibera(Campo c, int posizioneCasellaX, int posizioneCasellaY) {
        if (c.getCaselle()[posizioneCasellaX][posizioneCasellaY] == ' ') {
            return true;
        }
        return false;
    }

    public static void modificaCasella(Campo c, char letteraGiocatore, int posizioneCasellaX,
            int posizioneCasellaY) {
        char[][] caselle = c.getCaselle();
        caselle[posizioneCasellaX][posizioneCasellaY] = letteraGiocatore;
        c.setCaselle(caselle);
    }

    public static boolean controllaSeCaselleLibere(Campo c) {
        boolean caselleTutteOccupate = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (c.getCaselle()[i][j] == ' ') {
                    caselleTutteOccupate = false;
                    break;
                }
            }
        }
        return !caselleTutteOccupate;
    }

}
