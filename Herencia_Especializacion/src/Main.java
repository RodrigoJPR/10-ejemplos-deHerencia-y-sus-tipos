
public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Ford",2008,4,true,"Lobo");
        
        System.out.println("Marca: " + automovil.getMarca());
        System.out.println("Lanzamiento en: " + automovil.getAño());
        System.out.println("Capacidad de Pasajeros: " + automovil.getCapacidadPasajeros());
        System.out.println("Tiene Aire Acondicionado: " + automovil.tieneAireAcondicionado());
        System.out.println("Modelo: " + automovil.getModelo());
        System.out.println("Color: " + automovil.getColor());
        automovil.conducir();
        automovil.transportarPersonas();
        
        Camion camion = new Camion("Mercedes",2010);
        camion.conducir();
        camion.transportarCarga();
        
        Motocicleta motocicleta = new Motocicleta("italika",2019);
        motocicleta.conducir();
        motocicleta.conducirRapido();
        
        Bicicleta bicicleta = new Bicicleta("BIKERS",2020);
        bicicleta.pedalear();
        
        Avion avion = new Avion("AMPER",2023);
        avion.conducir();
        avion.volar();
        
        Barco barco = new Barco("BOATS´FAST",2004);
        barco.conducir();
        barco.navegar();
        
        Tren tren = new Tren("RIELS",2000);
        tren.conducir();
        tren.viajarPorVias();
        
        Tractor tractor = new Tractor("FERRARI",2020);
        tractor.conducir();
        tractor.trabajarEnElCampo();
        
        Helicoptero helicoptero = new Helicoptero("STARK'INDUSTRIES",2023);
        helicoptero.conducir();
        helicoptero.volarVerticalmente();
    }
}