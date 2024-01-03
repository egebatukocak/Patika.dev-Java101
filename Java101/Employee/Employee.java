public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary, int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if(this.salary>=1000){
            double tax = this.salary * 3.0/100;
            return tax;
        }
        return 0;

    }
    public double bonus(){
        if (this.workHours>=40){
            int bon=(this.workHours-40)*30;
            return bon;
        }
        return 0;
    }
    public double raiseSalary(){
        double rs;
        if((2021-this.hireYear)<10){
            rs = this.salary * 5.0/100;
            return rs;
        }else if((2021-this.hireYear)<20 && (2021-this.hireYear>=10)){
            rs = this.salary * 10.0/100;
            return rs;
        }else{
            rs = this.salary * 15.0/100;
            return rs;
        }
    }
    public String toString(){
        return "Adı : "+this.name+"\n"+"Maaşı : "+this.salary+"\n"+"Çalışma Saati : "+this.workHours+"\n"+"Başlangıç Yılı : "+this.hireYear+"\n"+"Vergi : "+this.tax()+"\n"+
                "Bonus : "+this.bonus()+"\n"+"Maaş Artışı : "+this.raiseSalary()+"\n"+"Vergi ve Bonuslar ile birlikte maaş : "+((this.salary+this.bonus())-this.tax())+"\n"+
                "Toplam Maaş : "+(((this.salary+this.bonus())-this.tax())+this.raiseSalary());
    }

}
