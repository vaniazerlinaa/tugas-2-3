import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue
{
    public static void main(String[] args) 
    {
        String nama;
        int i=0;
        boolean bool = true;

        Queue<String> antrian = new LinkedList<>(); //deklarasi queue
        Scanner pilih = new Scanner(System.in); //untuk data input

        System.out.println("Pembagian Sembako");
        do
        {
            System.out.println("1. Daftar Nama");
            System.out.println("2. Ambil Nama Pertama ");
            System.out.println("3. Cek Nama Pertama ");
            System.out.println("4. Pengecekan Data Kosong");
            System.out.println("5. Banyak Antrian ");
            System.out.println("6. Tampilan Queue ");
            System.out.println("7. Data Dihapus");
            System.out.println("8. Selesai");
            System.out.print("Masukkan Pilihan [1-8]: ");
            int input=pilih.nextInt();

            switch(input)
            {
            case 1:
            System.out.print("Banyak data nama : ");
            i=0;
            int h=pilih.nextInt(); //input banyak data yang diinginkan

            do
            {
            System.out.print("Masukan nama : ");
            nama = pilih.next(); //input nama sebanyak data yang ditambah
            antrian.add(nama);
            i++;
            }

            while(i<h); //perulangan antrian sebanyak inputan data yang diinginkan sebelumnya
            System.out.println("Antrian : "+ antrian);
            System.out.println("");
            break;

            case 2:
            System.out.println("Ambil Antrian Teratas : "+ antrian.poll());
            System.out.println("");
            break;

            case 3:
            System.out.println("Cek Antrian Teratas : "+antrian.peek());
            System.out.println("");
            break;

            case 4:
            System.out.println("Apakah ada data ksosong?");
            System.out.println(antrian.isEmpty());

            case 5:
            System.out.println("Banyak Antrian : "+antrian.size());
            System.out.println("");
                    
            case 6:
            System.out.println("Tampilan Queue : "+antrian);
            System.out.println("");
            break;

            case 7:
            antrian.clear();
            System.out.println("semua data berhasil di hapus");
            break;

            case 8:
            System.exit(0);
            break;
                
            default:
            System.err.println("Pilihan tidak tersedia!");
            System.out.println("");
            }
        }
        while(bool);
        pilih.close();
    }
}