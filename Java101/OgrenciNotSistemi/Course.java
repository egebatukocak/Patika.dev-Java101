public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int sozluNote;
    int sinavNote;

    public Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.sozluNote = 0;
        this.sinavNote = 0;
    }
    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher= t;
            System.out.println("İşlem Başarılı.");
        }
        else{
            System.out.println(t.name+" Akademisyeni Bu Dersi Veremez.");
        }
    }
    public void printTeacher(){
        if(this.courseTeacher != null){
            System.out.println(this.name+" Dersinin Akademisyeni : "+ this.courseTeacher.name);
        }else{
            System.out.println(this.name+" Dersine Akademisyen Atanmamıştır.");
        }
    }
}
