import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.imageio.IIOException;
import java.io.*;

public class main {
    public static void main(String[] args)  {
        try {
            CharStream input = CharStreams.fromFileName("C:\\Users\\HP\\IdeaProjects\\MAA - coursework\\src\\test.MAA");
             System.out.println(input);

            MAALexer lexer=new MAALexer(input);
            MAAParser parser = new MAAParser(new CommonTokenStream(lexer));

//            parser.addParseListener(new MyListener());
//            parser.program();

            ParseTree tree = parser.program();
//            MyVisitor visitor = new MyVisitor();
//            visitor.visit(tree);
        } catch (IIOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
