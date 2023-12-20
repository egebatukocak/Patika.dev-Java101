public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    double matAvarage;
    double fizikAvarage;
    double kimyaAvarage;
    boolean isPass;

    public Student(String name,String stuNo,int classes,Course mat,Course fizik,Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;

    }
    public void addBulkExamNote(int m1,int m2,int f1,int f2, int k1, int k2){
        if (m1 >= 0 && m1 <= 100) {
            this.mat.sozluNote = m1;
        }
        if (m2 >= 0 && m2 <= 100) {
            this.mat.sinavNote = m2;
        }

        if (f1 >= 0 && f1 <= 100) {
            this.fizik.sozluNote = f1;
        }
        if (f2 >= 0 && f2 <= 100) {
            this.fizik.sinavNote = f2;
        }

        if (k1 >= 0 && k1 <= 100) {
            this.kimya.sozluNote = k1;
        }
        if (k2 >= 0 && k2 <= 100) {
            this.kimya.sinavNote = k2;
        }
    }
    public void isPass(){
        if(this.mat.sozluNote==0 || this.mat.sinavNote==0 || this.fizik.sozluNote==0 || this.fizik.sinavNote==0 || this.kimya.sozluNote==0 || this.kimya.sinavNote==0){
            System.out.println("Notlar Tam Olarak Girilmemiştir!!");
        }else{
            this.isPass = isCheckPass();
            printNote();
            if(this.isPass){
                System.out.println("Sınıfı Geçti.");
            }else{
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAvarage(){
        this.matAvarage = 0.2 * mat.sozluNote + 0.8 * mat.sinavNote;
        this.fizikAvarage = 0.2 * fizik.sozluNote + 0.8 * fizik.sinavNote;
        this.kimyaAvarage = 0.2 * kimya.sozluNote + 0.8 * kimya.sinavNote;
        this.avarage=(this.matAvarage + this.fizikAvarage + this.kimyaAvarage)/3;
    }
    public boolean isCheckPass() {
        calcAvarage();
        boolean b = this.avarage > 55;
        return b;
    }
    public void printNote(){
        System.out.println("====================");
        System.out.println("Öğrencinin Adı : "+this.name);
        System.out.println("Matematik Notu : "+this.matAvarage);
        System.out.println("Fizik Notu : "+this.fizikAvarage);
        System.out.println("Kimya Notu : "+this.kimyaAvarage);
        System.out.println("Ortalama : "+this.avarage);
    }
}
