package exemplu_clasic.clase;

public class ConexiuneBD {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBD instanta = null;

    private ConexiuneBD(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public String getNumeBaza() {
        return numeBaza;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public int getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    public static ConexiuneBD getInstanta() {
        return instanta;
    }

    public static void setInstanta(ConexiuneBD instanta) {
        ConexiuneBD.instanta = instanta;
    }

    @Override
    public String toString() {
        return "ConexiuneBD{" +
                "numeBaza='" + numeBaza + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConexiune='" + linkConexiune + '\'' +
                '}';
    }

    public static synchronized ConexiuneBD getInstance(String numeBaza, int nrTabele, String linkConexiune) {
        if (instanta == null) {
            instanta = new ConexiuneBD(numeBaza, nrTabele, linkConexiune);
        }

        return instanta;
    }
}
