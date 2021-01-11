public class Throws {
    public static void sum() throws ArithmeticException{
        System.out.println(2/0);
    }
    public static void main(String[] args) throws ArithmeticException   {
//    try{
//        Throws.sum();
//    }catch(ArithmeticException e){
//    };
        Throws.sum();
}


}
