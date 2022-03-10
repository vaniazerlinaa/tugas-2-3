import java.util.LinkedList;

public class tugas2 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();

        //karakter nama "VANIA ZERLINA UTAMI"
        saya.add("V");
        saya.add("A");
        saya.add("N");
        saya.add("I");
        saya.add("A");
        saya.add(" ");
        saya.add("Z");
        saya.add("E");
        saya.add("R");
        saya.add("L");
        saya.add("I");
        saya.add("N");
        saya.add("A");
        saya.add(" ");
        saya.add("U");
        saya.add("T");
        saya.add("A");
        saya.add("M");
        saya.add("I");

        LinkedList<String> tambahan = new LinkedList<String>();
        tambahan.add("M");
        tambahan.add("I");
        tambahan.add("E");


        System.out.println("Nama sebelum diubah :");
        System.out.println(saya);
        System.out.println("\n");

        saya.addFirst("S");
        saya.add(7,"E");
        saya.add(19,"P");
        saya.addLast("T");
        saya.addAll(tambahan);
        System.out.println("List setelah penambahan karakter : " + saya);
        System.out.println("\n");

        //fungsi mereplace karakter
        saya.set(0,"M");
        saya.set(4,"A");
        saya.set(2,"T");
        saya.set(10,"C");
        saya.set(19,"H");
        saya.set(13,"A");
        System.out.println("List setelah direplace karakter baru: " + saya);
        System.out.println("\n");

        //fungsi Remove
        saya.remove(2);
        saya.remove(3);
        saya.remove(6);
        saya.remove(20);
        saya.remove(14);
        System.out.println("List setalah dilakukan remove : " + saya);
        System.out.println(" \n");

        //Fungsi push
        saya.push("TUGAS");
        saya.push("SIAP");
        saya.push("TAMAT");
        System.out.println("List setelah digunakan fungsi push : " + saya);
        System.out.println("\n");

        //Fungsi POP
        saya.pop();
        saya.pop();
        System.out.println("List setelah digunakan fungsi pop : " + saya);
        //System.out.println(saya.pop());

    }
}
    