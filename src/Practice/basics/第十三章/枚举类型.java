package Practice.basics.第十三章;

/**
 * @Title: 枚举类型
 * @Author Mr.罗
 * @Package Practice.basics.第十三章
 * @Date 2023/10/11 11:26
 * @description: 枚举类型创建
 */
public enum 枚举类型 {
    /*
    单例设计模式
     */
    SPRING("万物复苏"),
    SUMMER("烈日炎炎"),
    AUTUMN("秋草枯黄"),
    WINTER("白雪皑皑");

    private String remarks;

    private 枚举类型(String remarks) {
        this.remarks = "我是" + this.toString() + ",我到来" + remarks + "。";
    }

    public String getRemarks() {
        return remarks;
    }

    public static void main(String[] args) {
        枚举类型[] values = 枚举类型.values();
        for (/*int i = 0; i < values.length; i++*/枚举类型 s : values) {
//            System.out.println(values[i].getRemarks());
            System.out.println(s.getRemarks());
        }
    }
}
