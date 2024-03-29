package com.tarcisio.ruconnected.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "feedbacks", foreignKeys =
        {@ForeignKey(entity = Comida.class, parentColumns = "id", childColumns = "id_comida"),
        @ForeignKey(entity = Usuario.class, parentColumns = "id", childColumns = "id_usuario")})//Adicionando duas chaves estrangeiras.
public class FeedBack {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private String descricao;
    @ColumnInfo(name = "id_comida")
    private int idComida;
    @ColumnInfo(name = "id_usuario")
    private int idUsuario;

    public FeedBack(String descricao, int idComida, int idUsuario){
        this.descricao = descricao;
        this.idComida = idComida;
        this.idUsuario = idUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
