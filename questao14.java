public class MDC {
    //Algoritmo de Euclides recursivo
    public static int mdcRecursive(int a, int b){
        if(b == 0) return a;
        return mdcRecursive(b, a % b);
    }
    //Algoritmo de Euclides iterativo
    public static int mdcIterative(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) {
        //Teste da versão recursiva
        System.out.println("MDC recusive");
        System.out.printf("mdc(30, 60) = %d\n", mdcRecursive(30, 60));
        System.out.printf("mdc(50, 12) = %d\n", mdcRecursive(50, 12));
        System.out.printf("mdc(100, 11) = %d\n", mdcRecursive(100, 11));
        //Teste da versão iterativa
        System.out.println("\nMDC iterative");
        System.out.printf("mdc(30, 60) = %d\n", mdcIterative(30, 60));
        System.out.printf("mdc(50, 12) = %d\n", mdcIterative(50, 12));
        System.out.printf("mdc(100, 11) = %d", mdcIterative(100, 11));
    }
}