package week1.day2;

public class CheckTheNumber {
   // public void getPositiveNumbers(){
        //System.out.println("The Positive Numbers are:");
        //for(int i=-2;i<=10;i++){
            //if(i>0 && i<=10){
              //  System.out.println(i);

            //}
        //}
    //}
    //public void getNegativeNumbers(){
      //  System.out.println("The Negative Numbers are:");
        //for(int i=-2;i<=10;i++){
          //  if(i<0 && i>=-2){
            //    System.out.println(i);
            //}
       // }
    //}
    public void getPositiveNegativeNo(){
        for(int i=-2;i<=10;i++){
            if(i>0){
                System.out.println(i+" is a Positive Number");
            }else if(i<0){
                System.out.println(i+ " is a Negative Number");
            }else{
                System.out.println(i+ " Neither Positive nor Negative");
            }
        }
    }
     public static void main(String[] args) {
        CheckTheNumber no = new CheckTheNumber();
            //no.getNegativeNumbers();
            //no.getPositiveNumbers();
            no.getPositiveNegativeNo();
         }
}