
public class Main {
public static void main(String []args) {
	
Avion avion= new Avion();
avion.Volar();
avion.Descender();

Dron dron =new Dron();
dron.Volar();
dron.Descender();

Planeadores planeadores = new Planeadores();
planeadores.Volar();
planeadores.Correr();
planeadores.Descender();

Cohete cohete = new Cohete();
cohete.Despegar();
cohete.Volar();

Papalote papalote= new Papalote();
papalote.Alzar();
papalote.Volar();
papalote.Descender();

UAV uav = new UAV();
uav.Volar();
uav.CapturarImagenes();
uav.Descender();

Helicoptero helicoptero = new Helicoptero();
helicoptero.Volar();
helicoptero.Descender();
helicoptero.Rotar360grados();

Dirigible dirigible = new Dirigible();
dirigible.Volar();
dirigible.Navegar();
dirigible.Descender();

Superman superman = new Superman();
superman.Volar();
superman.Descender();
superman.Correr();

Pajaro pajaro = new Pajaro();
pajaro.Volar();
pajaro.Descender();
pajaro.Cazar();

SimuladorDeAvion avionSimulator = new SimuladorDeAvion();
avionSimulator.Iniciar();
avionSimulator.Volar();
avionSimulator.Descender();
avionSimulator.Detener();
}



	
}