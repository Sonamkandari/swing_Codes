 class Employee {
     String name;
     String address;
     double salary;
     String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {// we made a constructore here
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void calculateBonus() {
        System.out.println("Calculating bonus for " + jobTitle + " " + name);
    }

    public void generatePerformanceReport() {
        System.out.println("Generating performance report for " + jobTitle + " " + name);
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {// constructor of manager class we made here 
        super(name, address, salary, "Manager");
    }

    public void manageProject() {// we made a method here 
        System.out.println("Managing a project as a Manager");
    }
}

class Developer extends Employee {//developer is a sub class of base class employee 
    public Developer(String name, String address, double salary) {// we made a constructor here to declare the properties 
        super(name, address, salary, "Developer");
    }

    public void Development() {
        System.out.println("Developing a Website  as a Developer");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary,"programmer");
    }
    public void writeCode(){
    System.out.println("writing a code as a programmer");
 }
}

public class Dit1 {
    public static void main(String[] args) {
        Manager manager = new Manager("sonam", "Raipur tunwala ", 80000);
        Developer developer = new Developer("Ri", "6 number Puliya", 90000);
        Programmer programmer = new Programmer("Ram", "Ladpur", 90000);

        manager.calculateBonus();
        manager.generatePerformanceReport();
        manager.manageProject();

        developer.calculateBonus();
        developer.generatePerformanceReport();
        developer.Development();

        programmer.calculateBonus();
        programmer.generatePerformanceReport();
        programmer.writeCode();
    }
}
