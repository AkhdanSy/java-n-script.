class Luar {
    private int a;
    public void setA(int nilai) {
        a = nilai;
    }
    Public int getA() {
        return a;
    }
    class Dalam {
        private int x = 10; 
        public void showData() {
            System.out.println("Nilai a dari kelas Luar : " + a);
            System.out.println("Nilai x dari kelas Dalam : " + x);
        }
    }
    Public void showData() {
        Dalam obj = new Dalam();
        obj.showData();
        }
    }
