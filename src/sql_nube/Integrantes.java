/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql_nube;

/**
 *
 * @author yazmi
 */
public class Integrantes {
    private int idIntegrante;
    private String NombreArtistico;
    private String nombreReal;
    private String linea;
    private String colorFavorito;

    public Integrantes() {
    }

    public Integrantes(int idIntegrante, String NombreArtistico, String nombreReal, String linea, String colorFavorito) {
        this.idIntegrante = idIntegrante;
        this.NombreArtistico = NombreArtistico;
        this.nombreReal = nombreReal;
        this.linea = linea;
        this.colorFavorito = colorFavorito;
    }

    public String getColorFavorito() {
        return colorFavorito;
    }

    public void setColorFavorito(String colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

    public int getIdIntegrante() {
        return idIntegrante;
    }

    public void setIdIntegrante(int idIntegrante) {
        this.idIntegrante = idIntegrante;
    }

    public String getNombreArtistico() {
        return NombreArtistico;
    }

    public void setNombreArtistico(String NombreArtistico) {
        this.NombreArtistico = NombreArtistico;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    
    
    
}
