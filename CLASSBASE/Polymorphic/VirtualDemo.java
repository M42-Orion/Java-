/*
@File    :   VirtualDemo.Java
@Time    :   2020/03/15 15:45:59
@Author  :   刘家委 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/
// 多态是同一个行为具有多个不同表现形式或形态的能力。
// 多态性是对象多种表现形式的体现。
// 比如我们说"宠物"这个对象，它就有很多不同的表达或实现，比如有小猫、小狗、蜥蜴等等。那么我到宠物店说"请给我一只宠物"，服务员给我小猫、小狗或者蜥蜴都可以，我们就说"宠物"这个对象就具备多态性。
// 接下来让我们通过实例来了解Java的多态。
// 虚方法
// 我们将介绍在Java中，当设计类时，被重写的方法的行为怎样影响多态性。
// 我们已经讨论了方法的重写，也就是子类能够重写父类的方法。
// 当子类对象调用重写的方法时，调用的是子类的方法，而不是父类中被重写的方法。
// 要想调用父类中被重写的方法，则必须使用关键字super。

/*
以上都不重要，多态实际上就是当你有一个类A，还有一个继承了A的类B，当你声明这个对象的时候，用的是A还是B会影响类当中的方法，包括重写的方法。
*/
package CLASSBASE.Polymorphic;

public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("致电mailCheck使用薪资参考-");
        s.mailCheck();
        System.out.println("\n 致电mailCheck使用薪资参考--");
        e.mailCheck();
    }
}