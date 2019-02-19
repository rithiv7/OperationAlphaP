package Code;

public class Code {
    private String myCode;
    
    private String beforeX;
    //private String afterX; 
    
    public Code (String code) {
        myCode = code;
        beforeX = code; 
    }
    
    public String getCode() {
        return myCode;
    }
    
    public String hide (int p1 , int p2 ){
        int y = myCode.length();
        String beggining = myCode.substring(0,p1);
        String end = myCode.substring(p2,y);
        String afterX = "";
        while (p1 < p2) {
            afterX = afterX + "X";
            p1++; 
        }
        myCode = beggining + afterX + end ; 
        return myCode; 
    }
    
    public String recover (int p1,int p2 ){
        int y = myCode.length(); 
        String beggining = myCode.substring(0,p1);
        String end = myCode.substring(p2,y);
        //Changing X back into orginal characters
        String afterX = beforeX.substring(p1,p2);
        myCode = beggining + afterX + end; 
        return myCode; 
    }
}
