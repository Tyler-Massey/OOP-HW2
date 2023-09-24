import java.util.ArrayList;



public class DriverClass {
    public static void main(String[] args) {

    String fullName = "Erika T. Jones";
    String employeeNumber = "ej789";
    double payRate = 100.0, hoursWorked = 1.0;
    // TA will change the payrate and the hours worked to test your code
    Employee e = new Employee(fullName, employeeNumber, payRate, hoursWorked);

    //System.out.println(e);  To Test your toString method
    Company company = new Company();

    //company.hire (new Employee ("Saeed Happy", "sh895" , 2 , 200) );
    //company.hire (e);
    //company.printCompanyInfo();
    company.hire(new Employee("Enrico Torres" , "et897" , 3 , 150) );
    company.hire(e);

    //company.hire(new Employee("Enrico Torres" , "et897" , 3 , 150) );
    //company.hire (new Employee ("Saeed Happy", "sh895" , 2 , 200) );



   // company.printCheck("ej789"); // This prints the check of Erika T. Jones
    company.printCheck("oogabooga"); // This prints the check of Erika T. Jones
    company.printCheck("et897"); // This prints the check of Erika T. Jones



    //You may add as many employees to company as you want.
    //The TAs will add their own employees
    //Make sure that each employee of company has a unique employeeNumber
    /* 
    company.printCheck("ab784");
    company.deleteEmployeesBySalary(256.36);
    company.reverseEmployees();
    System.out.println( company.SearchByName("WaLiD WiLLiAms") );
    company.printEmployees();
    */
        company.printList();
    System.out.println("Bye!");
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
        this.fullName = fullName;
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getfullName(){
        return fullName;
    }

    public void setEmployeeNumber(String employeeNumber){
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber(){
        return employeeNumber;
    }

    public void setPayRate(double payRate){
        this.payRate = payRate;
    }

    public double getPayRate(){
        return payRate;
    }

    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }



 

} // end of class Employee


    //____________________________
    class Company {
    public ArrayList<Employee> employeeList;
    private String companyName;
    private static String companyTaxId;
    double taxRate = 0.06;

    //Add static Setters and Getters for companyTaxId. We assume that
    //all companies share the same companyTaxId and that may change
    //Add Setter and Getter for the companyName
    //No need to add a Setter and Getter for employeeList
    public Company() {
    employeeList = new ArrayList<>();
    companyName = "People's Place";
    companyTaxId = "v1rtua7C0mpan1";
    }

    public void printList(){
        for (int i = 0; i<employeeList.size(); i++){
            Employee current = employeeList.get(i);
            System.out.println(current.getfullName());
        }

    }

    public boolean hire ( Employee employee ) {

        //System.out.println("Before for loop");
        //System.out.println(employeeList.size());
        if (employeeList.size() > 0){
            for (int i = 0; i<employeeList.size(); i++){
            Employee current = employeeList.get(i);
            //System.out.println(current.fullName +", "+ current);
            if (employee.getfullName() == current.getfullName()){
                System.out.println("Duplicate name");
                return false;
            }

            }
        }
            employeeList.add(employee);
            System.out.println("Added "+ employee.getfullName());
            return true;
         

        
    //Add empoyee to employeeList
    //Note well that we can't add an employee whose employeeNumber already assigned to another employee. In that case, this method returns false.
    //This method returns true otherwise
    //return true;
    }
    public void printCompanyInfo() {
    //This method prints the compay name, the tax id and the current number of employees
    //You may choose to print that any way you like!

        System.out.println("Company name: "+ companyName);
        System.out.println("Tax id: "+ companyTaxId);
        System.out.println("Number of employees: " +employeeList.size());

    }
    public void printEmployees() {
        for(int i = 0; i < employeeList.size(); i++){
            Employee currentEmployee = employeeList.get(i);
            System.out.println(currentEmployee.getfullName());
        }
    //This methods prints all employees (One employee per line)
    //Note that you already have toString in Employee
    }
    public int countEmployees( double maxSalary ) {
    //This method returns the number of employees paid less than maxSalary
    return 100;
    }
    public boolean SearchByName (String fullName ) {
/* 
            if (employeeList.size() > 0){
            for (int i = 0; i<employeeList.size(); i++){
            Employee current = employeeList.get(i);
            //System.out.println(current.fullName +", "+ current);
            if (fullName == current.getfullName()){
                System.out.println("Duplicate name");
                return false;
            }
            else
                System.out.println("Employee does not exist");
            }
        }
    //This method returns true if fullName exists as an employee.
    //It returns false otherwise
    //this is a not a case sensitive search.
    */
    return true;
    
    }
    public void reverseEmployees () {
    //This method reverses the order in which the employees were added to //the list. The last employee is swapped with the first employee, the //second last with the second and so on..
    }
    public void deleteEmployeesBySalary (double targetSalary ) {
    //This method deletes all employees who are paid targetSalary as a gross //salary
    }
    public double netPay(Employee employee){
        // (user.hours * users.payrate) * 0.06
        //double tax = 0.06;
        double grossPay = employee.getHoursWorked() * employee.getPayRate();
        double netPay = grossPay - (grossPay * taxRate);
        return netPay;
    }

    // needs to take a string that is the Employee ID
    public void printCheck ( String employeeID) {

            int flag = 0;

            if (employeeList.size() > 0){
            for (int i = 0; i<employeeList.size(); i++){
            Employee current = employeeList.get(i);
            System.out.println("Name: " + current.getfullName());
            //System.out.println(current.fullName +", "+ current);
            if (employeeID == current.getEmployeeNumber()){
                Employee employee = current;
                System.out.println("Employee found!");
                flag = 1;
                System.out.println("\n------------------------------------------------------------");
                System.out.println("\tEmployee's name: " +employee.getfullName());
                System.out.println("\tEmployee's number: "+employee.getEmployeeNumber());
                System.out.println("\tHourly rate of pay: "+ employee.getPayRate());
                System.out.println("\tHours worked: "+ employee.getHoursWorked());

                double grossPay = employee.getHoursWorked() * employee.getPayRate();

                System.out.println("\n\tTotal Gross Pay: "+ grossPay);
                System.out.println("\n\tDeductions");
                double tax = employee.getHoursWorked() * employee.getPayRate() * taxRate;
                System.out.println("\tTax(6%): "+ tax);
                System.out.println("\n\n\tNet Pay: "+ netPay(employee));
                System.out.println("------------------------------------------------------------\n");
            }
            else {
                //eventually, this is final message
                //System.out.println("No such employee exists!");
                System.out.println("Employee not selected");
            }

            }
        }




        //System.out.println("ooga booga money");
    //This method prints the check of the employee whose employee number is
    //employeeNumber. It prints NO SUCH EMPLOYEE EXISTS if employeeNumber is //not a registered employee number.
    }



    }//end of class Company