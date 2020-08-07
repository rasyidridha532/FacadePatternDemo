/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116251-Rasyid
 */
public class IIS implements MataPelajaran{

    @Override
    public void pilihMapel(String namaSiswa) {
        System.out.println(namaSiswa+" adalah anak IPS, mata pelajarannya adalah: ");
        System.out.println("Sejarah Wajib");
        System.out.println("Sejarah Minat");
        System.out.println("Matematika Wajib");
        System.out.println("Geografi");
        System.out.println("Sosiologi");
        System.out.println("Ekonomi");
    }
}
