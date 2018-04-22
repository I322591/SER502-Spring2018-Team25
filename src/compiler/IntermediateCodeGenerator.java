package compiler;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class IntermediateCodeGenerator extends RochGrammarBaseListener {
	 	int count = 0;
	    private LinkedHashMap<String, String> symbolTable = new LinkedHashMap<String, String>();
	    public static List<String> intermediateFile = new ArrayList<String>();	   
	   
        /* Overriding the default implementation of exitProgram in GrammarBaseListener */
	    @Override
		public void exitGrammarstart(RochGrammarParser.GrammarstartContext context) {
	        intermediateFile.add("terminate");
	    }
    
        /* Overriding the default implementation of exitDeclaration in GrammarBaseListener */
        @Override
		public void exitVariableDeclaration(RochGrammarParser.VariableDeclarationContext context) {
	        int lineCount = context.getChildCount();

	        if (lineCount == 3) {
	            if (context.getChild(1).getText().equals("=")) {
	                if (symbolTable.containsKey(context.getChild(2).getText())) {
	                    intermediateFile.add("PUSH " + context.getChild(0).getText() + " "
	                            + symbolTable.get(context.getChild(2).getText()));
	                } else {
	                    intermediateFile.add("PUSH " + context.getChild(0).getText() + " " + context.getChild(2).getText());
	                }
	            }
	        } else {
	            System.out.println("ERROR: This assignment is not supported by our grammar.");
	        }
	    }
    
        /* TO DO - Written the code for check-then and until but realised that need to tweak our grammar a little to have a 
         cleaner code  */

}
