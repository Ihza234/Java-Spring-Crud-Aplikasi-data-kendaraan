package com.mycompany.user;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 45, nullable = false   )
    private String noregistasikendaraan;

    @Column(length = 45, nullable = false)
    private String namapemilik;

    @Column(length = 45, nullable = false)
    private String alamat;

    @Column(length = 45, nullable = false)
    private String merkkendaraan;

    @Column(length = 45, nullable = false)
    private String tahunpembuatan;

    @Column(length = 45, nullable = false)
    private String kpasitassilinder;

    @Column(length = 45, nullable = false)
    private String warnakendaraan;

    @Column(length = 45, nullable = false)
    private String bahanbakar;

    private boolean setuju;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoregistasikendaraan() {
        return noregistasikendaraan;
    }

    public void setNoregistasikendaraan(String noregistasikendaraan) {
        this.noregistasikendaraan = noregistasikendaraan;
    }

    public String getNamapemilik() {
        return namapemilik;
    }

    public void setNamapemilik(String namapemilik) {
        this.namapemilik = namapemilik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMerkkendaraan() {
        return merkkendaraan;
    }

    public void setMerkkendaraan(String merkkendaraan) {
        this.merkkendaraan = merkkendaraan;
    }

    public String getTahunpembuatan() {
        return tahunpembuatan;
    }

    public void setTahunpembuatan(String tahunpembuatan) {
        this.tahunpembuatan = tahunpembuatan;
    }

    public String getKpasitassilinder() {
        return kpasitassilinder;
    }

    public void setKpasitassilinder(String kpasitassilinder) {
        this.kpasitassilinder = kpasitassilinder;
    }

    public String getWarnakendaraan() {
        return warnakendaraan;
    }

    public void setWarnakendaraan(String warnakendaraan) {
        this.warnakendaraan = warnakendaraan;
    }

    public String getBahanbakar() {
        return bahanbakar;
    }

    public void setBahanbakar(String bahanbakar) {
        this.bahanbakar = bahanbakar;
    }

    public boolean isSetuju() {
        return setuju;
    }

    public void setSetuju(boolean setuju) {
        this.setuju = setuju;
    }
}