Public class Lagu {
    private String band;
    private String judul;
    Public void IsiParam(String judul,String band);{
        this.judul= judul;
        this.band= band;
    }
    Public void cetakKeLayar(){
        if(judul==null&&band==null) return;
    System.out.printIn("Judul :"+ judul +"\nBand :" + pencipta);
    }
}
Public class DemoLagu {
    Public static void main (String[]args){
        lagu song=new Lagu();
        song.IsiParam("dance Beside","All American Reject");
        song.cetakKeLayar();
    }
}