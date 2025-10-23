public class UcgenAlanHesap {
    public static void main(String[] args) {
    int a,b,c;
    a=3;
    b=4;
    c=5;
    double u=(a+b+c)/2;
    double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
    System.out.printf("Ucgenin Alani: "+"%.4f\n",alan);
    }
}
