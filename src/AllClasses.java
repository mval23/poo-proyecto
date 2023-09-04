import java.util.ArrayList;
import java.util.Date;



    // Clase abstracta Persona
    abstract class Persona {
        private String nombreCompleto;
        private int id;
        private String pais;

        public Persona(String nombreCompleto, int id, String pais) {
            this.nombreCompleto = nombreCompleto;
            this.id = id;
            this.pais = pais;
        }

        // Getters y setters para los atributos
        public String getNombreCompleto() {
            return nombreCompleto;
        }

        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }
    }

    // Clase Vehiculo
    class Vehiculo {
        private String marca;
        private String modelo;
        private int año;
        private String motor;
        private String nombre;

        public Vehiculo(String marca, String modelo, int año, String motor, String nombre) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
            this.motor = motor;
            this.nombre = nombre;
        }

        // Getters y setters para los atributos
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public String getMotor() {
            return motor;
        }

        public void setMotor(String motor) {
            this.motor = motor;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    // Clase Equipo
    class Equipo {
        private String nombre;
        private String pais;
        private ArrayList<Vehiculo> vehiculosDelEquipo;
        private ArrayList<Piloto> pilotos;

        public Equipo(String nombre, String pais, ArrayList<Vehiculo> vehiculosDelEquipo, ArrayList<Piloto> pilotos) {
            this.nombre = nombre;
            this.pais = pais;
            this.vehiculosDelEquipo = vehiculosDelEquipo;
            this.pilotos = pilotos;
        }

        // Getters y setters para los atributos
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public ArrayList<Vehiculo> getVehiculosDelEquipo() {
            return vehiculosDelEquipo;
        }

        public void setVehiculosDelEquipo(ArrayList<Vehiculo> vehiculosDelEquipo) {
            this.vehiculosDelEquipo = vehiculosDelEquipo;
        }

        public ArrayList<Piloto> getPilotos() {
            return pilotos;
        }

        public void setPilotos(ArrayList<Piloto> pilotos) {
            this.pilotos = pilotos;
        }
    }

    // Clase Piloto (hereda de Persona)
    class Piloto extends Persona {
        private Equipo equipo;
        private int puntosAcumulados;
        private int victorias;
        private int sanciones;
        private int cantidadPitStops;

        public Piloto(String nombreCompleto, int id, String pais, Equipo equipo, int puntosAcumulados, int victorias, int sanciones, int cantidadPitStops) {
            super(nombreCompleto, id, pais);
            this.equipo = equipo;
            this.puntosAcumulados = puntosAcumulados;
            this.victorias = victorias;
            this.sanciones = sanciones;
            this.cantidadPitStops = cantidadPitStops;
        }

        // Getters y setters para los atributos adicionales
        public Equipo getEquipo() {
            return equipo;
        }

        public void setEquipo(Equipo equipo) {
            this.equipo = equipo;
        }

        public int getPuntosAcumulados() {
            return puntosAcumulados;
        }

        public void setPuntosAcumulados(int puntosAcumulados) {
            this.puntosAcumulados = puntosAcumulados;
        }

        public int getVictorias() {
            return victorias;
        }

        public void setVictorias(int victorias) {
            this.victorias = victorias;
        }

        public int getSanciones() {
            return sanciones;
        }

        public void setSanciones(int sanciones) {
            this.sanciones = sanciones;
        }

        public int getCantidadPitStops() {
            return cantidadPitStops;
        }

        public void setCantidadPitStops(int cantidadPitStops) {
            this.cantidadPitStops = cantidadPitStops;
        }

        // Métodos adicionales
        public void registrarPitStop() {
            // Implementar la lógica para registrar un pit stop
        }

        public void calificarPiloto() {
            // Implementar la lógica para calificar al piloto
        }
    }

    // Clase Patrocinador (hereda de Persona)
    class Patrocinador extends Persona {
        private String tipoDePatrocinio;
        private double porcentajePatrocinio;

        public Patrocinador(String nombreCompleto, int id, String pais, String tipoDePatrocinio, double porcentajePatrocinio) {
            super(nombreCompleto, id, pais);
            this.tipoDePatrocinio = tipoDePatrocinio;
            this.porcentajePatrocinio = porcentajePatrocinio;
        }

        // Getters y setters para los atributos adicionales
        public String getTipoDePatrocinio() {
            return tipoDePatrocinio;
        }

        public void setTipoDePatrocinio(String tipoDePatrocinio) {
            this.tipoDePatrocinio = tipoDePatrocinio;
        }

        public double getPorcentajePatrocinio() {
            return porcentajePatrocinio;
        }

        public void setPorcentajePatrocinio(double porcentajePatrocinio) {
            this.porcentajePatrocinio = porcentajePatrocinio;
        }

        // Métodos adicionales
        public void reclamarPatrocinio() {
            // Implementar la lógica para reclamar el patrocinio
        }

        public void hacerContrato() {
            // Implementar la lógica para hacer un contrato
        }
    }

    // Clase DirectorCarrera (hereda de Persona)
    class DirectorCarrera extends Persona {
        private String licencia;

        public DirectorCarrera(String nombreCompleto, int id, String pais, String licencia) {
            super(nombreCompleto, id, pais);
            this.licencia = licencia;
        }

        // Getters y setters para los atributos adicionales
        public String getLicencia() {
            return licencia;
        }

        public void setLicencia(String licencia) {
            this.licencia = licencia;
        }

        // Métodos adicionales
        public void ponerSanciones() {
            // Implementar la lógica para poner sanciones
        }
    }

    // Clase Carrera
    class Carrera {
        private Date fecha;
        private String nombreCircuito;
        private double distancia;
        private double premioEnEfectivo;
        private String lugar;
        private ArrayList<Piloto> listaDePilotos;
        private ArrayList<Equipo> listaDeEquipos;
        private DirectorCarrera directorDeCarrera;
        private Campeonato campeonato;

        public Carrera(Date fecha, String nombreCircuito, double distancia, double premioEnEfectivo, String lugar, ArrayList<Piloto> listaDePilotos, ArrayList<Equipo> listaDeEquipos, DirectorCarrera directorDeCarrera, Campeonato campeonato) {
            this.fecha = fecha;
            this.nombreCircuito = nombreCircuito;
            this.distancia = distancia;
            this.premioEnEfectivo = premioEnEfectivo;
            this.lugar = lugar;
            this.listaDePilotos = listaDePilotos;
            this.listaDeEquipos = listaDeEquipos;
            this.directorDeCarrera = directorDeCarrera;
            this.campeonato = campeonato;
        }

        // Getters y setters para los atributos
        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getNombreCircuito() {
            return nombreCircuito;
        }

        public void setNombreCircuito(String nombreCircuito) {
            this.nombreCircuito = nombreCircuito;
        }

        public double getDistancia() {
            return distancia;
        }

        public void setDistancia(double distancia) {
            this.distancia = distancia;
        }

        public double getPremioEnEfectivo() {
            return premioEnEfectivo;
        }

        public void setPremioEnEfectivo(double premioEnEfectivo) {
            this.premioEnEfectivo = premioEnEfectivo;
        }

        public String getLugar() {
            return lugar;
        }

        public void setLugar(String lugar) {
            this.lugar = lugar;
        }

        public ArrayList<Piloto> getArrayListaDePilotos() {
            return listaDePilotos;
        }

        public void setArrayListaDePilotos(ArrayList<Piloto> listaDePilotos) {
            this.listaDePilotos = listaDePilotos;
        }

        public ArrayList<Equipo> getArrayListaDeEquipos() {
            return listaDeEquipos;
        }

        public void setArrayListaDeEquipos(ArrayList<Equipo> listaDeEquipos) {
            this.listaDeEquipos = listaDeEquipos;
        }

        public DirectorCarrera getDirectorDeCarrera() {
            return directorDeCarrera;
        }

        public void setDirectorDeCarrera(DirectorCarrera directorDeCarrera) {
            this.directorDeCarrera = directorDeCarrera;
        }

        public Campeonato getCampeonato() {
            return campeonato;
        }

        public void setCampeonato(Campeonato campeonato) {
            this.campeonato = campeonato;
        }

        // Métodos adicionales
        public void simularCarrera() {
            // Implementar la lógica para simular una carrera
        }

        public void calificarCarrera() {
            // Implementar la lógica para calificar una carrera
        }
    }

    // Clase Campeonato
    class Campeonato {
        private String nombreDelCampeonato;
        private int año;
        private ArrayList<Carrera> listaDeCarrerasDelCampeonato;
        private int cantidadCarreras;
        private ArrayList<Equipo> listaDeEquipos;

        public Campeonato(String nombreDelCampeonato, int año, ArrayList<Carrera> listaDeCarrerasDelCampeonato, int cantidadCarreras, ArrayList<Equipo> listaDeEquipos) {
            this.nombreDelCampeonato = nombreDelCampeonato;
            this.año = año;
            this.listaDeCarrerasDelCampeonato = listaDeCarrerasDelCampeonato;
            this.cantidadCarreras = cantidadCarreras;
            this.listaDeEquipos = listaDeEquipos;
        }

        // Getters y setters para los atributos
        public String getNombreDelCampeonato() {
            return nombreDelCampeonato;
        }

        public void setNombreDelCampeonato(String nombreDelCampeonato) {
            this.nombreDelCampeonato = nombreDelCampeonato;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public ArrayList<Carrera> getArrayListaDeCarrerasDelCampeonato() {
            return listaDeCarrerasDelCampeonato;
        }

        public void setArrayListaDeCarrerasDelCampeonato(ArrayList<Carrera> listaDeCarrerasDelCampeonato) {
            this.listaDeCarrerasDelCampeonato = listaDeCarrerasDelCampeonato;
        }

        public int getCantidadCarreras() {
            return cantidadCarreras;
        }

        public void setCantidadCarreras(int cantidadCarreras) {
            this.cantidadCarreras = cantidadCarreras;
        }

        public ArrayList<Equipo> getArrayListaDeEquipos() {
            return listaDeEquipos;
        }

        public void setArrayListaDeEquipos(ArrayList<Equipo> listaDeEquipos) {
            this.listaDeEquipos = listaDeEquipos;
        }
    }

    // Clase EquipoDeCarrera (hereda de Equipo)
    class EquipoDeCarrera extends Equipo {
        private ArrayList<Piloto> pilotosACompetir;
        private int partesDisponibles;
        private String contrato;
        private int puntosAcumulados;

        public EquipoDeCarrera(String nombre, String pais, ArrayList<Vehiculo> vehiculosDelEquipo, ArrayList<Piloto> pilotos, ArrayList<Piloto> pilotosACompetir, int partesDisponibles, String contrato, int puntosAcumulados) {
            super(nombre, pais, vehiculosDelEquipo, pilotos);
            this.pilotosACompetir = pilotosACompetir;
            this.partesDisponibles = partesDisponibles;
            this.contrato = contrato;
            this.puntosAcumulados = puntosAcumulados;
        }

        // Getters y setters para los atributos adicionales
        public ArrayList<Piloto> getPilotosACompetir() {
            return pilotosACompetir;
        }

        public void setPilotosACompetir(ArrayList<Piloto> pilotosACompetir) {
            this.pilotosACompetir = pilotosACompetir;
        }

        public int getPartesDisponibles() {
            return partesDisponibles;
        }

        public void setPartesDisponibles(int partesDisponibles) {
            this.partesDisponibles = partesDisponibles;
        }

        public String getContrato() {
            return contrato;
        }

        public void setContrato(String contrato) {
            this.contrato = contrato;
        }

        public int getPuntosAcumulados() {
            return puntosAcumulados;
        }

        public void setPuntosAcumulados(int puntosAcumulados) {
            this.puntosAcumulados = puntosAcumulados;
        }

        // Métodos adicionales
        public void calificarEquipo() {
            // Implementar la lógica para calificar un equipo de carrera
        }

        public void actualizarPartesDisponibles() {
            // Implementar la lógica para actualizar las partes disponibles del equipo
        }

        public void hacerContrato() {
            // Implementar la lógica para hacer un contrato con un equipo de carrera
        }

        public void disponibilidadPartes() {
            // Implementar la lógica para verificar la disponibilidad de partes del equipo
        }
    }

    // Clase VehiculoDeCarrera (hereda de Vehiculo)
    class VehiculoDeCarrera extends Vehiculo {
        private String estadoDeNeumaticos;
        private String estadoAleron;
        private String estadoFrenos;
        private int cantPitStops;
        private String estadoMotor;

        public VehiculoDeCarrera(String marca, String modelo, int año, String motor, String nombre, String estadoDeNeumaticos, String estadoAleron, String estadoFrenos, int cantPitStops, String estadoMotor) {
            super(marca, modelo, año, motor, nombre);
            this.estadoDeNeumaticos = estadoDeNeumaticos;
            this.estadoAleron = estadoAleron;
            this.estadoFrenos = estadoFrenos;
            this.cantPitStops = cantPitStops;
            this.estadoMotor = estadoMotor;
        }

        // Getters y setters para los atributos adicionales
        public String getEstadoDeNeumaticos() {
            return estadoDeNeumaticos;
        }

        public void setEstadoDeNeumaticos(String estadoDeNeumaticos) {
            this.estadoDeNeumaticos = estadoDeNeumaticos;
        }

        public String getEstadoAleron() {
            return estadoAleron;
        }

        public void setEstadoAleron(String estadoAleron) {
            this.estadoAleron = estadoAleron;
        }

        public String getEstadoFrenos() {
            return estadoFrenos;
        }

        public void setEstadoFrenos(String estadoFrenos) {
            this.estadoFrenos = estadoFrenos;
        }

        public int getCantPitStops() {
            return cantPitStops;
        }

        public void setCantPitStops(int cantPitStops) {
            this.cantPitStops = cantPitStops;
        }

        public String getEstadoMotor() {
            return estadoMotor;
        }

        public void setEstadoMotor(String estadoMotor) {
            this.estadoMotor = estadoMotor;
        }

        // Métodos adicionales
        public void abrirAleron() {
            // Implementar la lógica para abrir el alerón del vehículo de carrera
        }

        public void hacerManiobra() {
            // Implementar la lógica para realizar una maniobra con el vehículo de carrera
        }

        public void realizarPitStop() {
            // Implementar la lógica para realizar un pit stop con el vehículo de carrera
        }

        public void accidentarse() {
            // Implementar la lógica para simular un accidente con el vehículo de carrera
        }

        public void cambiarLlantas() {
            // Implementar la lógica para cambiar las llantas del vehículo de carrera
        }

        public void cambiarAleron() {
            // Implementar la lógica para cambiar el alerón del vehículo de carrera
        }

        public void cambiarMotor() {
            // Implementar la lógica para cambiar el motor del vehículo de carrera
        }

        public void cambiarFrenos() {
            // Implementar la lógica para cambiar los frenos del vehículo de carrera
        }

        public void realizarMantenimiento() {
            // Implementar la lógica para realizar mantenimiento al vehículo de carrera
        }
    }


