package java8;

import org.junit.Test;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NashornTest {
    ScriptEngine scriptEngine = null;
    String pathFile = NashornTest.class.getResource("/hello.js").getPath();

    // Example 1
    // Executing JavaScript file in Java Code
    @Test
    public void executingJavaScriptFileInJava() throws FileNotFoundException, ScriptException {
        // Creating script engine
        scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");
        // Reading Nashorn file
        scriptEngine.eval(new FileReader(pathFile));
    }

    // Example 2
    // Embedding JavaScript Code in Java Source File
    @Test
    public void executingJavaScriptInSourceFile() throws FileNotFoundException, ScriptException {
        // Creating script engine
        scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");
        // Evaluating Nashorn code
        scriptEngine.eval("print('Hello Nashorn 1');");
    }

    // Example 3
    // Executing JavaScript file in Java Code
    @Test
    public void settingJavaScriptVariable() throws FileNotFoundException, ScriptException, NoSuchMethodException {
        // Creating script engine
        scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");
        //Binding script and Define scope of script
        Bindings bind = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);
        bind.put("name", "abc");
        // Reading Nashorn file
        scriptEngine.eval(new FileReader(pathFile));
        Invocable invocable = (Invocable)scriptEngine;
        // calling a function
        invocable.invokeFunction("functionDemo1");
        // calling a function and passing variable as well.
        invocable.invokeFunction("functionDemo2","Nashorn");
    }

    // Example 4: Import Java Package in JavaScript File

    // Example 5
    // Calling JavaScript function inside Java code
    @Test
    public void callingJavaScriptFunction() throws FileNotFoundException, ScriptException, NoSuchMethodException {
        // Creating script engine
        ScriptEngine e = new ScriptEngineManager().getEngineByName("Nashorn 1");
        // Reading Nashorn file

        e.eval(new FileReader(pathFile));
        Invocable invocable = (Invocable)scriptEngine;
        // calling a function
        invocable.invokeFunction("functionDemo1");
        // calling a function and passing variable as well.
        invocable.invokeFunction("functionDemo2","Nashorn");
    }
}
