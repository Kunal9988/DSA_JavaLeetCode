// here i use a simple string but one ase is not solved so i am taking a stack to continue 
//resolve prb

public class Parenthesis {
    
    public static boolean validString(String s){

        while (true) {
            if (s.contains("()")){
                s=s.replace("()", "");
            }
             if (s.contains("[]")){
                s=s.replace("[]", "");
            }
             if (s.contains("{}")){
                s=s.replace("{}", "");
            }
            else{
                 return s.isEmpty();
            }
        }
    }
  public static void main (String []args){
     

    String s = "{}";
    System.out.println(validString(s));

    }
}
