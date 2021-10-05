public class Materiale
{
    private String nume;
    private int marime;
    private int cantitate;

    public Materiale(String nume,int marime,int cantitate)
    {
        this.nume=nume;
        this.marime=marime;
        this.cantitate=cantitate;
    }
    public void setnume (String nume) {this.nume = nume; };
    public void setmarime (int marime) {this.marime = marime; };
    public void setcantitate (int cantitate) {this.cantitate = cantitate; };

    public String getnume () {return this.nume; };
    public int getmarime () {return this.marime; };
    public int getcantitate () {return this.cantitate; };

    public static Materiale[] GetMateriale(){
        Materiale scandura = new Materiale ("scandura", 20, 1000);
        Materiale paleti = new Materiale ("paleti", 30, 5050);
        Materiale bustean = new Materiale ("bustean", 100, 200);
        Materiale[] materialeleInMagazin = {scandura, paleti, bustean};
        return materialeleInMagazin;
    }


}
