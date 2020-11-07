public class Verzameling {
    private int MAX_AANTAL = 9;
    private Film[] films;
    private int index = 0;
    private boolean isVol;

    public Verzameling() {
        films = new Film[MAX_AANTAL];
    }

    public Film[] getFilms() {
        return films;
    }

    public int getIndex() {
        return index;
    }

    public boolean isVol() {
        return isVol;
    }

    public void voegFilmToe(Film film) {
        if(index >= MAX_AANTAL) {
            isVol = true;
        } else {
            films[index] = film;
            index++;
        }
    }
}
