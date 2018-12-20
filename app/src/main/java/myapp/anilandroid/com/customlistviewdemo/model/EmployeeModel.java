package myapp.anilandroid.com.customlistviewdemo.model;

public class EmployeeModel {
    String Name;
    String CompanyName;
    String Department;
    String Designation;
    String officeAddress;

    public EmployeeModel(String name, String companyName, String department, String designation, String officeAddress) {
        this.Name = name;
        this.CompanyName = companyName;
        this.Department = department;
        this.Designation = designation;
        this.officeAddress = officeAddress;
    }

    public EmployeeModel() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }
}
