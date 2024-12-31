select nombre from producto;
select nombre, precio from producto;
select * from producto;
select nombre, round(precio) from producto;
select f.codigo from fabricante f inner join producto p on f.codigo = p.codigo_fabricante;
select distinct f.codigo from fabricante f inner join producto p on f.codigo = p.codigo_fabricante;
select f.nombre from fabricante f order by nombre asc;
select p.nombre, p.precio from producto p order by p.nombre asc, p.precio desc;
select * from fabricante limit 5;
select nombre, precio from producto order by precio asc limit 1;
select nombre, precio from producto order by precio desc limit 1;
select nombre, precio from producto where precio <= 120;
select * from producto where precio between 60 and 200;
select * from producto where codigo_fabricante in (1, 3, 5);
select nombre from producto where nombre like "%portatil%";
/* CONSULTAS MULTITABLAS */
select p.codigo "código producto", p.nombre "nombre producto", f.codigo "código fabricante", f.nombre "nombre fabricante"
from producto p, fabricante f
where f.codigo = p.codigo_fabricante
order by f.codigo asc;

select p.nombre "nombre producto", p.precio, f.codigo from producto p, fabricante f
where p.codigo_fabricante = f.codigo
order by f.nombre asc;

select p.nombre, p.precio, f.nombre 
from producto p, fabricante f
order by precio asc limit 1;

select p.*
from producto p, fabricante f
where p.codigo_fabricante = f.codigo and f.nombre = "lenovo";

select p.*
from producto p, fabricante f
where p.codigo_fabricante = f.codigo and f.nombre = "crucial" and p.precio > 200;

select p.*
from producto p, fabricante f
where p.codigo_fabricante = f.codigo and f.nombre in ("asus", "hewlett-packard");

select p.nombre, p.precio, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo and p.precio >= 180
order by p.precio desc, p.nombre asc;

/* CONSULTAS MULTITABLAS */
select *
from fabricante f
left join producto p
on f.codigo = p.codigo_fabricante;

select *
from fabricante f /* trae los fabricantes que no existan */
where not exists (select p.codigo_fabricante from producto p where p.codigo_fabricante = f.codigo); /* en la relación con la tabla producto */

/* SUBCONSULTAS */
select p.nombre
from producto p
where (select f.codigo from fabricante f where f.nombre = "Lenovo") = p.codigo_fabricante;

select p.*
from producto p
where p.precio = 
(select p.precio from producto p, fabricante f 
where p.codigo_fabricante = f.codigo and f.nombre = "Lenovo" 
order by p.precio desc limit 1);

select p.*
from producto p
where p.precio > 
(select avg(p.precio) from producto p, fabricante f 
where p.codigo_fabricante = f.codigo and f.nombre = "Asus");

select distinct f.nombre
from fabricante f
where f.codigo in (select distinct codigo_fabricante from producto)
order by nombre asc;

select nombre
from fabricante 
where codigo not in (select codigo_fabricante from producto);

/* Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número 
de productos que el fabricante Lenovo. */
select count(f.nombre), f.nombre
from fabricante f, producto p
where f.codigo = p.codigo_fabricante
group by f.nombre
having count(f.nombre) = 
(select count(f.codigo) 
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante and f.nombre = "Lenovo");