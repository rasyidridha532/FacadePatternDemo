/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116251-Rasyid
 */
public class MatpelMaker {
    private MataPelajaran mia;
    private MataPelajaran iis;

    public MatpelMaker() {
        mia = new MIA();
        iis = new IIS();
    }
    
    public void siswaIPA(String namaSiswa) {
        mia.pilihMapel(namaSiswa);
    }
    
    public void siswaIPS(String namaSiswa) {
        iis.pilihMapel(namaSiswa);
    }
}
