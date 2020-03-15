package Modifier.javaprivate;

/**
 * InnerLogger
 */
public class Logger {
    private String format;
    public String getFormat() {
       return this.format;
    }
    public void setFormat(String format) {
       this.format = format;
    }
    public static void main(String []args) {
        Logger newlogger = new Logger();
        newlogger.setFormat("这是一个参数");
        // System.out.println(newlogger.getFormat());
        System.out.print(newlogger.format);
    }
 }