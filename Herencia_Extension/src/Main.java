public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal Genérico", 10);
        animal.comer();
        
        Mamifero mamifero = new Mamifero("Mamífero Genérico", 15, "Bosque", true);
        mamifero.comer();
        mamifero.amamantar();
        
        Ave ave = new Ave("Ave Genérica", 5, 1.2, true);
        ave.comer();
        ave.volar();
        
        Reptil reptil = new Reptil("Reptil Genérico", 8, "Escamas Rugosas", false);
        reptil.comer();
        reptil.arrastrarse();
        
        Pez pez = new Pez("Pez Genérico", 3, "Agua Dulce", true);
        pez.comer();
        pez.nadar();
        
        Anfibio anfibio = new Anfibio("Anfibio Genérico", 4, true, true);
        anfibio.comer();
        anfibio.saltar();
        
        Insecto insecto = new Insecto("Insecto Genérico", 1, 6, true);
        insecto.comer();
        insecto.volar();
        
        Felino felino = new Felino("Felino Genérico", 12, "Selva", true, "León", true);
        felino.comer();
        felino.amamantar();
        felino.cazar();
        
        Canino canino = new Canino("Canino Genérico", 10, "Casa", true, "Labrador", true);
        canino.comer();
        canino.amamantar();
        canino.ladrar();
        
        Roedor roedor = new Roedor("Roedor Genérico", 3, "Campo", true, true, true);
        roedor.comer();
        roedor.amamantar();
        roedor.hacerRuido();
        
        AveDePresa aveDePresa = new AveDePresa("Ave de Presa Genérica", 8, 1.5, true, true);
        aveDePresa.comer();
        aveDePresa.volar();
        aveDePresa.cazarPresas();
    }
}