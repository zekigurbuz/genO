import java.util.*;
import java.io.*;

public class genO {

    FastIO file;

    private void run(String[] args) {
        file = new FastIO();
        if (args.length > 2) {
            file.println("Too many arguments!");
            stop(1);
        }
        if (args.length == 0) {
            file.println("Too few arguments!");
            stop(1);
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("--help")) {
               file.println("Usage: 'java genO [input file] [output file]'");
               file.println("Example: 'java genO input.txt output.txt'");
               stop(0);
            }
            else {
                file.println("Invalid argument!");
                stop(1);
            }
        }
        
    }

    void stop(int code) {
        if (code != 0) {
            file.println("Try using 'java genO --help' for more information about execution flags and how to use genO.");
        }
        file.out.flush();
        file.out.close();
        System.exit(0);
    }
    
    public static void main(String[] args) { new genO().run(args); }
}