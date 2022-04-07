package com.br.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity //Indica ao código que esse objeto vai ser uma tabela no banco de dados
@Getter //Cria getters
@Setter //Cria setters
@Table(name ="person") //Referencia o nome da tabela
public class Person {
    
    @Id //Indica que esse atributo será o id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Indica que esse atributo será uma coluna e terá o tamanho máximo de 60 caracteres
    @Column(length = 60)
    private String name;

    private int age;

    @Column(length = 15)
    private String cpf;

    private boolean enabled;

}
