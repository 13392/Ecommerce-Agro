create table categorias_produtos (
    categorias_id int not null,
    produtos_id int not null,
    primary key (categorias_id, produtos_id),
    foreign key (categorias_id) references categorias(id),
    foreign key (produtos_id) references produtos(id)
);