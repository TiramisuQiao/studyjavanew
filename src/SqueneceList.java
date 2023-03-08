public class SqueneceList <T> extends Main{
    private T[] eles;//定义用于存放数据的数组
    private int N;//记录当前元素个数
    public SqueneceList(int capacity){
        //初始化数组
        this.eles = (T[])new Object[capacity];
        //初始化长度
        this.N=0;
    }
    public void clear(){
        //将线性表置为空表
        this.N=0;
    }
    public boolean isEmpty(){
        //检查是否为空
        return N==0;
    }
    public int length(){
        //返回线性表的长度
        return N;
    }
    public T get(int i){
        //返回指定位置的数值
        return eles[i];
    }
    public void insert(T t){
        //向线性表中添加元素
        eles[N++]=t;
    }//调试的时候发现这里其实是用到了++N而不是N++，因为要获取新的位置
    public void insert(T t, int i){
        //在指定位置添加元素
        N++;
        //先把i及其后面的元素整体向后移动1位
        for(int index = N;index > i;index--){
            eles[index]=eles[index-1];
        }
        //再把数据插到i索引处
        eles[i]=t;
        //注意，这一段代码是需要优化的
        //考虑是否需要扩容，以及插入的位置是否合理的操作，满了的话还是需要动态数组的
    }
    public T remove(int i){
        T current = eles[i];
        for(int index=i;index<N;index++){ //最后一个元素留下的问题暂时是不考虑的
            eles[index]=eles[index+1];
        }
        N--;
        //a[N-2]=a[N-1]
        //这里返回的是删除的数据

        return current;
        //不能直接返回角标，是因为删除后内容发生了更改。
    }
    public int indexOf(T t){
        //查找元素第一次出现的下标
        for(int index=0;index<N;index++){
            if(t.equals(eles[index])){
                return index;
            }
        }
        return -1;
    }
}
