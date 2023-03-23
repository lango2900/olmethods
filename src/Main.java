public class Main {
    public static void main(String[] args) {

       // overloaded methods - methods that share the same nume but have different parameters
        // method name + parameters = method signature - each method has unique one

  // int x = add(); - would not work bc of non-matching method signatures. instead:

        int x = add(1,2,3,4); // (1 - OLM 1 1,2 - OLM2 .....etc
        System.out.println(x);

    }


static int add(int a, int b) {
    System.out.println("OLM #1");
   return a+b;

} // you cannot duplicate the top method lil bro :deadass: | change parameters

static int sum(int a, int b, int c) {
    System.out.println("OLM #2");
        return a+b+c;
}
static int add(int a, int b, int c, int d) { //data type has to be changed for doubles, char, etc. 
    System.out.println("OLM #3");
        return a+b+c+d;

}

}