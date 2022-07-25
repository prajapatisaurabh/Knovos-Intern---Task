import static java.lang.System.out;
class HelloWorld {
    public static void main(String[] args) {
         int counter = 0;
        int offset = 100;
        int max = Integer.MAX_VALUE;
        
        for(int i=0; i <= offset; ++i)
            counter = counter++;
            
        out.print(counter);
        out.print("-");
        for(int i = max - offset; i <= max; i++)
            counter = --counter;
            
        out.print(counter);
    }
}
