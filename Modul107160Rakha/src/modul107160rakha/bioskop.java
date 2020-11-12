package modul107160rakha;

class bioskop {

    String film;
    String fnama;
    private String lnama;
    private String Tanggal;
    private String notelp;
    private String filmnew;


    public bioskop(String film, String fnama, String lnama, String notelp, String Tanggal, String filmnew) {
        this.film = film;
        this.fnama = fnama;
        this.lnama = lnama;
        this.Tanggal = Tanggal;
        this.notelp = notelp;
        this.filmnew = filmnew;

    }

    public String getFilmnew() {
        return filmnew;
    }

    
    public String getFilm() {
        return film;
    }

    public String getFnama() {
        return fnama;
    }

    public String getLnama() {
        return lnama;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public String getNotelp() {
        return notelp;
    }

}
