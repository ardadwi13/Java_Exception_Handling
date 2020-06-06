//SALAH
    public static void main (String[] args){
        int n = 0;
    n = System.in.read();
    System.out.println("Hasil : " +(char)n);
    //Apabila Dijalankan Akan Error Sebab code harus menggunakan try catch
    }

    //BETUL
        public static void main (String[]args){
            try {
                System.out.print("Input Kata :  ");
                char n =(char) System.in.read();
                System.out.println("Hasil : "  + n);
                //input : Bogor
                //output : B
            }catch (Exception e){
                system.out.println("Errror : " + e.getMessage());
            }
        }