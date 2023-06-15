DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  codigo_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo)
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

/* 1. Lista el nombre de todos los productos que hay en la tabla producto. */
select nombre from producto;

/* 2. Lista los nombres y los precios de todos los productos de la tabla producto. */
select nombre, precio from producto;

/* 3. Lista todas las columnas de la tabla producto. */
select * from producto;

/* 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando 
el valor del precio. */
select nombre, round(precio) from producto;

/* 5. Lista el código de los fabricantes que tienen productos en la tabla producto. */
select f.codigo, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
order by f.codigo;

/*  6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar 
los repetidos. */
select distinct f.nombre, f.codigo 
from fabricante f, producto p
where f.codigo = p.codigo_fabricante;

/* 7. Lista los nombres de los fabricantes ordenados de forma ascendente. */
select nombre
from fabricante
order by nombre;

/* 8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma 
ascendente y en segundo lugar por el precio de forma descendente. */ 
select nombre, precio 
from producto
order by nombre asc, precio desc;

/* 9. Devuelve una lista con las 5 primeras filas de la tabla fabricante. */
select *
from fabricante 
order by codigo
limit 5;

/* 10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas 
ORDER BY y LIMIT) */
select nombre, precio
from producto
order by precio asc
limit 1;

/* 11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER 
BY y LIMIT) */
select nombre, precio
from producto
order by precio desc
limit 1;

/* 12. Lista el nombre de los productos que tienen un precio menor o igual a $120. */
select nombre, precio
from producto
where precio <= 120;

/* 13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador 
BETWEEN. */
select * 
from producto
where precio
between 60 and 200;

/* 14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador 
IN. */
select *
from producto 
where codigo_fabricante
in (1, 3, 5);

/* 15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil 
en el nombre. */
select * from producto
where nombre like '%Portátil%';

/* CONSULTAS MULTITABLAS */ 
/* 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante 
y nombre del fabricante, de todos los productos de la base de datos. */
select p.codigo, p.nombre, f.codigo, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
order by p.codigo;

/* 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos 
los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por 
orden alfabético. */ 
select p.nombre, p.precio, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
order by f.nombre;

/* 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto 
más barato. */
select p.nombre, p.precio, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
order by p.precio asc
limit 1;

/* 4. Devuelve una lista de todos los productos del fabricante Lenovo. */
select * 
from producto, fabricante
where producto.codigo_fabricante = fabricante.codigo and fabricante.nombre = 'Lenovo';

/* 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio 
mayor que $200. */
select * 
from producto, fabricante
where producto.codigo_fabricante = fabricante.codigo and fabricante.nombre = 'Crucial' and producto.precio > 200;

/* 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. 
Utilizando el operador IN. */
select * 
from producto p, fabricante f
where p.codigo_fabricante = f.codigo and f.nombre in ("Asus", "Hewlett-Packard");

/* 7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos 
los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer 
lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden 
ascendente) */
select p.nombre, p.precio, f.nombre 
from producto p, fabricante f
where p.codigo_fabricante = f.codigo and p.precio >= 180
order by p.precio desc , p.nombre asc;

/* CONSULTAS MULTITABLAS 
Resolver todo utilizando LEFT JOIN y RIGHT JOIN*/
/* Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los 
productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos 
fabricantes que no tienen productos asociados. */
select *
from fabricante f 
left join producto p
on f.codigo = p.codigo_fabricante;

/* 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún 
producto asociado. */
select *
from fabricante f 
left join producto p
on f.codigo = p.codigo_fabricante
where p.codigo_fabricante is null;

/* SUBCONSULTAS (EN LA CLÁUSULA WHERE) 
1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN). */
select * 
from fabricante f, producto p
where f.codigo = p.codigo_fabricante and f.nombre = 'Lenovo';

/* 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto 
más caro del fabricante Lenovo. (Sin utilizar INNER JOIN). */
select * 
from fabricante f, producto p
where f.codigo = p.codigo_fabricante and p.precio = (select p.precio from fabricante f, producto p where f.codigo = p.codigo_fabricante and f.nombre = 'Lenovo' order by p.precio desc limit 1);

/* 3. Lista el nombre del producto más caro del fabricante Lenovo. */
select p.nombre
from fabricante f, producto p
where f.codigo = p.codigo_fabricante and f.nombre = 'Lenovo'
order by p.precio desc
limit 1;

/* 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio 
medio de todos sus productos. */
select *
from fabricante f, producto p
where f.codigo = p.codigo_fabricante 
and p.precio > (select avg(p.precio)
from fabricante f, producto p
where f.codigo = p.codigo_fabricante and f.nombre = 'Asus') 
and f.nombre = 'Asus';

/* Subconsultas con IN y NOT IN */
/* 1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o 
NOT IN). */
select f.nombre
from fabricante f, producto p
where p.codigo_fabricante = f.codigo in (1, 2, 3, 4, 5, 6, 7);

/* 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando 
IN o NOT IN). */
select f.nombre
from fabricante f, producto p
where p.codigo_fabricante = f.codigo not in (1, 2, 3, 4, 5, 6, 7);

/* Subconsultas (En la cláusula HAVING)
1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número 
de productos que el fabricante Lenovo. */
select count(f.codigo)
from fabricante f, producto p
where f.codigo = p.codigo_fabricante and f.nombre = 'Lenovo';

select f.nombre
from fabricante f, producto p
where f.codigo = p.codigo_fabricante 
group by f.nombre
having count(f.codigo) = (select count(f.codigo)
from fabricante f, producto p
where f.codigo = p.codigo_fabricante and f.nombre = 'Lenovo');


select * from producto p, fabricante f
where f.codigo = p.codigo_fabricante
order by f.codigo;

select * from fabricante;
