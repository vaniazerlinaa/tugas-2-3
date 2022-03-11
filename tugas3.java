import java.util.LinkedList;

public class tugas3
{
    public static void main(String[] args) {
        LinkedList <String> nama_mahasiswa = new LinkedList<String>();
        LinkedList <String> no_bp = new LinkedList<String>();
        LinkedList <String> alamat = new LinkedList<String>();

        no_bp.add("2111523003");
        no_bp.add("2111523027");
        no_bp.add("2111522030");

        nama_mahasiswa.add("Vania Zerlina Utami");
        nama_mahasiswa.add("Elsafina");
        nama_mahasiswa.add("Saskia Salsabila");

        alamat.add("Jln. Sawah Lua III");
        alamat.add("Jln. Hatta No.4");
        alamat.add("Jln. Jakarta No.5");

        System.out.println("Output Data Mahasiswa : ");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat + "\n");

        System.out.println("Output add Data Mahasiswa : ");
        //menambahkan data mahasiswa
        no_bp.addFirst("2111522003");
        no_bp.addLast("2111521011");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        nama_mahasiswa.addFirst("Divana");
        nama_mahasiswa.addLast("Rifa Lutfiyah");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        alamat.addFirst("Jln. Bengkulu no.3");
        alamat.addLast("Jln. Pahlawan No.14");
        System.out.println("Alamat Mahasiswa : " +alamat +"\n");

        System.out.println("Output remove Data Mahasiswa : ");
        //menghapus data mahasiswa
        no_bp.removeFirst();
        no_bp.removeLast();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        nama_mahasiswa.removeFirst();
        nama_mahasiswa.removeLast();
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        alamat.removeFirst();
        alamat.removeLast();
        System.out.println("Alamat Mahasiswa : " +alamat + "\n");
        
        System.out.println("Output set Data Mahasiswa : ");
        //mengganti data mahasiswa
        no_bp.set(1,"2111522034");
        nama_mahasiswa.set(2,"Natasha");
        alamat.set(2,"Jln. Gajah Mada No.B1");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat + "\n");

        System.out.println("Output get Data Mahasiswa : ");
        //mengambil data mahasiswa
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getFirst());
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getLast() + "\n");

        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getFirst());
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getLast() + "\n");

        System.out.println("Alamat Mahasiswa : " +alamat.getFirst());
        System.out.println("Alamat Mahasiswa : " +alamat.getLast() + "\n");

        System.out.println("Output pop Data Mahasiswa : ");
        //mengeluarkan daftar pertama data mahasiswa
        no_bp.pop();
        nama_mahasiswa.pop();
        alamat.pop();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat + "\n");

        System.out.println("Output push Data Mahasiswa : ");
        //menambahkan daftar pertama data mahasiswa
        nama_mahasiswa.push("Vania Zerlina");
        no_bp.push("2111523003");
        alamat.push("Jln. Sawah Lua III");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat + "\n");

        System.out.println("Output offer Data Mahasiswa : ");
        // operasi offer (menambahkan elemen terakhir)
        no_bp.offer("2111511009");
        nama_mahasiswa.offer("Mark");
        alamat.offerLast("Jl. Situjuh no.35");
        System.out.println("Nomor Induk Mahasiswa : " + no_bp);
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " + alamat + "\n");

        System.out.println("Output poll Data Mahasiswa : ");
        // operasi poll(menghapus elemen)
        no_bp.pollLast(); 
        nama_mahasiswa.pollLast();
        alamat.poll();//menghapus elemen pertama
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " + no_bp);
        System.out.println("Alamat Mahasiswa : " + alamat + "\n");

        System.out.println("Output size Data Mahasiswa ");
         // operasi size
         System.out.println("Nomor Induk Mahasiswa : " + no_bp.size());
         System.out.println("Nama Mahasiswa : " + nama_mahasiswa.size());
         System.out.println("Alamat Mahasiswa : " + alamat.size() + "\n");

        System.out.println("Output index of Data Mahasiswa : ");
        //mencari indeks suatu data mahasiswa
        System.out.println(no_bp.indexOf("2111523003"));
        System.out.println(nama_mahasiswa.indexOf("Vania Zerlina"));
        System.out.println(alamat.indexOf("Jln. Kamboja No.8") +"\n");

        //output akhiran data mahasiswa
        System.out.println("Output Akhir Data Mahasiswa : ");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat + "\n");

    }
} 