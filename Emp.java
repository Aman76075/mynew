public class emp {
    emp(){
        System.out.println("Hello Default Constructor Called.");
    }
    public void disp(){
        System.out.println("Hellp this is method called.");
    }
    public static void main(String[] args){
        emp e=new emp();
        e.disp();
        System.out.println("Hello World");
    }
}
