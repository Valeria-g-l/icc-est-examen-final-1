package models;

import java.util.List;

public class Maquina {
    private String nombre;
    private String ip;
    private int subred;
    private int riesgo;
    private List<Integer> codigos;

    public Maquina(String ip, String nombre, List<Integer> codigos) {
        this.codigos = codigos;
        this.ip = ip;
        this.nombre = nombre;
        this.riesgo = riesgo;
        this.subred = subred;
    }

    

    private void Maquina(String ip, String nombre, List<Integer> codigo){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getSubred() {
        return subred;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }



    @Override
    public String toString() {
        return "Maquina [nombre=" + nombre + ", ip=" + ip + ", subred=" + subred + ", riesgo=" + riesgo + ", codigos="
                + codigos + "]";
    }

    public void comparator(){

    }



    
}
