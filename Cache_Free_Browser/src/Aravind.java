import java.io.IOException;

public class Aravind {

    public static void main(String[] args) throws IOException {

    	String[] Command = new String[2];
    	
//    	Command[0]="cmd.exe";
//    	Command[0]="java -jar New_SGI.jar";

    	
    	Runtime runtime = Runtime.getRuntime();
    	
    	runtime.exec("java -jar New_SGI.jar");
    	
//        try {
//            
//            String command="cmd.exe /c start " + "java -jar New_SGI.jar";
//            
//            // We are running "dir" and "ping" command on cmd
//            Runtime runtime = Runtime.getRuntime();
//            
//            runtime.getRuntime().exec(command);
//            
//            
//            
//        } catch (Exception e) {
//            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
//            e.printStackTrace();
//        }
    }
}