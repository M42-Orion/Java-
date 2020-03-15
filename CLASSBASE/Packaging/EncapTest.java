/*
@File    :   EncapTest.java
@Time    :   2020/03/15 16:08:10
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

//基于修饰符的知识理解封装的概念
// 以下实例中public方法是外部类访问该类成员变量的入口。
// 通常情况下，这些方法被称为getter和setter方法。

package CLASSBASE.Packaging;

public class EncapTest {

    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(String newId) {
        idNum = newId;
    }
}