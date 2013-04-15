/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doscom.model;

import java.util.Objects;

/**
 *
 * @author zword
 */
public class crudModel {
    String nama;
    String nim;
    int nilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final crudModel other = (crudModel) obj;
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nama);
        return hash;
    }
    
   
}
