public class DAB_Radio {
    private boolean status;
    private int zenderNummer = 1;

    public boolean getStatus() {
        return status;
    }

    public void setZender(int zenderNummer) {
        this.zenderNummer = zenderNummer;
    }

    public void aan() {
        this.status = true;
    }

    public void uit() {
        this.status = false;
    }

    private final String[] zenderNamen = new String[]{
            "Radio 1", "Radio 2", "Klara", "Stu Bru", "MNM",
            "Continue", "Sporza", "Nieuws+", "MNM Hits"
    };

    public String getResponse() {
        if(!status) {
            return "Zet de radio eerst aan!";
        } else if(zenderNummer > 9 || zenderNummer < 1) {
            return "Geen geldig zendernummer!";
        } else {
            return "U luistert naar " + zenderNamen[zenderNummer - 1]
                    + " (zender nr " + zenderNummer + ")";
        }
    }
}
