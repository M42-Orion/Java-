/*
@File    :   Salary.java
@Time    :   2020/03/15 15:43:24
@Author  :   刘家委 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/
package CLASSBASE.Polymorphic;

public class Salary extends Employee {
    private double salary; // Annual salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("在mail内薪资等级检查 ");
        System.out.println("邮寄支票到" + getName() + "花费" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("计算工资" + getName());
        return salary / 52;
    }
}