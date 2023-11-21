package com.devops.granjaganadera.repositories.contracts;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devops.granjaganadera.entities.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido, Long>{

    @Query(value = "SELECT * FROM Pedidos WHERE id = :id", nativeQuery = true)
    public Pedido mostrar(@Param("id") long id);

    //Para mostrar la información relevante de los pedidos
    @Query(value = "SELECT P.id_pedido as \"idPedido\", " +
               "TO_CHAR(fecha_pedido, 'YYYY-MM-DD') as \"fechaDelPedido\", " +
               "estado as \"estadoActual\", " +
               "pago_pendiente as \"pendientePago\", " +
               "\"cantidadProductos\", \"cantidadArticulosTotal\" " +
               "FROM Pedidos as P INNER JOIN (" +
               "   SELECT id_pedido_id_pedido as \"idPedido\", " +
               "   COUNT(producto_id_producto) as \"cantidadProductos\", " +
               "   SUM(cantidad) as \"cantidadArticulosTotal\" " +
               "   FROM contenido_pedido " +
               "   GROUP BY id_pedido_id_pedido " +
               "   ORDER BY id_pedido_id_pedido ASC" +
               ") as ST ON P.id_pedido = ST.\"idPedido\" " +
               "ORDER BY \"idPedido\" ASC", nativeQuery = true)
    List<Map<String, Object>> obtenerInformacionPedidos();

    //Para calcular la cantidad de productos diferentes en cada pedido y calcular la cantidad de artículos en total
    @Query(nativeQuery = true,
    value = "SELECT Contenido.id_pedido_id_pedido as \"idPedido\", " +
            "COUNT(Contenido.producto_id_producto) as \"cantidadProductosPedido\", " +
            "SUM(Contenido.cantidad) as \"cantidadArtículosTotal\", " +
            "SUM(PS.\"precioTotalArticulos\") as \"precioTotalPedido\" " +
            "FROM contenido_pedido AS Contenido " +
            "INNER JOIN (" +
            "   SELECT CP.id_pedido_id_pedido as idPedido, " +
            "          CP.producto_id_producto as idProducto, " +
            "          CP.cantidad, " +
            "          P.precio_unitario, " +
            "          (P.precio_unitario*CP.cantidad) as \"precioTotalArticulos\" " +
            "   FROM productos as P " +
            "   INNER JOIN contenido_pedido as CP ON P.id_producto = CP.producto_id_producto" +
            ") AS PS ON Contenido.id_pedido_id_pedido = PS.idPedido " +
            "GROUP BY Contenido.id_pedido_id_pedido " +
            "ORDER BY Contenido.id_pedido_id_pedido ASC")
    List<Map<String, Object>> obtenerCantidadProductosYArticulos();

    //Para calcular el valor a pagar para todos los pedidos
    @Query(nativeQuery = true,
        value = "SELECT POM.idPedido, SUM(POM.\"Precio total por los artículos\") as \"precioTotalPedido\" " +
                "FROM (" +
                "   SELECT CP.id_pedido_id_pedido as idPedido, " +
                "          CP.producto_id_producto as idProducto, " +
                "          CP.cantidad, " +
                "          P.precio_unitario, " +
                "          (P.precio_unitario*CP.cantidad) as \"Precio total por los artículos\" " +
                "   FROM productos as P " +
                "   INNER JOIN contenido_pedido as CP ON P.id_producto = CP.producto_id_producto" +
                ") AS POM " +
                "GROUP BY POM.idPedido " +
                "ORDER BY POM.idPedido ASC")
    List<Map<String, Object>> obtenerPrecioTotalPorPedido();


}
