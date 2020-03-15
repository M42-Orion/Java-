/*
@File    :   AbstractDemo.java
@Time    :   2020/03/15 16:03:58
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

package CLASSBASE.abstractclass;

public class AbstractDemo
{
   public static void main(String [] args)
   {
      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);//虽然不能实例化，但是可以通过继承调用。如果我们实例化一个Salary类对象，该对象将从Employee类继承3个成员变量和7个成员方法。

      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();

      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
    }
}