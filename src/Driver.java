import gen.PascaletLexer;
import gen.PascaletParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Driver {
    public static void main(String[] args) throws Exception {
        CharStream input = null;

        // File Input
        String filename = "src\\Input.pas";
        File file = new File(filename);
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
            input = CharStreams.fromStream(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PascaletLexer lexer = new PascaletLexer (input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PascaletParser parser = new PascaletParser(tokens);
        ParseTree tree = parser.program();

        PascaletImpl pascaletVisitor = new PascaletImpl();

        Double result = pascaletVisitor.visit(tree);


    }
}