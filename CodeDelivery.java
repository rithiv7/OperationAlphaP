public class CodeDelivery{
    public static void main (String [] args){
        Code code1 = new Code("ABCdef123ghi456jklMNO");
        
        System.out.println (code1.hide (2,7 ));
        System.out.println (code1.recover (5,9));
        System.out.println (code1.hide (3,14));
        System.out.println (code1.hide (6,10));
        System.out.println (code1.recover (5,6));
        System.out.println (code1.recover (0,14));
    }
}
