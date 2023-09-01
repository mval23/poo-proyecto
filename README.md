# Estructura del Proyecto de la Fédération Internationale de l'Automobile

## Paquete "gestorAplicación"

Este paquete contendría las clases relacionadas con la gestión de la aplicación.

## Paquete "modeloNegocio"

Aquí se ubicarán las clases relacionadas con la lógica de negocio.

### Clases en el paquete "modeloNegocio"

1. **Clase `Vehiculo`**
    - Atributos: marca, modelo, año, número de chasis, tipo de vehículo.
    - Métodos: getters y setters para los atributos.

2. **Clase `Conductor`**
    - Atributos: nombre, edad, licencia de conducir, vehículo asignado.
    - Métodos: getters y setters para los atributos.

3. **Clase `Carrera`**
    - Atributos: fecha, lugar, distancia, premio en efectivo.
    - Métodos: getters y setters para los atributos.

4. **Clase `Equipo`**
    - Atributos: nombre del equipo, país, lista de vehículos del equipo.
    - Métodos: getters y setters para los atributos.

5. **Clase `Campeonato`**
    - Atributos: nombre del campeonato, año, lista de carreras del campeonato.
    - Métodos: getters y setters para los atributos.

6. **Clase `Piloto`**
    - Atributos: nombre, edad, equipo, puntos acumulados.
    - Métodos: getters y setters para los atributos.

7. **Clase `Patrocinador`**
    - Atributos: nombre, país, tipo de patrocinio.
    - Métodos: getters y setters para los atributos.

### Clases adicionales que implementan herencia

1. **Clase `PilotoProfesional`** (hereda de `Piloto`)
    - Atributo adicional: número de victorias.
    - Métodos adicionales: getters y setters para el atributo adicional.

2. **Clase `VehiculoDeCarrera`** (hereda de `Vehiculo`)
    - Atributo adicional: tipo de neumáticos.
    - Métodos adicionales: getters y setters para el atributo adicional.

### Clases adicionales que heredan de una tercera

1. **Clase `EquipoDeCarrera`** (hereda de `Equipo`)
    - Atributo adicional: lista de pilotos del equipo.
    - Métodos adicionales: getters y setters para el atributo adicional.

2. **Clase `EquipoPatrocinado`** (hereda de `Equipo`)
    - Atributo adicional: lista de patrocinadores del equipo.
    - Métodos adicionales: getters y setters para el atributo adicional.

## Funcionalidad: Preparar Campeonato

**Descripción:** Esta funcionalidad se encarga de configurar y organizar un nuevo campeonato de carreras de automóviles.

**Clases involucradas:** `Campeonato`, `Carrera`, `Equipo`

**Métodos utilizados:**
1. Método en `Campeonato`: `agregarCarrera(carrera: Carrera)`
2. Método en `Carrera`: `asignarCampeonato(campeonato: Campeonato)`
3. Método en `Equipo`: `asignarCarrera(carrera: Carrera)`
4. Método en `Campeonato`: `elegirEquipos(equipos: [Equipo])`

## Funcionalidad: Planear Grand Prix

**Descripción:** Esta funcionalidad se enfoca en la planificación de un evento de Grand Prix, definiendo lugar, fecha y distancia de la carrera.

**Clases involucradas:** `Carrera`, `Piloto`, `Equipo`

**Métodos utilizados:**
1. Método en `Carrera`: `definirLugar(lugar: string)`
2. Método en `Carrera`: `definirFecha(fecha: Date)`
3. Método en `Carrera`: `definirDistancia(distancia: number)`
4. Método en `Carrera`: `definirPremio(premio: number)`
5. Método en `Carrera`: `asignarPilotos(pilotos: [Piloto])`

## Funcionalidad: Simulación de Grand Prix

**Descripción:** Simula la ejecución de una carrera de Grand Prix, calculando las posiciones y los tiempos.

**Clases involucradas:** `Carrera`, `Piloto`, `VehiculoDeCarrera`

**Métodos utilizados:**
1. Método en `Carrera`: `simularCarrera()`
2. Método en `Piloto`: `manejarVehiculo(puntos: number)`
3. Método en `VehiculoDeCarrera`: `aumentarVelocidad(puntos: number)`
4. Método en `VehiculoDeCarrera`: `disminuirVelocidad(puntos: number)`
5. Método en `VehiculoDeCarrera`: `realizarPitStop()`


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

## Funcionalidad: Calificar Rendimiento en una Carrera y Premiación del Grand Prix

**Descripción:** Evalúa el rendimiento de los pilotos en una carrera, otorga puntos y premios a los mejores.

**Clases involucradas:** `Carrera`, `Piloto`, `Equipo`

**Métodos utilizados:**
1. Método en `Carrera`: `calificarCarrera()`
2. Método en `Piloto`: `calificarPiloto(puntos: number)`
3. Método en `Equipo`: `calificarEquipo(puntos: number)`


