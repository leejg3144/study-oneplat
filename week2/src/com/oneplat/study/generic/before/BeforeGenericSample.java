package com.oneplat.study.generic.before;

public class BeforeGenericSample {

    public static void main(String[] ar){
        BeforeGenericSample ex = new BeforeGenericSample();
        ex.checkBeforeGeneric();
    }

    public void checkBeforeGeneric(){
        BeforeGeneric generic1 = new BeforeGeneric();
        generic1.setValue(new String());

        BeforeGeneric generic2 = new BeforeGeneric();
        generic2.setValue(new StringBuffer());

        BeforeGeneric generic3 = new BeforeGeneric();
        generic3.setValue(new StringBuilder());
        // hundreds of lines later
        // hundreds of lines later
        // hundreds of lines later
        String temp1 = (String)generic1.getValue();
        StringBuffer temp2 = (StringBuffer)generic2.getValue();
        StringBuilder temp3 = (StringBuilder)generic3.getValue();
    }

    public void checkObject(BeforeGeneric object){
        Object tempObject = object.getValue();
        if(tempObject instanceof String){
            System.out.println("String object");
        }else if(tempObject instanceof StringBuffer){
            System.out.println("StringBuffer object");
        }else if(tempObject instanceof StringBuilder){
            System.out.println("StringBuilder object");
        }
    }
}
