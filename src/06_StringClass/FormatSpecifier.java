public class FormatSpecifier{
    public static void main(String[] args) {
        int num0 = -87;
        int num1 = 3245;
        float num2 = 536.342626f;
        float num3 = 0.000536342626f;
        String str = "Vijay Ramchandra Gawade";
        char ch = 'V';

        System.out.format("Num1=%d(Decimal)  =%o(Octal)  =%x(HexaDecimal)\n",num1,num1,num1);
        System.out.format("Num0=%1$0+5d  \t Num1=%2$08d\n",num0,num1);

        System.out.format("Num2= %1$010.3f \t Num2= %1$e  \t Num2= %1$g \n",num2);
        System.out.format("Num3= %1$010.5f \t Num3= %1$e  \t Num3= %1$g \n",num3);

        System.out.format("Char=%c\n",ch);

        System.out.format("str=%30s\n",str);    // right align
        System.out.format("str=%-30s\n",str);   // left align

        /*
        Output:
            Num1=3245(Decimal)  =6255(Octal)  =cad(HexaDecimal)
            Num0=-0087       Num1=00003245
            Num2= 000536.343         Num2= 5.363427e+02      Num2= 536.343
            Num3= 0000.00054         Num3= 5.363426e-04      Num3= 0.000536343
        */
    }
}