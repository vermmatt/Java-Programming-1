public class DateDemo {
    public static void main(String[] args) {
        Date eenDatum = new Date("11/11/2013");
        System.out.println(eenDatum.getDatum());
        System.out.println(eenDatum.getDag());
        System.out.println(eenDatum.getMaand());
        System.out.println(eenDatum.getJaar());
        eenDatum.volgendeDag();
        Date volgendeDatum = new Date("12/11/2013");
        System.out.println(eenDatum.getDatum());
        System.out.println(eenDatum.equals(volgendeDatum));
        Date schrikkel = new Date("29/02/2012");
        System.out.println(schrikkel.isGeldigeDatum(schrikkel.getDag(), schrikkel.getMaand(), schrikkel.getJaar()));
        schrikkel = new Date("29/02/2013");
        System.out.println(schrikkel.isGeldigeDatum(schrikkel.getDag(), schrikkel.getMaand(), schrikkel.getJaar()));
        eenDatum.setDatum(13, 3,1928);
        System.out.println(eenDatum.getDatum());
        System.out.println(eenDatum.isVroeger(schrikkel));
    }
}
