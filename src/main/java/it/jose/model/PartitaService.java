package it.jose.model;

public class PartitaService {

    private static Partita p;

    public static Partita getP() {
        return p;
    }

    public static void setP(Partita p) {
        PartitaService.p = p;
    }

    public static boolean casellaSelezionata(int posizioneCasellaX, int posizioneCasellaY) {
        if (CampoService.casellaLibera(p.getC(), posizioneCasellaX, posizioneCasellaY)) {
            CampoService.modificaCasella(p.getC(), p.getGiocareTurno(), posizioneCasellaX, posizioneCasellaY);
            return true;
        }
        return false;
    }

    public static boolean controllaSeVittoria(char letteraGiocatore) {
        if (CampoService.controllaSeTris(p.getC(), letteraGiocatore)) {
            p.setVincitore(letteraGiocatore);
            return true;
        }
        return false;

    }

    public static boolean controllaSePartitaPuoContinuare() {
        return CampoService.controllaSeCaselleLibere(p.getC());

    }

}
