public class Book {
    private String auteur;
    private String titel;
    private int paginas;
    private boolean ontleend;

    public Book(String auteur, String titel, int paginas) {
        this.auteur = auteur;
        this.titel = titel;
        this.paginas = paginas;
        this.ontleend = false;
    }

    public Book() {
        this("onbekend", "onbekend", 0);
    }

    public String getAuteur() {
        return auteur;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getTitel() {
        return titel;
    }

    public boolean getOntleend() {
        return ontleend;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setOntleend(boolean ontleend) {
        this.ontleend = ontleend;
    }

    public void printDetails() {
        System.out.println("Het boek " + titel.toUpperCase() + " ("
                + paginas + "pagina's), geschreven door " + auteur.toUpperCase() + " is momenteel");
        System.out.println(ontleend ? "ontleend." : "niet ontleend.");
    }
}
