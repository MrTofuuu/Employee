public class EmployeeApp {
    public static void main( String [ ]args){
        Employee employee1 = new Employee("Susan Meyers",47899,"Accounting","Vice President");
        Employee employee2 = new Employee("Mark Jones",39119,"IT","Programmer");
        Employee employee3 = new Employee("Joy Rogers",81774,"Manufacturing","Engineer");
        System.out.println("Name\t\tID\t\tDepartment\t\tPosition");
        System.out.println(employee1.getName()+"\t"+employee1.getId()+"\t\t"+employee1.getDepartment()+"\t\t"+employee1.getPosition());
        System.out.println(employee2.getName()+"\t"+employee2.getId()+"\t\t"+employee2.getDepartment()+"\t\t\t"+employee2.getPosition());
        System.out.println(employee3.getName()+"\t"+employee3.getId()+"\t\t"+employee3.getDepartment()+"\t\t"+employee3.getPosition());
    }
}
