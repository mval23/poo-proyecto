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
      - lugar: String
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

**Descripción:** Esta funcionalidad se encarga de configurar y organizar un nuevo campeonato de carreras de automóviles.

**Clases involucradas:** `Campeonato`, `Carrera`, `Equipo`

**Métodos utilizados:**
1. Método en `Campeonato`: `prepararCampeonato(nombre: string)`
2. Método en `Campeonato`: `agregrCarrera(carrera: Carrera)`
3. Método en `Carrera`: `setCampeonato(campeonato: Campeonato)`
4. Método en `Campeonato`: `setEquipos(equipos: Equipo)`
5. Método en `Campeonato`: `setCantidadCarreras(cantidad: int)`
6. Método en `Patrocinador`: `hacerContrato(piloto: Piloto)`

**Notas:**
- Decir cuantas carreras
- Imprimir algo asi chevere como tablita
- Fecha general del campeonato

## Funcionalidad: Planear Grand Prix

**Descripción:** Esta funcionalidad se enfoca en la planificación de un evento de Grand Prix, definiendo lugar, fecha y distancia de la carrera.

**Clases involucradas:** `Carrera`, `Piloto`, `EquipoDeCarrera`, `DirectorCarrera`, `Patrocinador`

**Métodos utilizados:**
1. Método en `Carrera`: `setLugar(lugar: string)`
2. Método en `Carrera`: `setFecha(fecha: Date)`
3. Método en `Carrera`: `setDistancia(distancia: int)`
4. Método en `Carrera`: `setPremio(premio: float)`
5. Método en `Carrera`: `setPilotos(pilotos: [Piloto])`
6. Método en `Carrera`: `setDirector(DirectorCarrera: directorCarrera)`
7. Método en `Carrera`: `setEquipos(equipos: [EquipoDeCarrera])`
8. Método en `Piloto`: `setVehiculoCarrera(vehiculoCarrera: VehiculoCarrera)`
9. Método en `EquipoDeCarrera`: `setPilotos(pilotos: [Piloto])`

**Notas:**
- Dos pilotos por equipo

## Funcionalidad: Simulación de Grand Prix

**Descripción:** Simula la ejecución de una carrera de Grand Prix, calculando las posiciones y los tiempos.

**Clases involucradas:** `Carrera`, `VehiculoDeCarrera`, `DirectorCarrera`

**Métodos utilizados:**
1. Método en `Carrera`: `simularCarrera()`
2. Método en `VehiculoDeCarrera`: `abrirAleron()`
3. Método en `VehiculoDeCarrera`: `hacerManiobra()`
4. Método en `VehiculoDeCarrera`: `realizarPitStop()`
5. Método en `DirectorCarrera`: `ponerSancion()`
6. Método en `VehiculoDeCarrera`: `accidentarse()`

**Notas:**
- Dar puntos a los pilotos
- Si se accidenta solo se ponen al final con DNF (Did Not Finish)
- Se ponen sanciones si se accienta en la licencia del piloto
- hacerManiobra num random, aumenta la posicion, se accidenta

## Funcionalidad: Pits (Mantenimiento al Carro)

**Descripción:** Gestiona el proceso de parada en los pits para mantenimiento y ajustes de los vehículos durante una carrera.

**Clases involucradas:** `VehiculoDeCarrera`, `EquipoDeCarrera`, `Piloto`

**Métodos utilizados:**
1. Método en `VehiculoDeCarrera`: `realizarMantenimiento()`
2. Método en `Piloto`: `registrarPitStop(vehiculo: VehiculoDeCarrera)`
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

**Descripción:** Evalúa el rendimiento de los pilotos en una carrera, otorga puntos y premios a los mejores.

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

