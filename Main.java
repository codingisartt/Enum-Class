import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Days.PAZARTESI.getDay());//1

        System.out.println(EnumDays.CARSAMBA.getDay());//3
        
        EnumDays.CARSAMBA.getDayName();//ÇARŞAMBA

        EnumDays dayPzt=EnumDays.PAZARTESI;
        System.out.println(dayPzt.ordinal());// 0  returns index in array
        System.out.println(dayPzt.name());//returns name
        
        EnumDays[] values=EnumDays.values();
        System.out.println(Arrays.toString(values));//[PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESİ, PAZAR]

        EnumDays strEnum=EnumDays.valueOf("PAZARTESI");//it converts string to enum
        System.out.println(strEnum);//PAZARTESI

    }
}
