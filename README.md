# Estructura del Proyecto de la Fédération Internationale de l'Automobile


Aquí se ubicarán las clases relacionadas con la lógica de negocio.

## Clases en el paquete "modeloNegocio"


1. **Clase `Vehiculo`**
    - Atributos: 
      - marca: String
      - modelo: String
      - ano: int
      - motor: String
      - nombre: String
    - Métodos
      - getters y setters 

2. **Clase `Equipo`**
   - Atributos
     - nombre: String
     - pais: String
     - vehiculos: ArrayList<Vehiculo>
     - pilotos: ArrayList<Piloto>       
     - contrato: boolean
   - Métodos
     - getters y setters para los atributos

3. **Clase `Piloto`** (hereda de `Persona`)
   - Atributos
     - equipo: Equipo
     - puntos: int
     - victorias: int
     - contrato: boolean
     - sanciones: int
     - cantidadPitStops: int
     - dinero: int
     - vehiculoCarrera: VehiculoCarrera
   - Métodos: 
     - getters y setters para los atributos
     - agregarVictorias(): void 
     - agregarSanciones(int): void
     - registrarPitStop(): void
     - calificarPiloto(): void
     - agregarPuntos(int): void

4. **Clase `Patrocinador`** (hereda de `Persona`)
   - Atributos
     - tipoPatrocinio: String
     - porcentajePatrocinio: int
     - dinero: double
   - Métodos
     - getters y setters
     - reclamarPatrocinio(): int
     - hacerContrato(equipo: Equipo): void

5. **Clase `DirectorCarrera`** (hereda de `Persona`)
    - Atributos: 
      - licencia
    - Métodos: 
      - getters y setters para los atributos 
      + ponerSanciones(piloto: Piloto): void
      + renovarLicencia(): void

6. **Clase `Carrera`**
    - Atributos
      - fecha: Date
      - nombreCircuito: String
      - distancia: double
      - premioEfectivo: double
      - lugar: String - es un enum, cada ciudad trae la distancia
      - directorCarrera: DirectorCarrera
      - campeonato: Campeonato
      - puestos: ArrayList<Piloto>
      - equiposCarrera: ArrayList<EquiposCarrera>
    - Métodos: 
      - getters y setters para los atributos=
      - simularCarrera(): void
      + premiacion(): void

7. **Clase `Campeonato`**
    - Atributos
      - nombre: String
      - ano: int
      - listaCarreras: ArrayList<Carrera>
      - cantidadCarreras: int
      - listaEquipos: ArrayList<EquiposCarrera>
    - Métodos:
      - getters y setters para los atributos
      - planearCampeonato(): void
      + agregarCarrera(carrera: Carrera): void
      + premiacion(): void

### Clases adicionales que implementan herencia

1. **Clase `EquipoDeCarrera`** (hereda de `Equipo`)
    - Atributo adicional: 
      - pilotosCompetir: ArrayList<Piloto>
      - puntos: int
      - partesDisponibles: ArrayList<String>
    - Métodos adicionales: 
      - getters y setters para el atributo adicional
      + calificarEquipo(): void
      + disponibilidadParte(parte: String): void
      + actualizarParte(parte: String): void

2. **Clase `VehiculoDeCarrera`** (hereda de `Vehiculo`)
    - Atributo adicional: 
      - estadoNeumaticos: boolean
      - estadoAleron: boolean
      - estadoFrenos: boolean
      - estadoMotor: boolean
      - cantPitStops: int
    - Métodos adicionales:
      + abrirAleron(): void
      + hacerManiobra(): void
      + realizarPitStop(): void
      + cambiarLlantas(equipo: Equipo): void
      + cambiarMotor(equipo: Equipo): void
      + cambiarFrenos(equipo: Equipo): void
      + cambiarAleron(equipo: Equipo): void
      + realizarMantenimiento(): void

### Clases abstacta

1. **Clase `Persona`**
    - Atributo : 
       - nombreCompleto: String
       - id: int
       - pais: String
    - Métodos adicionales: getters y setters.

### Estructura

### Estructura del Proyecto

- gestorAplicación
   - paddock
      - Persona
      - Vehiculo
      - Piloto
      - Patrocinador
   - campeonato
      - DirectorCarrera
      - Campeonato
      - Equipo
      - EquipoDeCarrera 
      - EquipoPatrocinado 
      - VehiculoDeCarrera
      - Carrera
   
## Funcionalidad: Preparar Campeonato

**Descripción:** Esta funcionalidad se encarga de configurar y organizar un nuevo campeonato de carreras de F1 a partir de la asignación del campeonato, las carreras que se harán y los equipos que participarán.

**Clases involucradas:** `Campeonato`, `Carrera`, `Equipo`, `Patrocinador`, `EquipoCarrera`, `Piloto`

**Métodos utilizados:**
1. Método en `Campeonato`: `prepararCampeonato(nombre: string)`
2. Método en `Campeonato`: `agregrCarrera(carrera: Carrera)`
3. Método en `Carrera`: `setCampeonato(campeonato: Campeonato)`
4. Método en `Campeonato`: `setEquipos(equipos: Equipo)`
5. Método en `EquipoCarrera`: `setPilotos(piloto1: Piloto, piloto1: Piloto)`
6. Método en `Campeonato`: `setCantidadCarreras(cantidad: int)`
7. Método en `Patrocinador`: `hacerContrato(piloto: Piloto)`
8. Método en `Patrocinador`: `hacerContrato(equipo: Equipo)`

**Notas:**
- Decir cuantas carreras
- Revisar que los pilotos tengan contratos
- Revisar que los equipos tengan contratos
- Imprimir algo asi chevere como tablita
- Fecha general del campeonato

## Funcionalidad: Planear Grand Prix

**Descripción:** Esta funcionalidad se encarga de la planeación de cada carrera, definiendo el lugar, la fecha, la distancia, el premio, los pilotos que competirán de acuerdo al equipo, el encargado de la dirección de la carrera y los patrocinadores de cada equipo
**Clases involucradas:** `Carrera`, `Piloto`, `EquipoDeCarrera`, `DirectorCarrera`, `VehiculoDeCarrera`

**Métodos utilizados:**
1. Método en `Carrera`: `setLugar(lugar: string)`
2. Método en `Carrera`: `setFecha(fecha: Date)`
3. Método en `Carrera`: `setDistancia(distancia: int)`
4. Método en `Carrera`: `setPremio(premio: float)`
5. Método en `Carrera`: `setDirector(DirectorCarrera: directorCarrera)`
6. Método en `Carrera`: `setEquipos(equipos: [EquipoDeCarrera])`
7. Método en `Piloto`: `setVehiculoCarrera(vehiculoCarrera: VehiculoCarrera)`

**Notas:**
- Dos pilotos por equipo

## Funcionalidad: Simulación de Grand Prix

**Descripción:** Esta funcionalidad se encarga de simular la ejecución de una carrera de Grand prix, asignando posiciones, puntuaciones, sanciones y tiempos. Es aquí donde se darán las especificaciones de cada vehículo asignado a cada piloto para determinada carrera.

**Clases involucradas:** `Carrera`, `VehiculoDeCarrera`, `DirectorCarrera`, `Piloto`

**Métodos utilizados:**
1. Método en `Carrera`: `simularCarrera()`
2. Método en `VehiculoDeCarrera`: `abrirAleron()`
3. Método en `VehiculoDeCarrera`: `hacerManiobra()`
4. Método en `VehiculoDeCarrera`: `realizarPitStop()`
5. Método en `DirectorCarrera`: `ponerSancion()`
6. Método en `VehiculoDeCarrera`: `accidentarse()`
7. Método en `Piloto`: `agregarPuntos()`

**Notas:**
- Dar puntos a los pilotos
- Si se accidenta solo se ponen al final con DNF (Did Not Finish)
- Se ponen sanciones si se accienta en la licencia del piloto
- hacerManiobra num random, aumenta la posicion, se accidenta

## Funcionalidad: Pits (Mantenimiento al Carro)

**Descripción:** Esta funcionalidad se encarga de gestionar el proceso en parada de boxes de cada piloto con su respectivo vehículo, es acá donde el equipo técnico le da mantenimiento a cada vehículo durante una carrera por medio del cambio de partes de la carrocería de acuerdo a la disponibilidad de las mismas. Estas paradas pueden afectar en el resultado final de la carrera tanto en puntaje como en posición.

**Clases involucradas:** `VehiculoDeCarrera`, `EquipoDeCarrera`, `Piloto`

**Métodos utilizados:**
1. Método en `VehiculoDeCarrera`: `realizarMantenimiento()`
2. Método en `Piloto`: `agregarPitStop(vehiculo: VehiculoDeCarrera)`
3. Método en `EquipoDeCarrera`: `actualizarPartesDisponibles(parte: String)`
4. Método en `EquipoDeCarrera`: `disponibilidadPartes(parte: String)`
5. Método en `VehiculoDeCarrera`: `cambiarLlantas()`
6. Método en `VehiculoDeCarrera`: `cambiarAleron()`
7. Método en `VehiculoDeCarrera`: `cambiarMotor()`
8. Método en `VehiculoDeCarrera`: `cambiarFrenos()`
9. Método en `VehiculoDeCarrera`: `realizarMantenimiento()`

**Notas:**
- Cambia las posiciones
- Dar puntos
- Mirar si el equipo tiene partes disponibles
- Si no hace pit stop -> sancion

## Funcionalidad: Calificar Rendimiento en una Carrera y Premiación del Grand Prix

**Descripción:** Esta funcionalidad evalúa los resultados de cada carrera, a nivel de piloto y equipo técnico, se califica cada uno de estos aspectos con un puntaje y de acuerdo a las posiciones se otorgan los premios. Tambien permite el pago de los patrocinadores a sus respectivos equipos.

**Clases involucradas:** `Carrera`, `Piloto`, `EquipoDeCarrera`, `Patrocinador`

**Métodos utilizados:**
1. Método en `Carrera`: `premiacion()`
2. Método en `Piloto`: `calificarPiloto(puntos: int)`
3. Método en `EquipoDeCarrera`: `calificarEquipo(puntos: int)`
4. Método en `Patrocinador`: `reclamarPatrocinio(dinero: float)`
5. Metodo en `DirectorCarreta`: `ponerSancion(piloto: Piloto)`
   
**Notas:**
- Tablita chevere
- Poner tiempos
- Poner posiciones
- Poner puntos
- Poner premios
- Poner sanciones


## Notas Adicionales
- cada carrera tiene contratos, si tiene entra a la programacion del campeonato
- cada equipo tiene 5 motores disponibles para el campeonato
- le hacen partes para controlar
- si se pasan de partes 

