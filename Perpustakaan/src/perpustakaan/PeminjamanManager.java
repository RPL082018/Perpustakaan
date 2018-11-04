/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author Gerwin Jo
 */
public class PeminjamanManager {

    public ArrayList<Peminjaman> peminjaman;
    public ArrayList<BukuDipinjam> bukuDipinjamCollection;

    public boolean save(BukuDipinjam bukuDipinjam) {
        peminjaman = new ArrayList<>();
        for (BukuDipinjam dipinjam : this.bukuDipinjamCollection) {
            peminjaman.add(dipinjam);
        }
        return true;
    }
    
}
