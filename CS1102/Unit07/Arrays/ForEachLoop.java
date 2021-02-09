public class ForEachLoop {

    public static void main(String[] args) {

        String[] namelist = new String[3];
        namelist[0] = "Jose";
        namelist[1] = "Chikako";
        namelist[2] = "Sakura";

        for ( String name : namelist ) {
            System.out.println( name );
        }
    }
}