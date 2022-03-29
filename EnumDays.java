public enum EnumDays {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESİ(6),
    PAZAR(7);

    private int day;

    private EnumDays(int day){
        this.day=day;
    }

    public int getDay() {
        return day;
    }

    public void getDayName(){
        String day=null;
        switch(this.day){
            case 1:
                day="PAZARTESİ";
                break;
            case 2:
                day="SALI";
                break;
            case 3:
                day="ÇARŞAMBA";
                break;
            case 4:
                day="PERŞEMBE";
                break;
            case 5:
                day="CUMA";
                break;
            case 6:
                day="CUMARTESİ";
                break;
            case 7:
                day="PAZAR";
                break;
        }
        System.out.println(day);
    }


}