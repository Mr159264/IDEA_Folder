import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @auther zhoutl
 * @create 2019/03/27/20:18
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("1");
        list.add(false);
        for (Object o : list) {
            System.out.println("o = " + o);
        }
        method();
        method1();
    }

    private static void method1() {
        System.out.println("嘻嘻");
    }
    //这是一个静态方法

    /**
     * 我只想测试一下文档是啥效果
     */
    public static void method(){
        HashMap<String , Object> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        ArrayList<Score> list = new ArrayList<>();

        if (map == null) {
            System.out.println("map = " + map);
        }else{
            System.out.println("map不为空");
        //idea 真他妈好用啊
        }
        for(Map.Entry<String,Object> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+"value="+entry.getValue());
        }
       /* list.add(new Score("1",12,13,14));
        list.add(new Score("2",56,57,58));
        HashMap<String , Score> map1 = Maps.uniqueIndex();*/



    }
}
