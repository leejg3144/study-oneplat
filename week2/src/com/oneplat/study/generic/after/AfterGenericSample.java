package com.oneplat.study.generic.after;


/*************
 * 제네릭 타입 이름 (필수는 아니지만 제네릭 선언시 지켜야하는 규)
 * E(요소:Element) K(키:Key) N(숫자:Number) T(타입:Type) V(값:Value)
 *************/
public class AfterGenericSample {
    public static void main(String[] ar){
        AfterGenericSample ex = new AfterGenericSample();
        ex.checkAfterGeneric();
    }

    public void checkAfterGeneric(){
        AfterGeneric<String> generic1 = new AfterGeneric<>();
        generic1.setValue(new String());
        AfterGeneric<StringBuffer> generic2 = new AfterGeneric<StringBuffer>();
        generic2.setValue(new StringBuffer());
        AfterGeneric<StringBuilder> generic3 = new AfterGeneric<StringBuilder>();
        generic3.setValue(new StringBuilder());

        String temp1 = generic1.getValue();
        StringBuffer temp2 = generic2.getValue();
        StringBuilder temp3 = generic3.getValue();
    }
}
