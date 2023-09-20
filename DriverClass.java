import java.util.ArrayList;



public class DriverClass {
    public static void main(String[] args) {

    String fullName = "Erika T. Jones";
    String employeeNumber = "ej789";
    double payRate = 100.0, hoursWorked = 1.0;
    // TA will change the payrate and the hours worked to test your code
    Employee e;
    e = new Employee(fullName, employeeNumber, payRate, hoursWorked);
    System.out.println(e); // To Test your toString method
    e.printCheck(); // This prints the check of Erika T. Jones
    Company company = new Company();
    company.hire ( new Employee ("Saeed Happy", "sh895" , 2 , 200) );
    company.hire (e);
    company.printCompanyInfo();
    company.hire( new Employee("Enrico Torres" , "et897" , 3 , 150) );
    //You may add as many employees to company as you want.
    //The TAs will add their own employees
    //Make sure that each employee of company has a unique employeeNumber
    company.printCheck("ab784");
    company.deleteEmployeesBySalary(256.36);
    company.reverseEmployees();
    System.
    out.println( company.SearchByName("WaLiD WiLLiAms") );
    company.printEmployees();
    System.
    out.println("Bye!");
    }
    } // DriverClass
    //____________________________
    class Employee {
    //Add the private attributes and the methods as mentioned above...
        private String fullName;
        private String employeeNumber;
        private double payRate;
        private double hoursWorked;

    

    // Employee constructor
    public Employee(String fullName, String employeeNumber, double payRate, double hoursWorked) {
        this.fullName = "Ooga Booga";
        payRate = 16;
    }
} // end of class Employee


    //____________________________
    class Company {
    private ArrayList<Employee> employeeList;
    private String companyName;
    private static String
    companyTaxId;
    //Add static Setters and Getters for companyTaxId. We assume that
    //all companies share the same companyTaxId and that may change
    //Add Setter and Getter for the companyName
    //No need to add a Setter and Getter for employeeList
    public Company() {
    employeeList = new ArrayList<>();
    companyName = "People's Place";
    companyTaxId = "v1rtua7C0mpan1";
    }
    public boolean hire ( Employee employee ) {
    //Add empoyee to employeeList
    //Note well that we can't add an employee whose employeeNumber already //assigned to another employee. In that case, this method returns false.
    //This method returns true otherwise
    }
    public void printCompanyInfo() {
    //This method prints the compay name, the tax id and the current number //of employees
    //You may choose to print that any way you like!
    }
    public void printEmployees() {
    //This methods prints all employees (One employee per line)
    //Note that you already have toString in Employye
    }
    public int countEmployees( double maxSalary ) {
    //This method returns the number of employees paid less than maxSalary
    }
    public boolean SearchByName (String fullName ) {
    //This method returns true if fullName exists as an employee.
    //It returns false otherwise
    //this is a not a case sensitive search.
    }
    public void reverseEmployees () {
    //This method reverses the order in which the employees were added to //the list. The last employee is swapped with the first employee, the //second last with the second and so on..
    }
    public void deleteEmployeesBySalary (double targetSalary ) {
    //This method deletes all employees who are paid targetSalary as a gross //salary
    }
    public void printCheck ( String employeeNumber) {

        System.out.println("ooga booga money");
    //This method prints the check of the employee whose employee number is
    //employeeNumber. It prints NO SUCH EMPLOYEE EXISTS if employeeNumber is //not a registered employee number.
    }
    public void netPay () {

    }


    }//end of class Company