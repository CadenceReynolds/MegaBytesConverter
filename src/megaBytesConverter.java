public class megaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if(kilobytes < 0){
            System.out.println("Negative KB cannot exist");
        } else{
            int mega = kilobytes / 1024;
            int kb = kilobytes % 1024;
            String result = String.format("%s KB = %s MB and %s KB", kilobytes, mega, kb);
            System.out.println(result);
        }
    }

}
