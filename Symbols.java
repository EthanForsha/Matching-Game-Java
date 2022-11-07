import java.util.ArrayList;
import java.util.Stack;

public class Symbols {

    private ArrayList<String> symbols;
    private Stack<String> stack;

    public Symbols(){
        // Creates an ArrayList of characters to use
        symbols = new ArrayList<String>();
        symbols.add("🐕");
        symbols.add("🐈");
        symbols.add("🐅");
        symbols.add("🐎");
        symbols.add("🐖");
        symbols.add("🐇");
        symbols.add("🐄");
        symbols.add("🐓");
        symbols.add("🐕");
        symbols.add("🐈");
        symbols.add("🐅");
        symbols.add("🐎");
        symbols.add("🐖");
        symbols.add("🐇");
        symbols.add("🐄");
        symbols.add("🐓");
    }
    
    // Creates stack of characters in random order from symbols list
    public Stack<String> shuffleSymbols(){
        stack = new Stack<String>();
        for (int count = 0; count < 16; count++){
            int i = (int)Math.random()*(symbols.size());
            stack.add(symbols.get(i));
            symbols.remove(i);
        }
        return stack;
    }

    public String popString(){
        return this.stack.pop();
    }
}

