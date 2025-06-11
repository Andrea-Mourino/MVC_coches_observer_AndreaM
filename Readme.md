# Arquitectura MVC con Observer

En esta rama utilizaremos una versión muy simplificada del patrón Observer

Los cambios de la velocidad que se hagan en el model

serán observados por una clase `ObserverLimite`

Esta clase seerá la encargada de controlar el exceso de velocidad

* Notificamos a los observadores `notifyObservers(valor)`

* se *dispara* en todos los observadores el método `update()`

---

En esta rama está añadido los eventos en la IU

En vez de usar `swing`, usaremos [`javafx`](https://openjfx.io/)

De esta manera vemos lo independiente que queda la interfaz gráfica, pudiendo migrarla sin tener que modificar el resto de la App

Mantendremos una estructura básica de javafx

El Model y el Controller no cambian

---
### Diagrama de clases:

```mermaid
classDiagram


---

## Evento en el View

Cuando ocurre un evento en la vista, el `controller` se tiene que enterar.
Tenemos que tener en cuenta que en el MVC estricto, la vista no se comunica con el modelo.



Observador (que vigile el limite de velocidad), entonces se lanza el `update()` 

```mermaid
sequenceDiagram
