import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) throws Exception{

        FileReader fr = new FileReader("C:/Users/Anomu/Desktop/santako.txt");
        BufferedReader bfr = new BufferedReader(fr);
        String rdln = bfr.readLine();

        Pattern pareNoel = Pattern.compile("\\*<]:-DOo");
        Pattern ren = Pattern.compile(">:o\\)");
        Pattern fullet = Pattern.compile("[^*]<]:-D");

        int paresNoel = 0;
        int rens = 0;
        int fullets = 0;

        String match = "";

        while (rdln!=null){

             char[] line = rdln.toCharArray();

            for (int i = 0; i < line.length; i++) {
                match = match + line[i];

                Matcher pare_Noel = pareNoel.matcher(match);
                Matcher ren_ = pareNoel.matcher(match);
                Matcher fullet_ = pareNoel.matcher(match);

                while(pare_Noel.find()){
                    match = "";
                    paresNoel++;
                }
                while(ren_.find()){
                    match = "";
                    rens++;
                }
                while (fullet_.find()){
                    match = "";
                    fullets++;
                }
            }

            rdln = bfr.readLine();

            if(paresNoel>0) System.out.println("Pare Noel ("+paresNoel+")");
            if(rens>0) System.out.println("Ren ("+rens+")");
            if(fullets>0) System.out.println("Fullet ("+fullets+")");

            paresNoel = 0;
            rens = 0;
            fullets = 0;
            match = "";
        }

    }
}
