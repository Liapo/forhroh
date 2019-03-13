public class Number {
    public static void main(String []args){
        int rand1=(int)(Math.random()*155);
        if(rand1>24 || rand1<101){
            System.out.print("Число"+rand1+"содержиться в (25;100)");
        }
        else
            System.out.print("Число"+rand1+"не содержиться в (25;100");
    }
}
