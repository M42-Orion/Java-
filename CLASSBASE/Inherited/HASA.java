/*
@File    :   HAS-A.java
@Time    :   2020/03/15 14:30:28
@Author  :   刘家委 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

package CLASSBASE.Inherited;

class Vehicle{}
class Speed{}
public class HASA extends Vehicle{
	private Speed sp;
} //Van类和Speed类是HAS-A关系(Van有一个Speed)，这样就不用将Speed类的全部代码粘贴到Van类中了，并且Speed类也可以重复利用于多个应用程序。
