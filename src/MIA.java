/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116251-Rasyid
 */
public class MIA implements MataPelajaran{

    @Override
    public void pilihMapel(String namaSiswa) {
        System.out.println(namaSiswa+" adalah anak IPA, mata pelajarannya adalah: ");
        System.out.println("Sejarah Wajib");
        System.out.println("Matematika Wajib");
        System.out.println("Matematika Minat");
        System.out.println("Fisika");
        System.out.println("Biologi");
        System.out.println("Kimia");
    }    
}
