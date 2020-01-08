drop table if exists videojuego;
create table videojuego(
id int primary key auto_increment,
nombre varchar(200) not null,
descripcion varchar(3000),
imagen_url varchar(500)
);
insert into videojuego 
(nombre,          descripcion,      imagen_url) values
("primer", "d1", "https://s3-us-west-2.amazonaws.com/devcodepro/media/blog/la-fundacion-de-google.png"),
("segundo","d2","https://s3-us-west-2.amazonaws.com/devcodepro/media/blog/la-fundacion-de-google.png"),
("tercer", "d3", "https://s3-us-west-2.amazonaws.com/devcodepro/media/blog/la-fundacion-de-google.png");