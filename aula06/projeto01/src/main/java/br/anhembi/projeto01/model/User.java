package br.anhembi.projeto01.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // indica que esta classe será persistida no BD
@Table(name = "usuario") // nome da tabela no BD para esta entidade
public class User {
    @Id // indica que este atributo será chave primária na tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3, ...
    private long code;

    @Column(name = "nome", length = 200, nullable = false)
    private String name;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "senha", length = 20)
    private String password;

    @OneToMany(mappedBy = "id") // nome do campo usado como referência para mondar a lista de veículos deste usuário
    private List<Veiculo> veiculos; // cada proprietário pode ter vários veículos

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

}
