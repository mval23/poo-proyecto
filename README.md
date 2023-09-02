# Estructura del Proyecto de la Fédération Internationale de l'Automobile


Aquí se ubicarán las clases relacionadas con la lógica de negocio.

## Clases en el paquete "modeloNegocio"


1. **Clase `Vehiculo`**
    - Atributos: 
      - marca
      - modelo
      - año
      - motor
      - nombre.
    - Métodos
      - getters y setters para los atributos

2. **Clase `Equipo`**
   - Atributos
     - nombre
     - país
     - vehículos del equipo
     - pilotos
   - Métodos
     - getters y setters para los atributos

3. **Clase `Piloto`** (hereda de `Persona`)
   - Atributos
     - equipo
     - puntos acumulados
     - victorias
     - sanciones
     - cantidad pits stops
   - Métodos: 
     - getters y setters para los atributos
     - registrarPitStop 
     - calificarPiloto

4. **Clase `Patrocinador`** (hereda de `Persona`)
   - Atributos
     - tipo de patrocinio
     - porcentaje patrocinio.
   - Métodos
     - getters y setters
     - reclamar patrocinio
     - hacer contrato.

5. **Clase `DirectorCarrera`** (hereda de `Persona`)
    - Atributos: 
      - licencia
    - Métodos: 
      - getters y setters para los atributos 
      - poner sanciones

6. **Clase `Carrera`**
    - Atributos
      - fecha
      - nombreCircuito
      - distancia
      - premio en efectivo
      - lugar
      - lista de pilotos
      - lista de equipos
      - director de carrera.
      - campeonato
    - Métodos: 
      - getters y setters para los atributos=
      - simularCarrera.
      - calificarCarrera

7. **Clase `Campeonato`**
    - Atributos
      - nombre del campeonato
      - año
      - lista de carreras del campeonato
      - cantidad Carreras
      - lista de equipos
    - Métodos:
      - getters y setters para los atributos


### Clases adicionales que implementan herencia

1. **Clase `EquipoDeCarrera`** (hereda de `Equipo`)
    - Atributo adicional: 
      - pilotos a competir
      - partes disponibles
      - contrato
      - puntos acumulados
    - Métodos adicionales: 
      - getters y setters para el atributo adicional
      - calificarEquipo
      - actualizarPartesDisponibles
      - hacerContrato
      - calificarEquipo
      - disponibilidadPartes

2. **Clase `VehiculoDeCarrera`** (hereda de `Vehiculo`)
    - Atributo adicional: 
      - estado de neumáticos
      - estadoAleron
      - estadoFrenos
      - cantPitStops
      - estadoMotor.
    - Métodos adicionales:
      - abrirAleron
      - hacerManiobra
      - realizarPitStop
      - accidentarse
      - cambiarLlantas
      - cambiarAleron
      - cambiarMotor
      - cambiarFrenos
      - realizarMantenimiento

### Clases abstacta

1. **Clase `Persona`**
    - Atributo : nombreCompleto, id, pais.
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
1. Método en `Campeonato`: `agregarCarrera(carrera: Carrera)`
2. Método en `Carrera`: `asignarCampeonato(campeonato: Campeonato)`
3. Método en `Campeonato`: `elegirEquipos(equipos: Equipo)`
4. Método en `Campeonato`: `cantidadCarreras(carreras: Carrera)`

**Notas:**
- Decir cuantas carreras
- Imprimir algo asi chevere como tablita
- Fecha general del campeonato

## Funcionalidad: Planear Grand Prix

**Descripción:** Esta funcionalidad se enfoca en la planificación de un evento de Grand Prix, definiendo lugar, fecha y distancia de la carrera.

**Clases involucradas:** `Carrera`, `Piloto`, `EquipoDeCarrera`, `DirectorCarrera`, `Patrocinador`

**Métodos utilizados:**
1. Método en `Carrera`: `definirLugar(lugar: string)`
2. Método en `Carrera`: `definirFecha(fecha: Date)`
3. Método en `Carrera`: `definirDistancia(distancia: int)`
4. Método en `Carrera`: `definirPremio(premio: float)`
5. Método en `Carrera`: `asignarPilotos(pilotos: [Piloto])`
6. Método en `Carrera`: `asignarDirector(DirectorCarrera: directorCarrera)`
7. Método en `EquipoDeCarrera`: `hacerContrato(patrocinadores: [Patrocinador])`
8. Método en `Patrocinador`: `hacerContrato(equipo: Equipo)`

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

**Notas:**
- Cambia las posiciones
- Dar puntos
- Mirar si el equipo tiene partes disponibles
- Si no hace pit stop -> sancion

## Funcionalidad: Calificar Rendimiento en una Carrera y Premiación del Grand Prix

**Descripción:** Evalúa el rendimiento de los pilotos en una carrera, otorga puntos y premios a los mejores.

**Clases involucradas:** `Carrera`, `Piloto`, `EquipoDeCarrera`, `Patrocinador`

**Métodos utilizados:**
1. Método en `Carrera`: `calificarCarrera()`
2. Método en `Piloto`: `calificarPiloto(puntos: int)`
3. Método en `EquipoDeCarrera`: `calificarEquipo(puntos: int)`
4. Método en `Patrocinador`: `reclamarPatrocinio(dinero: float)`
   
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

