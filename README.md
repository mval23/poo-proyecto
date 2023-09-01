# Estructura del Proyecto de la Fédération Internationale de l'Automobile


Aquí se ubicarán las clases relacionadas con la lógica de negocio.

## Clases en el paquete "modeloNegocio"

1. **Clase `Vehiculo`**
    - Atributos: marca, modelo, año, motor, nombre.
    - Métodos: getters y setters para los atributos.

2. **Clase `DirectorCarrera`**
    - Atributos: nombre, edad, licencia.
    - Métodos: getters y setters para los atributos, poner sanciones.

3. **Clase `Carrera`**
    - Atributos: fecha, nombreCircuito, distancia, premio en efectivo, lugar.
    - Métodos: getters y setters para los atributos, 

4. **Clase `Equipo`**
    - Atributos: nombre del equipo, país, lista de vehículos del equipo, pilotos
    - Métodos: getters y setters para los atributos.

5. **Clase `Campeonato`**
    - Atributos: nombre del campeonato, año, lista de carreras del campeonato.
    - Métodos: getters y setters para los atributos.

6. **Clase `Piloto`**
    - Atributos: nombre, edad, equipo, puntos acumulados, victorias.
    - Métodos: getters y setters para los atributos.

7. **Clase `Patrocinador`**
    - Atributos: nombre, país, tipo de patrocinio.
    - Métodos: getters y setters para los atributos.

### Clases adicionales que implementan herencia

1. **Clase `EquipoDeCarrera`** (hereda de `Equipo`)
    - Atributo adicional: lista de pilotos del equipo.
    - Métodos adicionales: getters y setters para el atributo adicional.

2. **Clase `VehiculoDeCarrera`** (hereda de `Vehiculo`)
    - Atributo adicional: estado de neumáticos, estadoAleron, estadoFrenos.
    - Métodos adicionales: getters y setters para el atributo adicional.

### Clases abstacta

1. **Clase `Persona`**
    - Atributo : nombreCompleto, id, pais.
    - Métodos adicionales: getters y setters.


## Funcionalidad: Preparar Campeonato

**Descripción:** Esta funcionalidad se encarga de configurar y organizar un nuevo campeonato de carreras de automóviles.

**Clases involucradas:** `Campeonato`, `Carrera`, `Equipo`

**Métodos utilizados:**
1. Método en `Campeonato`: `agregarCarrera(carrera: Carrera)`
2. Método en `Carrera`: `asignarCampeonato(campeonato: Campeonato)`
3. Método en `Equipo`: `asignarCarrera(carrera: Carrera)`
4. Método en `Campeonato`: `elegirEquipos(equipos: [Equipo])`

**Notas:**
- Decir cuantas carreras
- Imprimir algo asi chevere como tablita
- Fecha general del campeonato

## Funcionalidad: Planear Grand Prix

**Descripción:** Esta funcionalidad se enfoca en la planificación de un evento de Grand Prix, definiendo lugar, fecha y distancia de la carrera.

**Clases involucradas:** `Carrera`, `Piloto`, `Equipo`, `DirectorCarrera

**Métodos utilizados:**
1. Método en `Carrera`: `definirLugar(lugar: string)`
2. Método en `Carrera`: `definirFecha(fecha: Date)`
3. Método en `Carrera`: `definirDistancia(distancia: number)`
4. Método en `Carrera`: `definirPremio(premio: number)`
5. Método en `Carrera`: `asignarPilotos(pilotos: [Piloto])`
6. Método en `Carrera`: `asignarDirector(DirectorCarrera: directorCarrera)`

**Notas:**
- Dos pilotos por equipo

## Funcionalidad: Simulación de Grand Prix

**Descripción:** Simula la ejecución de una carrera de Grand Prix, calculando las posiciones y los tiempos.

**Clases involucradas:** `Carrera`, `Piloto`, `VehiculoDeCarrera`, `DirectorCarrera`

**Métodos utilizados:**
1. Método en `Carrera`: `simularCarrera()`
2. Método en `Piloto`: `manejarVehiculo(puntos: number)`
3. Método en `VehiculoDeCarrera`: `aumentarVelocidad(puntos: number)`
4. Método en `VehiculoDeCarrera`: `disminuirVelocidad(puntos: number)`
5. Método en `VehiculoDeCarrera`: `realizarPitStop()`
6. Método en `DirectorCarrera`: `ponerSancion()`
7. Método en `VehiculoDeCarrera`: `hacerManiobra()`
8. Método en `VehiculoDeCarrera`: `accidentarse()`

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
2. Método en `EquipoDeCarrera`: `registrarPitStop(vehiculo: VehiculoDeCarrera)`
3. Método en `EquipoDeCarrera`: `realizarAjustes(vehiculo: VehiculoDeCarrera)`
4. Método en `VehiculoDeCarrera`: `cambiarLlantas()`
5. Método en `VehiculoDeCarrera`: `cambiarAleron()`
6. Método en `VehiculoDeCarrera`: `cambiarMotor()`
7. Método en `VehiculoDeCarrera`: `cambiarFrenos()`

**Notas:**
- Cambia las posiciones
- Dar puntos
- Mirar si el equipo tiene partes disponibles
- Si no hace pit stop -> sancion

## Funcionalidad: Calificar Rendimiento en una Carrera y Premiación del Grand Prix

**Descripción:** Evalúa el rendimiento de los pilotos en una carrera, otorga puntos y premios a los mejores.

**Clases involucradas:** `Carrera`, `Piloto`, `Equipo`

**Métodos utilizados:**
1. Método en `Carrera`: `calificarCarrera()`
2. Método en `Piloto`: `calificarPiloto(puntos: number)`
3. Método en `Equipo`: `calificarEquipo(puntos: number)`

**Notas:**
- Tablita chevere
- Poner tiempos
- Poner posiciones
- Poner puntos
- Poner premios
- Poner sanciones
- Poner DNF



##Notas Adicionales
- cada carrera tiene contratos, si tiene entra a la programacion del campeonato
- cada equipo tiene 5 motores disponibles para el campeonato
- le hacen partes para controlar
- si se pasan de partes 
