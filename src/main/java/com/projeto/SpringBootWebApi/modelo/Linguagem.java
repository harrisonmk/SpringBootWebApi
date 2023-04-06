package com.projeto.SpringBootWebApi.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")  //para usar o mongoDb Atlas
public class Linguagem implements Serializable {

    @Id
    private String id;
    
    @JsonProperty("title")
    private String titulo;

    @JsonProperty("image")
    private String imagem;

    @JsonProperty("ranking")
    private int rank;

    public Linguagem(String title, String image, int ranking) {
        this.titulo = title;
        this.imagem = image;
        this.rank = ranking;
    }

    public Linguagem() {
    }
    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    
    

}
