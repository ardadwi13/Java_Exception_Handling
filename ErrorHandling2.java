//SALAH
Public Static void main(String[] args){
    byte[] b = new byte[5];
    try{
        System.in.read(b);
    }
    Catch (java.io.IOException e);
    System.out.println("Hasil :" +(char) b[0] + (char) b[1] + (char) b[2]);
        //Error Sebab setelah catch () seharusnya ditambahkan {}
    }

//BETUL
Public Static void main(String[] args){
    byte[] b = new byte[5];
    try{
        System.out.print("masukan Kata : ");
        System.in.read(b);
        System.out.println("Hasil :" +(char) b[0] + (char) b[1] + (char) b[2]);

        //input : Ngulik
        //output :Ngu
    }
       
         Catch (java.io.IOException e){
             System.err.println(e.getMessage());
             
         }
}

