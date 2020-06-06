//SALAH
public static void main (String[] args){
    byte [] b = new byte [5];
    System.out.print("Input Bilangan Bulat : ");

    try {
        System.in.read(b);
    }
    catch (java.io.IOException e);
        int N = Integer.valueOf(b).intValue();
        System.out.println("Hasil : " + (N+2));        
        
}
 //Error Sebab setelah catch () seharusnya ditambahkan {}
 //Error sebab valueof() tidak bisa di isi parameter byte


//BENAR
  public static void main (String[] args){
    byte[] b = new byte[5];
    System.out.print("Input Bilangan Bulat : ");

    try{
        System.in.read(b);
    }catch (java.io.IOException e)
    {};
    int N = Integer.valueOf(b[1]).intValue();
    String string = new String(b);
    System.out.println("Hasil : " + (N + 2));
}
//Jika DiJalankan dan input angka : 21
//Maka hasil nya Adalah : 23

//Dan Hanya Bisa Menginput angka