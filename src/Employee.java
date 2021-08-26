public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

 
    // accepts name, idNumber, department, psotion 
    public Employee (String name, int idNumber, String department, String position){
        this.name =name;
        this.idNumber = idNumber;
        this.department = department;
        this.position=position;
    }
    // accepts name and idNumber
    public Employee (String name, int idNumber){
        this.name =name;
        this.idNumber = idNumber;
        this.department="";
        this.position="";
    }
    // no args constructor 
    public Employee (){
        this.name ="";
        this.idNumber=0;
        this.department="";
        this.position="";
    }

    // Accessor methods
    public String getName(){
        return name;
    }
    
    public int getId(){
        return idNumber;
    } 

    public String getDepartment(){
        return department;
    } 
    
    public String getPosition(){
        return position;
    } 

    // Mutator methods
    public void setName(String name){
        this.name = name;
    }
    public void setId(int idNumber){
        this.idNumber = idNumber;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setPosition(String position){
        this.position = position;
    }
    
}
