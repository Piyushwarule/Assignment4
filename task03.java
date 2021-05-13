import java.util.Arrays;
 
public class task03 {
 
 public static void main(String args[]){
 
 String[] strMonths = new String[]{"January", "February", "March", "April", "May"};
 
 String strFind1 = "March";
 
 
 boolean contains = false;
 
 for(int i=0; i < strMonths.length; i++){
 
 if(strMonths[i].equals(strFind1)){
 
 contains = true;
 break;
 
 }
 }
 
 if(contains){
 System.out.println("String array contains String " + strFind1);
 }else{
 System.out.println("String array does not contain String " + strFind1);
 }
 }}
 