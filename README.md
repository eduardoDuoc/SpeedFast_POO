# SpeedFast

Proyecto desarrollado en **Java** para simular la gestión de distintos tipos de pedidos de la empresa **SpeedFast**:

- Comida
- Encomiendas
- Compras Express

# Diseño del sistema

# Escalabilidad
El sistema permite agregar nuevos tipos de pedidos sin modificar toda la estructura existente. Al trabajar con una clase abstracta `Pedido`, se pueden crear nuevas subclases que implementen su propia lógica de asignación de repartidor, reserva y cálculo de tiempo de entrega.

# Reutilización
La clase abstracta `Pedido` concentra atributos y métodos comunes como `idPedido`, `direccionEntrega`, `distanciaKm`, `repartidor` y `mostrarResumen()`. De esta forma, las subclases `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` reutilizan código y solo implementan los comportamientos específicos de cada tipo de pedido.

# Mantenibilidad
Las interfaces `Despachable`, `Cancelable` y `Rastreable` separan responsabilidades específicas del sistema. La clase `ControladorDeEnvios` implementa estas funciones, permitiendo mantener la lógica de despacho, cancelación e historial separada de las clases de pedido. Esto facilita realizar cambios sin afectar otras partes del sistema.