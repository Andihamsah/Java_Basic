package com.bootcamp.restDemo.model;

public class Student extends Person {
    private int nis;
    private String kelas;
    private String jurusun;
    private String thnAngkatan;

    public Student(){

    }

    public Student(int nis, String kelas, String jurusun, String thnAngkatan) {
        this.nis = nis;
        this.kelas = kelas;
        this.jurusun = jurusun;
        this.thnAngkatan = thnAngkatan;
    }

    public Student(int id, String name, String address, String gender, String hoby, int nis, String kelas, String jurusun, String thnAngkatan) {
        super(id, name, address, gender, hoby);
        this.nis = nis;
        this.kelas = kelas;
        this.jurusun = jurusun;
        this.thnAngkatan = thnAngkatan;
    }

    public int getNis() {
        return nis;
    }

    public String getKelas() {
        return kelas;
    }

    public String getJurusun() {
        return jurusun;
    }

    public String getThnAngkatan() {
        return thnAngkatan;
    }


}
