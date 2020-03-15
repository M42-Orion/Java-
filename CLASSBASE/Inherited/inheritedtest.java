/*
@File    :   inheritedtest.jav
@Time    :   2020/03/15 14:19:53
@Author  :   刘家委 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

package CLASSBASE.Inherited;

public class inheritedtest extends test {//继承同包当中的test类

    public static void main(String[] args) {
        test a = new test();
        System.out.print(a instanceof test);
        //可以使用 instanceof 运算符来检验Mammal和dog对象是否是Animal类的一个实例。
    }
}