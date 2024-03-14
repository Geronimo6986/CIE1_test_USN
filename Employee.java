public class Employee extends Extended_Employee {
    String Name = "Shashank";
    String id = " Dev144";
    float Salary = 56000;

    public void display() {
        System.out.println("The details of Employee are : ");
        System.out.println("Name:" + Name);
        System.out.println("Employee ID :" + id);
        System.out.println("Salary :" + Salary);
    }

    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.display();
        Extended_Employee E2 = new Extended_Employee();
        float TotalBonus = Total;
    }
}
 