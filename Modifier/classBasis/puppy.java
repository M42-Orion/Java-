/*
@File    :   puppy.java
@Time    :   2020/03/13 22:01:48
@Author  :   刘家委 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

package Modifier.classBasis;

/**
 * puppy
 */
public class puppy {

    int puppyAge;

    public puppy(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("这个类输出的变量是：" + name);
    }
    public void setAge(int age){
        puppyAge = age;
    }
    public int getAge() {
        System.out.println("这里有一个变量是"+puppyAge);
        return puppyAge;
    }
    public static void main(String []args) {
        // 创建对象
        puppy mypuppy = new puppy("望");
        // 通过方法来设定age变量
        mypuppy.setAge(2);
        // 调用另一个方法来获取age
        mypuppy.getAge();
        // 可以直接访问成员变量
        System.out.println("年龄是"+mypuppy.getAge());
        
        System.out.println("年龄是"+mypuppy.puppyAge);
    }
}