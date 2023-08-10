// 64. Write a JAVAprogram to find length of a string and compare and concatenate two strings

class StringLength{
    public static void main(String[] args) {
        String a="GOWRI";
        String b="kumar";
       
        // lowercase and uppercase methods
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        
        // concat and length methods
        System.out.println(a.concat(b));
        System.out.println(b.length());
        
        // trim and isEmpty methods;
        String c="    gowrikumar     ";
        String d="";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
        
        // charAt and isEmpty methods
        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('O'));
        System.out.println(b.equals(a));
    
    // comparession method
    if(a==b){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    }
}