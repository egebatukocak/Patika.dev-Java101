public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name,int classes,String stuNo,Course mat,Course fizik,Course kimya){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
    }
    public void addBulkExamNote(int mat,int fizikSinav,int fizikSozlu,int kimya){
        if(mat>=0 && mat<=100)
            this.mat.note1 = mat;
        if(fizikSinav>=0 && fizikSinav<=100)
            this.fizik.note1 = fizikSinav;
        if(fizikSozlu>=0 && fizikSozlu<=100)
            this.fizik.note2 = fizikSozlu;
        if(kimya>=0 && kimya<=100)
            this.kimya.note1 = kimya;
    }
    public void isPass() {
        if (this.mat.note1 == 0 || this.fizik.note1 == 0 || this.fizik.note2==0 || this.kimya.note1 == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAvarage() {
        this.avarage = ((this.fizik.note1 * 0.2+ this.fizik.note2 * 0.8)+ this.kimya.note1 + this.mat.note1) / 3;
    }
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note1);
        System.out.println("Fizik Notu : " + (this.fizik.note1 * 0.2+ this.fizik.note2 * 0.8));
        System.out.println("Kimya Notu : " + this.kimya.note1);
    }
}
