import java.util.*;

public class Employee_Test {
    static List<Employee> empList=new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Employee to add");

        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("Enter details for Employee "+i);
            int id=sc.nextInt();
            String name=sc.next();
            double salary=sc.nextDouble();
            Employee employee=new Employee(id,name,salary);
            empList.add(employee);
        }

        empList.sort(Comparator.comparingDouble(Employee::getSalary));

        empList.forEach(o->{
            System.out.println(o.getId());
            System.out.println(o.getName());
            System.out.println(o.getSalary());
        });



    }





}
class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setSalary(double salary){
        this.salary=salary;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    double getSalary(){
        return salary;
    }
}
