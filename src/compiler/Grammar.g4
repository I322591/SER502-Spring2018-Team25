grammar Grammar;


program : block;
block :'start' declaration';' command 'terminate';
declaration : 'var' Identifier '=' number ';' declaration | 'var' Identifier '=' number | 'var' Identifier ';' declaration | 'var' Identifier  disp ';' declaration | disp;
command: Identifier '=' addSubExpression ';' command | Identifier '=' addSubExpression | 'check' bool 'then' StartBrace command EndBrace 'otherwise' StartBrace command EndBrace ';' command | 'check' bool 'then' StartBrace command EndBrace 'otherwise' StartBrace command EndBrace | 'until' bool StartBrace command EndBrace ';' command | 'until' bool StartBrace command EndBrace | disp ';' command | disp | block ';' command | block;
disp : 'display' StartBrace Identifier EndBrace | 'display' StartBrace StartQuotes string EndQuotes EndBrace;
bool : 'true' | 'false' | addSubExpression '==' addSubExpression | addSubExpression '<' addSubExpression | addSubExpression '>' addSubExpression | addSubExpression '<=' addSubExpression | addSubExpression '>=' addSubExpression | 'range' StartBrace term ',' term EndBrace;
addSubExpression : mulDivExpression '+' addSubExpression | mulDivExpression '-' addSubExpression | mulDivExpression;
mulDivExpression : term '/' mulDivExpression | term '*' mulDivExpression | term;
term : number | Identifier;
number : Digit value;
value : Space | number value;
Space: '';
Digit : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
string : Identifier string | Identifier ' ' string | Cap string | Cap ' ' string | Identifier | Cap;
Identifier : 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z';
Cap : 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z';
StartBrace : '{';
EndBrace : '}';
StartQuotes : '“';
EndQuotes : '”';
