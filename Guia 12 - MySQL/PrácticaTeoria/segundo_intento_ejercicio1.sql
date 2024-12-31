select * from empleado;
select * from departamento;
select nombre_depto from departamento;
select nombre, salario from empleado;
select comision as "comisión" from empleado;
select nombre from empleado where cargo = "Secretaria";
select nombre from empleado where cargo = "Vendedor" order by nombre desc;
select nombre "Nombre", cargo "Cargo" from empleado;
select salario, comision from empleado where id_depto = 2000 order by comision asc;
select nombre "NOMBRE", (salario + comision + 500) from empleado where id_depto = 3000 order by nombre asc;
select * from empleado where id_depto = 3000 order by nombre asc;
select * from empleado where nombre like 'j%';
select salario, comision, (salario + comision) "TOTAL" from empleado where comision >= 1000;
select salario, comision, (salario + comision) "TOTAL" from empleado where comision = 0;
select * from empleado where comision > salario;
select *, (salario * 0.3) "PORCENTAJE" from empleado where comision <= (salario * 0.3);
select * from empleado where nombre not like "%ma%";
select * from departamento where nombre_depto in ("ventas", "investigacion", "mantenimiento");
select * from departamento where not nombre_depto in ("ventas", "investigacion", "mantenimiento");
select max(salario) as "salario máximo" from empleado;
select nombre from empleado order by nombre desc limit 1;
select max(salario), min(salario), (max(salario) - min(salario)) "diferencia" from empleado;
select id_depto, avg(salario) from empleado group by id_depto;
select id_depto from empleado group by id_depto having count(id_depto) > 3; /* CONSULTAS CON HAVING */ 

/* 25. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige. 
Solo los que tengan más de dos empleados (2 incluido). */
select cod_jefe, count(cod_jefe) /* Selecciono la columna codigo jefe y count(cod_jefe) porque quiero que sean las que se muestren */
from empleado e 
group by cod_jefe /* Las agrupo por cod_jefe porque quiero que me diga cuántas hay de cada uno */
having count(cod_jefe) >= 2 /* Le digo al programa que solo quiero que me traiga las que son mayor o igual a 2 */
order by count(cod_jefe) asc; /* Agrupo de mayor a menor EL CONTADOR */

select id_depto, count(id_depto) from empleado
group by id_depto
having count(id_depto) = 0;
/*Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa.
 Ordenarlo por departamento.*/
 select nombre, salario, id_depto from empleado where salario >= (select round(avg(salario)) from empleado) 
 order by id_depto;







