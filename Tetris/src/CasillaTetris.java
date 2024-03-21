public class CasillaTetris {
    private int estado;//1=Vacío, 2=Bloque
    private int x,y;

    public CasillaTetris(int equis, int ygriega){
        estado = 1;
        x = equis;
        y = ygriega;
    }

    public int getEstado() {
        return estado;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
