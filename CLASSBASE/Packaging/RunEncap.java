/*
@File    :   RunEncap.java
@Time    :   2020/03/15 16:10:51
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

// 在面向对象程式设计方法中，封装（英语：Encapsulation）是指，一种将抽象性函式接口的实作细节部份包装、隐藏起来的方法。
// 封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。
// 要访问该类的代码和数据，必须通过严格的接口控制。
// 封装最主要的功能在于我们能修改自己的实现代码，而不用修改那些调用我们代码的程序片段。
// 适当的封装可以让程式码更容易理解与维护，也加强了程式码的安全性。


package CLASSBASE.Packaging;

public class RunEncap {

    public static void main(String args[]) {
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
    }
}