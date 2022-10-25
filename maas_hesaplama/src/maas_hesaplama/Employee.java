    public class Employee {

    String Name;
    double salary;
    double workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;


    Employee(String Name, double salary, double workHours, int hireYear) {
    this.Name = Name;
    this.salary = salary;
    this.workHours = workHours;
    this.hireYear = hireYear;
    this.tax = 0;
    this.bonus = 0;
    this.raiseSalary = 0;
    }


    double tax(){
        if (this.salary < 1000){
            this.tax = 0;
        }
        else if (this.salary > 1000){
            this.tax = this.salary * 0.03;
        }
        return this.tax;
    }

    double bonus(){
        if (workHours > 40){
            this.bonus = (this.workHours - 40) * 30;
        }
        else{
            this.bonus = 0;
        }
        return this.bonus;
        }


    double raiseSalary(){
        int now_year=2021;
        if (now_year - this.hireYear < 10){
            this.raiseSalary = this.salary * 0.05;
        }
        else if (now_year - this.hireYear > 9 && now_year - this.hireYear < 20){
            this.raiseSalary = this.salary * 0.1;
        }
        else if (now_year - this.hireYear > 19){
            this.raiseSalary = this.salary * 0.15;
        }
        return this.raiseSalary;
    }

    @Override
    public String toString() {
    return 
    "Adi : " + this.Name + "\nMaasi : " + this.salary + "\nCalisma Saati : " + this.workHours + 
    "\nBaslangic Yili : " + this.hireYear + "\nVergi : " + this.tax + "\nBonus : " + this.bonus +
    "\nMaas Artisi : " + raiseSalary + "\nVergi ve Bonuslar ile Birlikte Maas : " + (this.salary-this.tax+this.bonus) +
    "\nToplam Maas : " + (this.salary+this.raiseSalary);
        }
    }

