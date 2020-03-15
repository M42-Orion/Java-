package Modifier.javaprivate;

import Modifier.classBasis.*;/**
 * test
 */
public class test {

    public static void main(String[] args) {
        Logger newlogger = new Logger();
        newlogger.setFormat("这是一个参数");
        // System.out.println(newlogger.getFormat());
        System.out.print(newlogger.getFormat());
        // System.out.print(newlogger.format);//不在同一个类当中，会报错。
        puppy mypuppy = new puppy("望");
        mypuppy.setAge(2);
    }
}