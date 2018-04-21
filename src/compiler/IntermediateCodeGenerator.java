package compiler;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class IntermediateCodeGenerator extends GrammarBaseListener {
	 	int count = 0;
	    private LinkedHashMap<String, String> symbolTable = new LinkedHashMap<String, String>();
	    public static List<String> intermediateFile = new ArrayList<String>();	   
	   
        /* Overriding the default implementation of exitProgram in GrammarBaseListener */
	    @Override 
	    public void exitProgram(GrammarParser.ProgramContext context) {
	        intermediateFile.add("terminate");
	    }
    
        

}
