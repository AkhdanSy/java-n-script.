Public class DemoManusia {
    Public static void main(string[]args){
    Manusia arrMns[]= new Manusia [3];
        Manusia objMns1=new Manusia();
        objMns1.setNama ("Markonah");
        objMns1.setUmur(76);
        Manusia objMns2=new Manusia("MatConan");

    Manusia objMns3=new Manusia ("Bajuri", 45);
        arrMns[0]=objMns1;
        arrMns[1]=objMns2;
        arrMns[2]=objMns3;
        for (int i=0;i<3;i++) {
            System.out.printIn("Nama :"+arrMns[i].getNama());
            System.out.printIn("Umur :"+arrMns[i].getUmur());
            System.out.printIn();
        }
    }
}