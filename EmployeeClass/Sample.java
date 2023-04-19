package EmployeeClass;


class employee{

    String name;
    int salary;

    public void setSalary(int x){
        salary = x;
    }

    public void setName(String n){
        name = n;
    }

    public void getName(){
        System.out.println(name);
    }
    public void getSalary(){
        System.out.println(salary);
    }


}


public class Sample {
    public static void main(String[] args) {
        employee emp1 = new employee();
        employee emp2 = new employee();

        emp1.setName("Aman");
        emp1.setSalary(20000);
        emp1.getName();
        emp1.getSalary();



    }
}
