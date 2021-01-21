package br.com.impacta.springmvc.gerenciadordespesas.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cep {

    private String cep;
    private String address;
    private String district;
    private String city;
    private String state;

    @JsonProperty(value = "lat")
    private String latitude;

    @JsonProperty(value = "lng")
    private String longitude;
    private String ddd;

    @JsonProperty(value = "city_ibge")
    private String codigo_ibge;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getCodigo_ibge() {
        return codigo_ibge;
    }

    public void setCodigo_ibge(String codigo_ibge) {
        this.codigo_ibge = codigo_ibge;
    }

    public Cep() {
    }

    public Cep(String cep, String address, String district, String city, String state,
               String latitude, String longitude, String ddd, String codigo_ibge) {
        this.cep = cep;
        this.address = address;
        this.district = district;
        this.city = city;
        this.state = state;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ddd = ddd;
        this.codigo_ibge = codigo_ibge;
    }

    @Override
    public String toString() {
        return "Cep{" +
                "cep='" + cep + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", ddd='" + ddd + '\'' +
                ", codigo_ibge='" + codigo_ibge + '\'' +
                '}';
    }
}
