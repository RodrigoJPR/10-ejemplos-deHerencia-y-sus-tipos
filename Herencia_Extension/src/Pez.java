
public class Pez extends Animal {
    private String habitatAcuatico;
    private boolean esCarnivoro;
    
    public Pez(String nombre, int tiempoVida, String habitatAcuatico, boolean esCarnivoro) {
        super(nombre, tiempoVida);
        this.habitatAcuatico = habitatAcuatico;
        this.esCarnivoro = esCarnivoro;
    }
    
    public void nadar() {
        System.out.println("El pez está nadando");
    }
    
    public String getHabitatAcuatico() {
        return habitatAcuatico;
    }
    
    public boolean esCarnivoro() {
        return esCarnivoro;
    }
}