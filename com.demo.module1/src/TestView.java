import sun.applet.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @auther zhoutl
 * @create 2019/06/27/20:50
 */
public class TestView {


    public List<Father> getFatherList(){
        List<Father> segiInfo=new ArrayList<>();



        List<Son> segiSon=new ArrayList<>();

        segiSon.add(new Son(5,"E",2));
        segiSon.add(new Son(6,"F",2));
        Son[] sons=new Son[2];
        segiSon.toArray(sons);


        Father father=new Father(1,"A",0,null);
        Father father1=new Father(2,"B",0,sons);
        Father father2=new Father(3,"C",0,null);
        Father father4=new Father(4,"D",0,null);
        segiInfo.add(father);
        segiInfo.add(father1);
        segiInfo.add(father2);
        segiInfo.add(father4);


        return  segiInfo;
    }

    private List<Father> getFatherList1() {
        List<Father> segiInfo=new ArrayList<>();



        List<Son> segiSon=new ArrayList<>();

        segiSon.add(new Son(10,"E",8));
        Son[] sons=new Son[1];
        segiSon.toArray(sons);


        Father father=new Father(7,"A",0,null);
        Father father1=new Father(8,"B",0,sons);
        Father father2=new Father(9,"C",0,null);
        segiInfo.add(father);
        segiInfo.add(father1);
        segiInfo.add(father2);


        return  segiInfo;
    }

    public static void main(String[] args) {
        TestView testView = new TestView();
        List<Father> segi=testView.getFatherList();
        List<Father> item=testView.getFatherList1();
        List<String> codes=new ArrayList<>();
        for(Father items:item){
            codes.add(items.Code);
            if(items.lowInfo!=null&&items.lowInfo.length>0){
                for(Son s:items.lowInfo){
                    codes.add(s.Code);
                }
            }
        }

        List<FatherTest> returnInfo=new ArrayList<>();
        for(Father segiModel:segi){
            FatherTest fatherTest = new FatherTest();
            fatherTest.setFatherId(segiModel.fatherId);
            fatherTest.setCode(segiModel.Code);
            fatherTest.setIsChoose(0);
            fatherTest.setUpfatherId(segiModel.upfatherId);
            for(String code:codes){
                if(code.equals(segiModel.Code)){
                    fatherTest.setIsChoose(1);
                    List<SonTest> soninfolist=new ArrayList<>();
                    SonTest[] sonTests=null;
                    if(segiModel.lowInfo!=null&&segiModel.lowInfo.length>0){
                        for(Son sonInfo:segiModel.lowInfo){
                            SonTest sonTest=new SonTest();
                            sonTest.setCode(sonInfo.Code);
                            sonTest.setFatherId(sonInfo.fatherId);
                            sonTest.setUpfatherId(sonInfo.upfatherId);
                            sonTest.setIsChoose(0);
                            Two: for(String codeSon:codes){
                                if(codeSon.equals(sonInfo.Code)){
                                    sonTest.setIsChoose(1);
                                    break Two;
                                }
                                soninfolist.add(sonTest);

                            }
                        }
                    }
                    if(soninfolist!=null&&soninfolist.size()>0){
                        sonTests=new SonTest[soninfolist.size()];
                        soninfolist.toArray(sonTests);
                    }
                    fatherTest.setLowInfo(sonTests);
                    returnInfo.add(fatherTest);

                }
            }
        }

        System.out.println(returnInfo.toString());


    }


}
