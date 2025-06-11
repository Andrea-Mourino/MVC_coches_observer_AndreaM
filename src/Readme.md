### Pasos a seguir 

1. Lo primero que hice obviamente es hacer un fork al repositorio de Damian y hacer un clon en Idea. Tambien creé una carpeta en mi escritorio para guardarlo ahí.

2. Lo segundo que hice fue crear una nueva rama llama *Readme* y crear un ```Readme.md``` en esa misma rama para luego hacerle commit y push para que funcionara correctamente, ya que si no el ```readme.md``` se mantendria en las demas ramas y no queremos eso.

3. Cree un Issue llamado Test 1 y 2 para cerrar los commits con close #2 y 4 respectivamente.

4. Hice Checkout a *pre-observer* para crear los Test en una clase que llamé ```ControllerTest```. 

```
package com.cod.mvc;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    @org.junit.jupiter.api.Test
    void crearCoche() {
    } //close issue #2


    @org.junit.jupiter.api.Test
    void cambiarVelocidad() {
    } //close issue #4
}
```

Empecé metiendo un solo test para hacer su respectivo commit y luego agregre un comentario para poder cerrar el issue con un commit. Hice lo mismo otra vez con el siguiente test.

5. Seguidamente hice la fusion merge yendo a mi repositorio y creando un pull request para cada rama (menos el *Readme*) para fusionarlo con la *master* (teniendo cuidado de agarrar mi *master* y no la del repositorio de Damian). 

    Con las ramas *eventoView* y *eventoViewJavaFX* tuve un conflicto que me pedia arreglar para poder hacer el merge correctamente pero lo solucioné. Era basicamente modificar unos documentos que hacian conflictos con otros.

6. De ultimo hice el Releases con el tag v2.0 y lo llame de la misma forma por costumbre. 