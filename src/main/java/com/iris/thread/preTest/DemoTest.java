package com.iris.thread.preTest;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {

    public static void main(String args[]){

        List<String> aL=new ArrayList();
        aL.add("1");
        /* aL.add("asdfaasdfsdfdfs");
        aL.add("afds");*/


      /*  String a=aL.stream().findFirst().get();
        //aL.stream().findFirst().ifPresent(u->u.);
        Boolean aaa="".equals("a");
        System.out.print(" "+aaa);
        */

        if(aL!=null && !aL.isEmpty()){
            //aL.get(0);
            System.out.print(" "+aL.get(0));
        }


    }
}
