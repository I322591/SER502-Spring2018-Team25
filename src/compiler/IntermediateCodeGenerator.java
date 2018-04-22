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
    @Override
    public void enterCheck(RochGrammarParser.CheckContext context) {
        StringBuilder checkStatement = new StringBuilder();
        String operator = context.getChild(1).getChild(1).getText();
        intermediateFile.add("BOOL value");
        checkStatement.append(OperatorRetriever.getOperator(operator));
        checkStatement.append(" value ");
        String leftVar = context.getChild(1).getChild(0).getText()
        checkStatement.append(leftVar).append(" ");
        String rightVar = context.getChild(1).getChild(0).getText()
        checkStatement.append(rightVar);
        intermediateFile.add(checkStatement.toString());
        checkStatement.setLength(0);
        checkStatement.append("CHECK ").append("value");
        intermediateFile.add(checkStatement.toString());
    }

        /* Overriding the default implementation of exitCheckCondition in GrammarBaseListener */
        @Override
        public void exitCheck(RochGrammarParser.CheckContext context) {
            intermediateFile.add("CHECKEND");
        }

        /* Overriding the default implementation of enterOtherwise in GrammarBaseListener */
        @Override
        public void enterOtherwise(RochGrammarParser.OtherwiseContext context) {
            intermediateFile.add("OTHERWISE");
        }
       
        /* Overriding the default implementation of exitOtherwise in GrammarBaseListener */
        @Override
        public void exitOtherwise(RochGrammarParser.OtherwiseContext context) {
            intermediateFile.add("OTHERWISEEND");
        }
       

}
