/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author Gerwin Jo
 */
class BukuDipinjam extends Buku {
    private int lama;

    public BukuDipinjam(String judul) {
        super(judul);
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }
    
    
}
