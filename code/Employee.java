class Employee {

    String firstName,lastName;
    int age;
    double monthlySalary;
    
    Employee(String firstName, String lastName, int age, double monthlySalary) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.monthlySalary = monthlySalary;
        
    }

    @Override
    public String toString() {
        return ""+ firstName + " " + lastName + ", " + age + ", " + monthlySalary;
    }
    
    
    
    
}
