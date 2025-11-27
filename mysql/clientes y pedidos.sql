INSERT INTO clientes (nombre, direccion, telefono) VALUES
('Valeria Romero', 'San Jose', 88880000),
('Sakura Card Captors', 'Heredia', 88901010),
('El Mandaloriano', 'Cartago', 70156060),
('Juan Lopez', 'Puntarenas', 88881010),
('Miguel Rodriguez', 'San Jose', 85707070);

INSERT INTO pedidos (clientes_id, fecha, total) VALUES 
(8, '2025-01-04', 18000),
(8, '2025-01-10', 22000),
(2, '2025-01-02', 12000),
(2, '2025-01-08', 30000),
(4, '2025-01-05', 25000),
(5, '2025-01-06', 27000),
(5, '2025-01-09', 16000),
(5, '2025-01-11', 21000);

SELECT * FROM clientes JOIN pedidos ON clientes.id = pedidos.clientes_id;

SELECT pedidos.id AS id_pedido, pedidos.fecha, pedidos.total FROM pedidos WHERE pedidos.clientes_id = 8;

SELECT clientes.id, clientes.nombre, SUM(pedidos.total) AS total_pedidos
FROM clientes
JOIN pedidos
ON clientes.id = pedidos.clientes_id
GROUP BY clientes.id, clientes.nombre;

-- Tuve que borrar la que ya habia añadido --
ALTER TABLE pedidos
DROP FOREIGN KEY fk_pedidos_clientes;

-- Para poder agregar el cascade y que el delete pueda borrar incluso cuando hay fk en otras tablas -- 
ALTER TABLE pedidos
ADD CONSTRAINT fk_pedidos_clientes
    FOREIGN KEY (clientes_id)
    REFERENCES clientes(id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;

DELETE FROM clientes WHERE clientes.id = 2;

SELECT clientes.id, clientes.nombre, COUNT(pedidos.id) AS numero_pedidos 
FROM clientes
JOIN pedidos ON clientes.id = pedidos.clientes_id
GROUP BY clientes.id, clientes.nombre
ORDER BY numero_pedidos DESC
LIMIT 3;







