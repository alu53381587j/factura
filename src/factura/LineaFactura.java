package factura;

public class LineaFactura {
	/**
	 * @author Alberto Garí
	 * @version 1.0
	 */
	public String id_producto; // identificador (codigo) del producto
	public String nombre_producto; // nombre del producto

	public float precio; // precio por una unidad del producto
	public float cantidad; // cantidad de unidades compradas
	public float descuento; // descuento de la unidad (no se esta utilizando)

	/**
	 * 
	 * @param idProducto
	 *            El identificador del producto
	 * @param nombreProducto
	 *            El nombre del producto
	 * @param precio
	 *            El precio unitario del producto
	 * @param cantidad
	 *            La cantidad de productos
	 * @param descuento
	 *            El descuento que se aplica al producto
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "\n\tLineaFactura [" + "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto + ", precio=" + precio
				+ ", cantidad=" + cantidad + ", descuento=" + descuento + "]";
	}

	/**
	 * @return Devuelve el precio total de una linea. El precio de la unidad por
	 *         la cantidad de productos pedidos de esa uniad
	 */
	public float getTotal() {
		float total = this.precio * this.cantidad;
		return total;
	}

}
