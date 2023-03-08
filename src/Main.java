public class Main {
    public static void main(String[] args) {
        //测试创建
        SqueneceList<String> s1= new SqueneceList<>(10);
        s1.insert("man");
        s1.insert("woman");
        s1.insert("small thing");
        s1.insert("Big mouth",1);

        //测试获取
        String s=s1.get(0);
        String s2=s1.get(2);
        System.out.println("获取索引0处的字符串为："+s);
        System.out.println("获取索引1处的字符串为："+s2);
        System.out.println("此时man的地理位置："+s1.indexOf("man"));
        //测试删除
        String removezerodis = s1.remove(0);
        System.out.println("删除0后，第一个位置的内容："+s1.get(0));
        System.out.println("第二个位置的索引："+s1.get(1));
        System.out.println("此时woman的地理位置："+s1.indexOf("woman"));


        //测试清空

    }
}