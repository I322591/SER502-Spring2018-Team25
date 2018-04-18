grammar Grammar;


p : K;
K :'start' D';' C 'terminate';
D : 'var' I '=' N ';' D | 'var' I '=' N | 'var' I ';' D | 'var' I  Disp ';' D | Disp;
C: I '=' E ';' C | I '=' E | 'check' B 'then' SB C EB 'otherwise' SB C EB ';' C | 'check' B 'then' SB C EB 'otherwise' SB C EB | 'until' B SB C EB ';' C | 'until' B SB C EB | Disp ';' C | Disp | K ';' C | K;
Disp : 'display' SB I EB | 'display' SB SC S EC EB;
B : 'true' | 'false' | E '==' E | E '<' E | E '>' E | E '<=' E | E '>=' E | 'range' SB T ',' T EB;
E : A '+' E | A '-' E | A;
A : T '/' A | T '*' A | T;
T : N | I;
N : Z V;
V : EM | N V;
EM: '';
Z : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
S : I S | I ' ' S | Cap S | Cap ' ' S | I | Cap;
I : 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z';
Cap : 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z';
SB : '{';
EB : '}';
SC : '“';
EC : '”';
